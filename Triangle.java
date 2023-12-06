package AreaCalculator;

public class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea(){
        double area = (base * height)/2;
        System.out.println("The area of the triangle is: "+area);
    }
    
}
