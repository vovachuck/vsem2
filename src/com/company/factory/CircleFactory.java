package com.company.factory;

import com.company.polymorphism.Circle;

/**
  @author   Volodymyr Lakusta
  @project   vsem2
  @class  CircleFactory
  @version  1.0.0 
  @since 30.03.2021 - 18.20
**/

public class CircleFactory {
    public static Circle create(double radius){
        if(radius <= 0){
            return null;
        }
        return new Circle(radius);
    }
}
