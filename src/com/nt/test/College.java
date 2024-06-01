package com.nt.test;

import com.nt.Factory.PersonFactory;
import com.nt.comp.Person;

public class College {
    public static void main(String[] args) {
        // College needs students
        Person per = PersonFactory.getPerson("stud");
        per.work();
    }
}



/*
 * made code loose coupled
 *  using factory class
 * */
