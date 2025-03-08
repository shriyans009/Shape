// Cylinder.java
class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

}
