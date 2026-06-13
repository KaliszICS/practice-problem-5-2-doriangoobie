public class Circle {

    protected double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double diameter() {
        return 2 * this.radius;
    }

    public double perimeter() {
        return 2 * this.radius * Math.PI;
    }

    public double area() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}

