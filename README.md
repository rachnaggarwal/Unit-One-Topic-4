# Unit-One-Topic-4
This repository includes my learning on topics Collections, Comparable and Comparator Interfaces, hashcode and equals in Java. Some Basic codes performed on Eclipse are attached in the code section.

### What is Collections?
A collection is a single object managing a group of objects known as its elements. Types of collection
-Set (HashSet, SortedSet, TreeSet)
A set is an unordered collection; no duplicates are permitted in it.
-List (ArrayList, LinkedList)
A list is an ordered collection; duplicates are permitted.
-Deque (ArrayDeque, LinkedList)
-Map (HashMap, TreeMap, LinkedHashMap)
A map object describes mappings from keys to values. Duplicate keys to value is not permitted but values can be duplicated.

### What are Iterators?
Iteration is the process of retrieving every element in a collection. Various methods are hasNext(), next(), remove().

### What is Comparable?
Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name, and price. Comparable provides compareTo() method to sort elements. Comparable is present in **java.lang package**. We can sort the list elements of Comparable type by **Collections.sort(List)** method.

### What is Comparator?
The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc. Comparator provides compare() method to sort elements. A Comparator is present in the **java.util package**. We can sort the list elements of Comparator type by **Collections.sort(List, Comparator)** method.

### Equals() and Hashcode() in Java
The equals() and hashcode() are the two important methods provided by the Object class for comparing objects.
### What is hashcode?
A hashcode is an integer value associated with every object in Java, facilitating the hashing in hash tables.
**Syntax:**
public int hashCode()  
**Returns:**
It returns the hash code value for the given objects.

### What is equals?
The java equals() is a method of lang.Object class, and it is used to compare two objects. To compare two objects that whether they are the same, it compares the values of both the object's attributes. By default, two objects will be the same only if stored in the same memory location.
**Syntax:** public boolean equals(Object obj) 
**Parameter:**
obj: It takes the reference object as the parameter, with which we need to make the comparison.
**Returns:**
It returns the true if both the objects are the same, else returns false.

**Reference: -**
https://www.javatpoint.com/difference-between-comparable-and-comparator
https://drive.google.com/drive/folders/1jS6YPPNjd01MHA_Daam4f8UIj9SvL5pG
https://www.javatpoint.com/equals-and-hashcode-in-java#:~:text=A%20hashcode%20is%20an%20integer,the%20hashing%20in%20hash%20tables.&text=The%20hashcode()%20method%20returns,usually%20returns%20different%20hash%20values.
https://www.javatpoint.com/collections-in-java

