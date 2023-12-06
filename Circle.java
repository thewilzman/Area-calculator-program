package AreaCalculator;

public class Circle extends Shape{

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: "+area);
    }
}
