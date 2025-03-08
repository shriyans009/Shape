// Sphere.java
class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }
}
