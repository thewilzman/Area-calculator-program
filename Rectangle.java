package AreaCalculator;

public class Rectangle extends Shape{

    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void calculateArea(){
        double area = length * width;
        System.out.println("The Area of the Rectangle is: "+area);
    }
    
}
