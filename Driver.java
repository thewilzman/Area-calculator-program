package AreaCalculator;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Array to store different shapes
        Shape [] shapes = new Shape[7];
        shapes [0] = new Square(0); //Placeholder
        shapes [1] = new Rectangle(0, 0);
        shapes [2] =new Circle(0);
        shapes [3] = new Triangle(0, 0);
        shapes [4] = new Trapezoid(0, 0, 0);
        shapes [5] = new Parallelogram(0, 0);
        shapes [6] = new Ellipse(0, 0);


        //variable for user choice
        int choice;

        // Main Program loop
        do{
            //Display menu for shape selection
            System.out.println("Choose a shape to calculate  its  area: ");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Triangle");
            System.out.println("5. Trapezoid");
            System.out.println("6. Parallelogram");
            System.out.println("7. Ellipse");
            System.out.println("8. exit");

            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            // Switch statement for user choice
            switch (choice) {
                case 1:

                double side = getDimension("Enter the length of the square: ");
                shapes[0] = new Square(side);
                    
                    break;
                case 2:
                double length = getDimension("Enter the length of the Rectangle: ");
                double width = getDimension("Enter the width of the width");
                shapes[1] = new Rectangle(length, width);
                    break;

                case 3:
                double radius = getDimension("Enter the radius of the circle :");
                shapes [2] = new Circle(radius);

                    break;
                case 4:
                double base = getDimension("Enter the base of the triangle :");
                double height = getDimension("Enter the height of the triangle:");
                shapes[3] = new Triangle(base, height);
                    break;
                case 5:
                double firstbase = getDimension("Enter the length of the first base:");
                double secondbase = getDimension("Enter the length of the second base");
                double traheight = getDimension("Enter the height :");
                shapes [4] = new Trapezoid(firstbase, secondbase, traheight);
                    
                    break;

                case 6:
                double parbase = getDimension("enter the length of the base :");
                double parheight = getDimension("Enter the height : ");
                shapes [5] = new Parallelogram(parbase, parheight);
                    break;

                case 7:
                double axis = getDimension("Enter the axis of the ellipse: ");
                double basis = getDimension("Enter the basis of the ellipse: ");
                shapes [6] = new Ellipse(axis, basis);
                    break;

                case 8:
                System.out.println("Exiting the program.");
                    break;
            
                default:
                System.out.println("Invalid choice. Please enter a valid option. ");

                    break;
            }

                // check if the user chose to exit
            if (choice != 8){
                // calculate and display the area of the selected shape
                    shapes[choice - 1].calculateArea();
                }
            


        }while (choice != 8);
        //close the scanner
        scanner.close();


    }
    // Helper method to get user input for dimensions
    private static double getDimension(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextDouble();
        
    }
    

}


