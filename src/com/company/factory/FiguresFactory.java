package com.company.factory;

import com.company.design.Ellipse;
import com.company.polymorphism.Circle;
import com.company.polymorphism.interfaces.IGeometry;

/**
  @author   Volodymyr Lakusta
  @project   vsem2
  @class  FiguresFactory
  @version  1.0.0 
  @since 30.03.2021 - 18.11
**/

public class FiguresFactory {

    public static IGeometry create(double radius){
        return new Circle(radius);
    }

    public static IGeometry create(double a, double b){
        return new Ellipse(a,b);
    }

}
