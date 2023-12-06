package AreaCalculator;

public class Trapezoid extends Shape{

   private double firstbase;
   private double secondbase;
   private  double traheight;

   Trapezoid(double firstbase, double secondbase, double traheight){
    this.firstbase = firstbase;
    this.secondbase = secondbase;
    this.traheight = traheight;
   }

   @Override
   public void calculateArea(){
    double area = ((firstbase + secondbase)/ 2)* traheight;
    System.out.println("The  area of the trapezoid is :"+area);
   }

}
