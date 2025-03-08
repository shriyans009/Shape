// Shape.java

abstract class Shape {
    protected String shapeName;

    // Constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract methods
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
