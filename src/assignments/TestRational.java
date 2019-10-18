package assignments;

public class TestRational {
    public static void main(String[] args){
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(10, 6);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.sub(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.mul(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.div(r2));
    }
}
