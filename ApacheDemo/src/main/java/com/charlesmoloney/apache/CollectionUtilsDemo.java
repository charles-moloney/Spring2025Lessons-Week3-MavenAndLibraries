package com.charlesmoloney.apache;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

import java.util.Arrays;
import java.util.List;

public class CollectionUtilsDemo {
    public static void run() {
        List<String> a = Arrays.asList("apple", "banana", "cherry");
        List<String> b = Arrays.asList("banana", "dragonfruit", "apple");

        System.out.println("Union: " + CollectionUtils.union(a, b));
        System.out.println("Intersection: " + CollectionUtils.intersection(a, b));
        System.out.println("Disjunction (symmetric diff): " + CollectionUtils.disjunction(a, b));

        // Bag (multiset) usage
        Bag<String> bag = new HashBag<>();
        bag.add("apple", 2);
        bag.add("banana");
        System.out.println("Bag counts: apple=" + bag.getCount("apple") + ", banana=" + bag.getCount("banana"));
    }
}
