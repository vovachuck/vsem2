package com.company.polymorphism;
/**
 @author   Volodymyr Lakusta
 @project   vsem2
 @class  Cirlce
 @version  1.0.0
 @since 30.03.2021 - 14.42
 **/

import com.company.polymorphism.interfaces.IGeometry;
import com.company.polymorphism.interfaces.IPacking;

import java.awt.image.ImageProducer;
import java.util.Objects;


public class Circle implements IGeometry, IPacking {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){

        return this.radius * 2;
    }

    public double getAreaOfSector(double sectorAngleInRadians){

        double angleInDegrees = Math.toDegrees(sectorAngleInRadians);

        return getArea() * angleInDegrees / 360;
    }

    public double getChordLength(double angleInRadians){

        double angleInDegrees = Math.toDegrees(angleInRadians);

        return 2 * this.radius * Math.sin(angleInDegrees/2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public double getPerimeter() {
        return Math.PI * getDiameter();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
    @Override
    public String toJSON() {
        String json = "Circle" + "{" +
                "\"radius\"" + ":" + "\"" + this.getRadius() +"\"" +
                "}";

        return json;
    }

    @Override
    public String toXML() {
        String xml = "<Circle>" +
                " + <radius> " + this.getRadius() + "</radius>" +
                "</Circle>";
        return xml;
    }
}
