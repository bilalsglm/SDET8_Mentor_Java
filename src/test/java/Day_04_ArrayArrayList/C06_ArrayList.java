package Day_04_ArrayArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class C06_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers =new ArrayList<>();
        ArrayList<String> fruits =new ArrayList<>();

        // add()
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Banana");
        System.out.println("fruits = " + fruits);

        fruits.add(0,"AtIndex 1");
        System.out.println("fruits = " + fruits);

        //get
        System.out.println("fruits.get(o) = " + fruits.get(0));
        System.out.println("fruits.get(o) = " + fruits.get(1));
        System.out.println("fruits.get(o) = " + fruits.get(2));

        //set
        fruits.set(2,"Orenge");
        System.out.println("fruits = " + fruits);

        //remove an item

       // fruits.remove(1);
        System.out.println("fruits = " + fruits);

        fruits.remove("Orange");
        System.out.println("fruits = " + fruits);

       // fruits.removeAll(fruits);
       // System.out.println("fruits = " + fruits);

       // fruits.clear();
        System.out.println("fruits = " + fruits);

        //Array de lenght ----- ArrayList de size

        System.out.println("fruits.size() = " + fruits.size());

        // sort
        Collections.sort(fruits);
        System.out.println("fruits = " + fruits);


    }
}
