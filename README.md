# Project [NAME]

[NAME] is a project born out of curiosity. This project currently consists of custom collectors and Convenience Factory Methods for Collections [(JEP 269)]. I haven't thought what to add next but I will update README if I add any new things to it.

So what is this project essentially? This project currently has 2 pieces of cake:
  - Custom Collectors (Here are all [Collectors].)
  - Convenience Factory Methods for Collections

Let us understand them one by one.

### Custom Collectors:
 1. Collections with initial capacity and Comparator.
    * With this Custom Collectors you can collect data in Collection with initial capacity and comparator(TreeSet). Below are few samples of it.
          ```
           List<String> names = people.stream()
                                      .map(Person::getName)
                                      .collect(toArrayList(20));
           
           List<String> names = people.stream()
                                      .map(Person::getName)
                                      .collect(toVector(20));
           
           Set<String> names = people.stream()
                                     .map(Person::getName)
                                     .collect(toHashSet(20));
           
           Set<String> names = people.stream()
                                     .map(Person::getName)
                                     .collect(toLinkedHashSet(20));
           
           NavigableSet<String> names = people.stream()
                                              .map(Person::getName)
                                              .collect(toTreeSet(String::compareTo))
          ```

 2. Google Guava Collections.
    * With this Custom Collectors you can collect data in Google Guava Collections. Below are few samples of it.
        ```
           ImmutableList<String> immutableList = people.stream()
                                                       .map(Person::getName)
                                                       .collect(toImmutableList());
           
           ImmutableSet<String> immutableSet = people.stream()
                                                     .map(Person::getName)
                                                     .collect(toImmutableSet());
           
           ImmutableSortedSet<String> immutableSortedSet = people.stream()
                                                                 .map(Person::getName)
                                                                 .collect(toImmutableSortedSet());
           
           ImmutableSortedSet<String> immutableSortedSet =people.stream()
                                                                .map(Person::getName)
                                                                .collect(toImmutableSortedSetReverse());
           
           ImmutableMap<Integer, Entry<Integer, String>> immutableMap = map.entrySet()
                                                                           .stream()
                                                                           .collect(toImmutableMap(k -> k.getKey()));
           
           ImmutableMap<Integer, String> immutableMap = map.entrySet()
                                                           .stream()
                                                           .collect(toImmutableMap(
                                                                                k -> k.getKey(), 
                                                                                v -> v.getValue()));
          ```
          
### Convenience Factory Methods for Collections:
 1. Factory methods for creating ```List```.
    * ```Lists.of()``` returns a ```List<>```
        ```
        //returns immutable list containing no or zero(0) elements.
        List<Integer> list = Lists.of();
        
        //returns immutable list containing 1 element.
        List<Integer> list = Lists.of(1);
        
        //returns immutable list containing 2 elements.
        List<Integer> list = Lists.of(1, 2);
        
        .. and so on.
        
        ```
 2. Factory methods for creating ```Set```.
    * ```Sets.of()``` returns ```HashSet<>```
        ```
        //returns immutable set containing no or zero(0) elements.
        Set<Integer> set = Sets.of()
       
        //returns immutable set containing 1 element.
        Set<Integer> set = Sets.of(1);
        
        //returns immutable set containing 2 elements.
        Set<Integer> set = Sets.of(1, 2);
        
        .. and so on.
        ```
    * ```Sets.ofOrdered()``` returns ```LinkedHashSet<>```
        ```
        //returns immutable set containing no or zero(0) elements.
        Set<Integer> set = Sets.ofOrdered()
       
        //returns immutable set containing 1 element.
        Set<Integer> set = Sets.ofOrdered(1);
        
        //returns immutable set containing 2 elements.
        Set<Integer> set = Sets.ofOrdered(1, 2);
        
        .. and so on.
        ```
    * ```Sets.ofSorted()``` returns ```TreeSet<>```
       ```
        //returns immutable set containing no or zero(0) elements.
        Set<Integer> set = Sets.ofSorted()
       
        //returns immutable set containing 1 element.
        Set<Integer> set = Sets.ofSorted(1);
        
        //returns immutable set containing 2 elements.
        Set<Integer> set = Sets.ofSorted(1, 2);
        
        .. and so on.
        ```

### Convenience Factory Methods for Map:
 1. Factory methods for creating ```Map```.
    * ```Maps.of()``` returns ```HashMap<>```
      ```
      //returns immutable map containing no or zero(0) entries.
      Map<Integer, Integer> map = Maps.of();
      
      //returns immutable map containing 1 entry.
      Map<Integer, Integer> map = Maps.of(1, 1);
      ```
    * ```Maps.ofOrdered()``` returns ```LinkedHashMap<>```
       ```
      //returns immutable map containing no or zero(0) entries.
      Map<Integer, Integer> map = Maps.ofOrdered();
      
      //returns immutable map containing 1 entry.
      Map<Integer, Integer> map = Maps.ofOrdered(1, 1);
       ```
    * ```Maps.ofSorted()``` returns ```TreeMap<>```
       ```
      //returns immutable map containing no or zero(0) entries.
      Map<Integer, Integer> map = Maps.ofSorted();
      
      //returns immutable map containing 1 entry.
      Map<Integer, Integer> map = Maps.ofSorted(1, 1);
       ```
       
   * ```Maps.ofEntries``` returns ```HashMap<>```.
      ```
      Map<Character, Integer> map = Maps.ofEntries(Maps.entry('A', 65), Maps.entry('B', 66), Maps.entry('C', 67));
      Map<Character, Integer> map = Maps.ofOrderedEntries(Maps.entry('A', 65), Maps.entry('B', 66), Maps.entry('C', 67));
      Map<Character, Integer> map = Maps.ofSortedEntries(Maps.entry('A', 65), Maps.entry('B', 66), Maps.entry('C', 67));
      ```


   [(JEP 269)]: <http://openjdk.java.net/jeps/269>
   [Collectors]: <https://github.com/savanibharat/custom-collectors/blob/master/src/main/java/com/codingopus/collectors/CustomCollectors.java>
   [ReadMe Guide]: <https://guides.github.com/features/mastering-markdown/>
  
