package exp;

public class Test_circle {
    private int radius;
    private static int number;

    public Test_circle(int _radius){  //带参构造
        this.radius = _radius;
    }
    public Test_circle(){  //无参构造
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

    public static void main(String[] args){
        Test_circle[]circle = new Test_circle[10];

        for(int i = 0; i<10; i++){
            circle[i] = new Test_circle(i + 1);
            System.out.println(circle[i].getArea());
        }//for
    }//main
}
