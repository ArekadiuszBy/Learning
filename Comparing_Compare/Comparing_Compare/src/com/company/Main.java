package com.company;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Sortowanie string
        String i = "ABCDE";
        char[] x = i.toCharArray();
        for(int a=x.length-1;a>=0;a--){
            System.out.print(x[a]);
        }

        System.out.println("");
        //Sortowanie listy

        List<Person> list = new ArrayList<>();

        list.add(new Person("A", "B", 1));
        list.add(new Person("X","Y", 32));
        list.add(new Person("O","I",2));

        list.sort((o1, o2) -> Integer.compare(o1.getLiczba(), o2.getLiczba()));
        System.out.println(list);
        System.out.println("");
        list.sort(new PersonAgeComparator());
        System.out.println(list);


    }
}
