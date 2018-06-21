#!/usr/bin/env bash
################################################################################
#
# This script verifies that all bugs for a given project are reproducible and
# that the provided information about triggering tests is correct.
#
# Examples for Lang:
#   * Verify all bugs:         ./test_verify_bugs.sh -pLang
#   * Verify bugs 1-10:        ./test_verify_bugs.sh -pLang -b1..10
#   * Verify bugs 1 and 3:     ./test_verify_bugs.sh -pLang -b1 -b3
#   * Verify bugs 1-10 and 20: ./test_verify_bugs.sh -pLang -b1..10 -b20
#
################################################################################
# Import helper subroutines and variables, and init Defects4J
source test.include

# Print usage message and exit
usage() {
    local known_pids=$(cd "$BASE_DIR"/framework/core/Project && ls *.pm | sed -e 's/\.pm//g')
    echo "usage: $0 -p <project id> [-b <bug id> ... | -b <bug id range> ... ]"
    echo "Project ids:"
    for pid in $known_pids; do
        echo "  * $pid"
    done
    exit 1
}

# Check arguments
while getopts ":p:b:" opt; do
    case $opt in
        p) PID="$OPTARG"
            ;;
        b) if [[ "$OPTARG" =~ ^[0-9]*\.\.[0-9]*$ ]]; then
                BUGS="$BUGS $(eval echo {$OPTARG})"
           else
                BUGS="$BUGS $OPTARG"
           fi
            ;;
        \?)
            echo "Unknown option: -$OPTARG" >&2
            usage
            ;;
        :)
            echo "No argument provided: -$OPTARG." >&2
            usage
            ;;
  esac
done

if [ "$PID" == "" ]; then
    usage
fi

if [ ! -e "$BASE_DIR/framework/core/Project/$PID.pm" ]; then
    usage
fi

init

# Run all bugs, unless otherwise specified
if [ "$BUGS" == "" ]; then
    num_bugs=$(num_lines $BASE_DIR/framework/projects/$PID/commit-db)
    BUGS="$(seq 1 1 $num_bugs)"
fi

# Create log file
script_name=$(echo $script | sed 's/\.sh$//')
LOG="$TEST_DIR/${script_name}$(printf '_%s_%s' $PID $$).log"

################################################################################
# Run developer-written tests on all buggy and fixed program versions, and 
# verify trigger tests
################################################################################

# Reproduce all bugs (and log all results), regardless of whether errors occur
HALT_ON_ERROR=0

test_dir="$TMP_DIR/test_trigger"
mkdir -p $test_dir

work_dir="$test_dir/$PID"
# Clean working directory
rm -rf $work_dir
for bid in $(echo $BUGS); do
    for v in "b" "f"; do
        vid=${bid}$v
        defects4j checkout -p $PID -v "$vid" -w "$work_dir" || die "checkout: $PID-$vid"
        defects4j compile -w "$work_dir" || die "compile: $PID-$vid"
        defects4j test -r -w "$work_dir" || die "run relevant tests: $PID-$vid"

        triggers=$(num_triggers "$work_dir/failing_tests")
        # Expected number of failing tests for each fixed version is 0!
        if [ $v == "f" ]; then
            [ $triggers -eq 0 ] \
                    || die "verify number of triggering tests: $PID-$vid (expected: 0, actual: $triggers)"
            continue
        fi

        # Expected number of failing tests for each buggy version is equal
        # to the number of provided triggering tests
        expected=$(num_triggers "$BASE_DIR/framework/projects/$PID/trigger_tests/$bid")
        [ $triggers -eq $expected ] \
                || die "verify number of triggering tests: $PID-$vid (expected: $expected, actual: $triggers)"
        for t in $(get_triggers "$BASE_DIR/framework/projects/$PID/trigger_tests/$bid"); do
            grep -q "$t" "$work_dir/failing_tests" || die "verify name of triggering tests ($t not found)"
        done
    done
done
rm -rf $work_dir
HALT_ON_ERROR=1

# Print a summary of what went wrong
if [ $ERROR != 0 ]; then
    printf '=%.s' $(seq 1 80) 1>&2
    echo 1>&2
    echo "The following errors occurred:" 1>&2
    cat $LOG 1>&2
fi

# Indicate whether an error occurred
exit $ERROR
