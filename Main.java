// Main.java

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        
        if (volumeShape != null) {
            System.out.println("Volume: " + volumeShape.calculateVolume());
        }
    }
}
