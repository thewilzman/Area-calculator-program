package AreaCalculator;

public class Ellipse extends Shape {

    private double axis;
    private double basis;

    Ellipse(double axis, double basis){
        this.axis = axis;
        this.basis = basis;
    }

    public void calculateArea(){
        double area = Math.PI * axis * basis;
        System.out.println("The area of this ellipse is :"+ area);
        
    }


    
}
