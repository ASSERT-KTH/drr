/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.compare;

import java.util.Collection;
import java.util.Comparator;

/**
 * Provides convenient static utility methods for <Code>Comparator</Code>
 * objects.
 * <p>
 * Most of the functionality in this class can also be found in the 
 * <code>comparators</code> package. This class merely provides a 
 * convenient central place if you have use for more than one class
 * in the <code>comparators</code> subpackage.
 *
 * @since Commons Collections 2.1
 * @version $Revision$ $Date$
 */
public class ComparatorUtils {

    /**
     * ComparatorUtils should not normally be instantiated.
     */
    public ComparatorUtils() {
    }

    /**
     * Comparator for natural sort order.
     *
     * @see ComparableComparator#getInstance
     */
    @SuppressWarnings("unchecked")
    public static final Comparator NATURAL_COMPARATOR = ComparableComparator.<Comparable>comparableComparator();

    /**
     * Gets a comparator that uses the natural order of the objects.
     *
     * @return  a comparator which uses natural order
     */
    @SuppressWarnings("unchecked")
    public static <E extends Comparable<? super E>> Comparator<E> naturalComparator() {
        return NATURAL_COMPARATOR;
    }

    /**
     * Gets a comparator that compares using two {@link Comparator}s.
     * <p>
     * The second comparator is used if the first comparator returns equal.
     *
     * @param comparator1  the first comparator to use, not null
     * @param comparator2  the first comparator to use, not null
     * @return a {@link ComparatorChain} formed from the two comparators
     * @throws NullPointerException if either comparator is null
     * @see ComparatorChain
     */
    @SuppressWarnings("unchecked")
    public static <E extends Comparable<? super E>> Comparator<E> chainedComparator(Comparator<E> comparator1, Comparator<E> comparator2) {
        return chainedComparator(new Comparator[] {comparator1, comparator2});
    }

    /**
     * Gets a comparator that compares using an array of {@link Comparator}s, applied
     * in sequence until one returns not equal or the array is exhausted.
     *
     * @param comparators  the comparators to use, not null or empty or containing nulls
     * @return a {@link ComparatorChain} formed from the input comparators
     * @throws NullPointerException if comparators array is null or contains a null
     * @see ComparatorChain
     */
    public static <E extends Comparable<? super E>> Comparator<E> chainedComparator(Comparator<E>[] comparators) {
        ComparatorChain<E> chain = new ComparatorChain<E>();
        for (int i = 0; i < comparators.length; i++) {
            if (comparators[i] == null) {
                throw new NullPointerException("Comparator cannot be null");
            }
            chain.addComparator(comparators[i]);
        }
        return chain;
    }

    /**
     * Gets a comparator that compares using a collection of {@link Comparator}s,
     * applied in (default iterator) sequence until one returns not equal or the 
     * collection is exhausted.
     *
     * @param comparators  the comparators to use, not null or empty or containing nulls
     * @return a {@link ComparatorChain} formed from the input comparators
     * @throws NullPointerException if comparators collection is null or contains a null
     * @throws ClassCastException if the comparators collection contains the wrong object type
     * @see ComparatorChain
     */
    @SuppressWarnings("unchecked")
    public static <E extends Comparable<? super E>> Comparator<E> chainedComparator(Collection<Comparator<E>> comparators) {
        return chainedComparator(
            (Comparator<E>[]) comparators.toArray(new Comparator[comparators.size()])
        );
    }

    /**
     * Gets a comparator that reverses the order of the given comparator.
     *
     * @param comparator  the comparator to reverse
     * @return  a comparator that reverses the order of the input comparator
     * @see ReverseComparator
     */
    public static <E> Comparator<E> reversedComparator(Comparator<E> comparator) {
        return new ReverseComparator<E>(comparator);
    }

    /**
     * Gets a Comparator that controls the comparison of <code>null</code> values.
     * <p>
     * The returned comparator will consider a null value to be less than
     * any nonnull value, and equal to any other null value.  Two nonnull
     * values will be evaluated with the given comparator.
     *
     * @param comparator the comparator that wants to allow nulls
     * @return  a version of that comparator that allows nulls
     * @see NullComparator
     */
    @SuppressWarnings("unchecked")
    public static <E> Comparator<E> nullLowComparator(Comparator<E> comparator) {
        if (comparator == null) {
            comparator = NATURAL_COMPARATOR;
        }
        return new NullComparator<E>(comparator, false);
    }

    /**
     * Gets a Comparator that controls the comparison of <code>null</code> values.
     * <p>
     * The returned comparator will consider a null value to be greater than
     * any nonnull value, and equal to any other null value.  Two nonnull
     * values will be evaluated with the given comparator.
     *
     * @param comparator the comparator that wants to allow nulls
     * @return  a version of that comparator that allows nulls
     * @see NullComparator
     */
    @SuppressWarnings("unchecked")
    public static <E> Comparator<E> nullHighComparator(Comparator<E> comparator) {
        if (comparator == null) {
            comparator = NATURAL_COMPARATOR;
        }
        return new NullComparator<E>(comparator, true);
    }

    /**
     *  Returns the smaller of the given objects according to the given 
     *  comparator, returning the second object if the comparator
     *  returns equal.
     * 
     *  @param o1  the first object to compare
     *  @param o2  the second object to compare
     *  @param comparator  the sort order to use
     *  @return  the smaller of the two objects
     */
    @SuppressWarnings("unchecked")
    public static <E> E min(E o1, E o2, Comparator<E> comparator) {
        if (comparator == null) {
            comparator = NATURAL_COMPARATOR;
        }
        int c = comparator.compare(o1, o2);
        return (c < 0) ? o1 : o2;
    }

    /**
     *  Returns the larger of the given objects according to the given 
     *  comparator, returning the second object if the comparator 
     *  returns equal.
     * 
     *  @param o1  the first object to compare
     *  @param o2  the second object to compare
     *  @param comparator  the sort order to use
     *  @return  the larger of the two objects
     */
    @SuppressWarnings("unchecked")
    public static <E> E max(E o1, E o2, Comparator<E> comparator) {
        if (comparator == null) {
            comparator = NATURAL_COMPARATOR;
        }
        int c = comparator.compare(o1, o2);
        return (c > 0) ? o1 : o2;
    }
    
}
