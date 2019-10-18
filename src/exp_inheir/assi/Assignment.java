package exp_inheir.assi;

public class Assignment {
    public static void main(String[] args){
        GeometricObject circle = new Circle(3);
        GeometricObject rectangle = new Rectangle(5, 3);

        circle.setColor("red");
        rectangle.setColor("blue");

        displayGeoInfo(circle);
        System.out.println("-------------------");
        displayGeoInfo(rectangle);
        System.out.println("-------------------");
        System.out.println("If the Geo1 is bigger than Geo2");
        if(equalArea(circle, rectangle)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static void displayGeoInfo(GeometricObject Geo){
        System.out.println("Shape: " + Geo.shape);
        System.out.println("Color: " + Geo.color);
        System.out.println("Area: " + Geo.findArea());
        System.out.println("Perimeter: " + Geo.findPerimeter());
    }

    public static boolean equalArea(GeometricObject Geo1, GeometricObject Geo2){
        if(Geo1.findArea() < Geo2.findArea()){
            return false;
        }
        else{
            return true;
        }
    }
}

abstract class GeometricObject{
    protected String color;
    protected String shape;

    //getters&setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    //constructors
    public GeometricObject(String color) {
        this.color = color;
    }

    public GeometricObject(){
        this.color = "white";
    }

    //abstract methods
    public abstract double findArea();
    public abstract double findPerimeter();
}

class Circle extends GeometricObject{
    private double radius;

    public Circle(double _radius){
        this.radius = _radius;
        super.setShape("circle");
    }

    public Circle(){
        this.radius = 1;
        super.setShape("circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius *radius;
    }

    @Override
    public double findPerimeter() {
        return Math.PI * 2.0 * radius;
    }
}

class Rectangle extends GeometricObject{
    private double len;
    private double wid;

    public Rectangle(double _len, double _wid){
        this.len = _len;
        this.wid = _wid;
        super.setShape("rectangle");
    }

    public Rectangle(){
        this.len = 2.0;
        this.wid = 1.0;
        super.setShape("rectangle");
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public double getWid() {
        return wid;
    }

    public void setWid(double wid) {
        this.wid = wid;
    }

    @Override
    public double findArea() {
        return len * wid;
    }

    @Override
    public double findPerimeter() {
        return 2.0 * (len + wid);
    }
}
