package assignments;

public class Circle {
    private int radius;
    private static int counter;

    public Circle(int _radius){
        this.radius = _radius;
    }
    public Circle(){
        this(1);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public static void printCircle(Circle c){
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
    }

    public static void main(String[] args){
        Circle[] circleArray = new Circle[5];

        for(int i = 0; i < 5; i++){
            circleArray[i] = new Circle(i+1);
            Circle.counter++;
            System.out.println("Circle" + (i+1) + ": ");
            printCircle(circleArray[i]);
            System.out.println("********************\n");
        }//for
        System.out.println("Count: " + Circle.counter);
    }//main
}
