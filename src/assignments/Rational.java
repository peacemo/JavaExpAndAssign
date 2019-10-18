package assignments;

public class Rational {
    private long numerator;
    private long denominator;

    //constructors
    public Rational(long _numerator, long _denominator){  //constructor
        long gcd = gcd(_numerator, _denominator);
        this.numerator = _numerator / gcd;
        this.denominator = _denominator / gcd;  //约分
    }

    public Rational(){  //constructor
        this(0, 1);
    }
    //end

    private long gcd(long a, long b){ //gcd
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }

    //getter and setter
    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }
    //end

    //member func
    public Rational add(Rational secondRational){
        long num = numerator * secondRational.getDenominator() + secondRational.getNumerator() * denominator;
        long den = denominator * secondRational.getDenominator();
        return new Rational(num, den);
    }//add

    public Rational sub(Rational secondRational){
        long num = numerator * secondRational.getDenominator() - secondRational.getNumerator() * denominator;
        long den = denominator * secondRational.getDenominator();
        return new Rational(num, den);
    }//sub

    public Rational mul(Rational secondRational){
        long num = numerator * secondRational.getNumerator();
        long den = denominator * secondRational.getDenominator();
        return new Rational(num, den);
    }//mul

    public Rational div(Rational secondRational){
        long num = numerator * secondRational.getDenominator();
        long den = denominator * secondRational.getNumerator();
        return new Rational(num, den);
    }//div
    //end

    public String toString(){
        if(denominator == 1)
            return numerator + "";
        return numerator + "/" + denominator;
    }//toString

}
