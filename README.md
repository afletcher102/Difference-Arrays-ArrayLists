# Difference-Arrays-ArrayLists

## Overview
This project demonstrates the conceptual and practical differences between **Arrays** and **ArrayLists** in Java.

## How to Run
1. Clone this repository
2. Open `Main.java` in your IDE
3. Compile and run

   In Java, both Arrays and ArrayLists are used to store collections of data, but they serve different architectural needs. An Array is a native, fixed-size data structure. Once initialized, its length cannot be changed. This makes it memory-efficient and fast for random access, but rigid if the data set grows dynamically.

In contrast, an ArrayList is part of the Java Collections Framework and acts as a dynamic wrapper around a standard array. It can resize itself automatically as elements are added or removed. While this flexibility is convenient, it carries a slight performance overhead because, internally, the ArrayList must occasionally create a new, larger array and copy old elements into it when capacity is reached.

References
GeeksforGeeks. (2026, January 10). ArrayList vs Array in Java. https://www.geeksforgeeks.org/arraylist-vs-arrays-in-java/

Oracle. (n.d.). Class ArrayList<E>. https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

W3Schools. (n.d.). Java ArrayList. https://www.w3schools.com/java/java_arraylist.asp
