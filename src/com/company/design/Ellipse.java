package com.company.design;

import com.company.polymorphism.interfaces.IGeometry;

/**
  @author   Volodymyr Lakusta
  @project   vsem2
  @class  Ellipse
  @version  1.0.0 
  @since 30.03.2021 - 18.14
**/

public class Ellipse implements IGeometry {
    private double firstRadius;
    private double secondRadius;

    public Ellipse(double firstRadius, double secondRadius) {
        this.firstRadius = firstRadius;
        this.secondRadius = secondRadius;
    }

    public double getFirstRadius() {
        return firstRadius;
    }

    public void setFirstRadius(double firstRadius) {
        this.firstRadius = firstRadius;
    }

    public double getSecondRadius() {
        return secondRadius;
    }

    public void setSecondRadius(double secondRadius) {
        this.secondRadius = secondRadius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
