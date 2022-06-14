package waysToUseCollectionsFrameworks;

import java.util.*;

public class collectionsClass {

    public static void main(String[] args) {

//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();

    }
//Iteration methods used in the setDemo will work in listDemo and queueDemo. Iteration methods for maps can be found
//                                                                           in the mapDemo method.
    public static void setDemo(){

        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//basic functions
        System.out.println(fruit.size());
        System.out.println(fruit);

//while loop in action
        var i = fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

//for loop in action
        for (String item: fruit){
            System.out.println(item);
        }

//forEach function
//you could also use this:     fruit.forEach(System.out::println);
//this is the use of a lambda expression
        fruit.forEach(x -> System.out.println(x));



    }

    public static void listDemo(){

        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//basic functions
        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);

    }

    public static void queueDemo(){

        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//basic functions
        System.out.println(fruit.size());
        System.out.println(fruit);

    }

    public static void mapDemo(){

    Map<String, Integer> fruitCalories = new HashMap();
    fruitCalories.put("apple", 95);
    fruitCalories.put("lemon", 20 );
    fruitCalories.put("banana", 105 );
    fruitCalories.put("orange", 45 );
    fruitCalories.put("lemon", 17 );

//        System.out.println(fruitCalories.size());
//        System.out.println(fruitCalories);
//
//        System.out.println(fruitCalories.get("lemon"));
//
//        System.out.println(fruitCalories.entrySet());
//
//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories);

//iteration methods for hash maps
    for(var entry: fruitCalories.entrySet()){
        System.out.println(entry.getValue());
    }

//    fruitCalories.forEach((k,v) -> System.out.println("Fruit: " + k + ", Calories: " + v));

    }
}

