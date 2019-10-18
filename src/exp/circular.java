package exp;

public class circular {
    private Test_circle bottom;
    private int height;

    public circular(Test_circle _bottom, int _height){
        this.bottom = _bottom;
        this.height = _height;
    }

    public double getVolume(){
        return this.bottom.getArea() * this.height / 3.0;
    }

    public Test_circle getBottom() {
        return bottom;
    }

    public void setBottom(Test_circle bottom) {
        this.bottom = bottom;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args){
        circular cir = new circular(new Test_circle(2), 3);
        System.out.println(cir.getVolume());
    }
}
