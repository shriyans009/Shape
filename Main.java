// Main.java
// Name: Shriyans Sahoo
// PRN: 23070126125
// Batch: AIML-B2

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose a Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scan.nextInt();
            Shape shape = null;
            Volume volumeShape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scan.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter side: ");
                    double side = scan.nextDouble();
                    shape = new Square(side);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    radius = scan.nextDouble();
                    shape = new Sphere(radius);
                    volumeShape = (Volume) shape;
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    radius = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scan.nextDouble();
                    shape = new Cylinder(radius, height);
                    volumeShape = (Volume) shape;
                    break;
                case 6:
                    System.out.print("Enter base side: ");
                    double baseSide = scan.nextDouble();
                    System.out.print("Enter height: ");
                    height = scan.nextDouble();
                    shape = new EquilateralPyramid(baseSide, height);
                    volumeShape = (Volume) shape;
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());

            if (volumeShape != null) {
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
        }
    }
}
