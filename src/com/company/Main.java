package com.company;

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
    }
}
