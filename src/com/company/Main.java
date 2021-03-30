package com.company;

import com.company.builder.Student;
import com.company.design.Ellipse;
import com.company.factory.CircleFactory;
import com.company.factory.Figures;
import com.company.factory.FiguresFactory;
import com.company.polymorphism.Circle;
import com.company.polymorphism.interfaces.IGeometry;

public class Main {

    public static void main(String[] args) {

        Circle circle = CircleFactory.create(10);
        IGeometry ellipse = (Ellipse) FiguresFactory.create(10,5);

        Student vova = new Student.Builder()
                .setFirstName("Volodymyr")
                .setLastName("Lakusta")
                .setGender("male")
                .build();

        Student vasya = new Student.Builder()
                .setFirstName("Vasya")
                .setLastName("Petrov")
                .setGender("male")
                .build();

        System.out.println(vova);
        System.out.println(vasya);
    }
}
