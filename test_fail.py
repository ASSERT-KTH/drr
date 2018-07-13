#!/usr/bin/python
import sys, os, subprocess,fnmatch,csv


if __name__ == '__main__':
    for i in range(4,17):
        os.system('./failing_tests.py patch-Time-'+str(i)+ '-ACS.patch correct EMSE18 evosuite fixed')







