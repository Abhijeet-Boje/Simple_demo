package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        List<Integer> roll_no=new ArrayList<>();

        roll_no.add(1);
        roll_no.add(2);
        roll_no.add(3);

        //roll_no.forEach(System.out::println);

        Stream<Integer> stream =roll_no.stream();

        Stream<Integer> filtered = stream.filter(age-> age>1);

        filtered.forEach(System.out::println);
    }
}
