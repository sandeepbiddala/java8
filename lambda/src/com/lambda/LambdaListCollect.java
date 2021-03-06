package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class LambdaListCollect {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Sara",'F',20),
                                            new Person("Sara",'F',22),
                                            new Person("Bob",'M',20),
                                            new Person("Paula",'F',32),
                                            new Person("Paul",'M',32),
                                            new Person("Jack",'M',2),
                                            new Person("Jack",'M',72),
                                            new Person("Jill",'F',12));

        System.out.println(people.stream().
                                collect(toMap(person-> person.getName()+"_"+person.getAge(),
                                                person ->person.toString() )));

    }
}


