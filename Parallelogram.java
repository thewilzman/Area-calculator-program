package AreaCalculator;

public class Parallelogram extends Shape{

    private double parbase;
    private double parheight;

    Parallelogram(double parbase, double parheight){
        this.parbase = parbase;
        this.parheight = parheight;

    }
    @Override
    public void calculateArea(){
        double area = parbase * parheight;
        System.out.println("The area of the paralellogram is :"+area);

    }


    
}

