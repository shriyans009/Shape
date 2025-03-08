// Square.java
class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }
    @Override
    double calculateArea() {
        return side * side;
    }
}
