package AreaCalculator;

public class Square extends Shape{

    private double side;
    Square(double side){
        this.side = side;
    }
    
    @Override
    public void calculateArea(){
        double area = side * side;
        System.out.println("The Area of the  square is :"+area);
    }
    
    
}
