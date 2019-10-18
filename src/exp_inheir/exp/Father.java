package exp_inheir.exp;

public class Father {
    public Father(){
        System.out.println("Father Constructor");
    }

    public void speak(){
        System.out.println("Father speak");
    }

    public static void main(String[] args){
        Son1 s1 = new Son1();
        Father dad = new Son1();
        dad.speak();  //从最下层子类开始寻找speak方法
        if (dad instanceof Son1) {
            ((Son1) dad).playFootball();  //强转
        }

        dad = new Son2();
        if (dad instanceof Son2){
            ((Son2)dad).playPiano();
        }

    }
}

class Son1 extends Father{
    public Son1() {
        System.out.println("Son1 Constructor");
    }

    public void speak(){
        System.out.println("Son1 speak");
    }

    public void playFootball(){
        System.out.println("Son1 plays football");
    }
}

class Son2 extends Father{
    public void speak(){
        System.out.println("Son2 speak");
    }

    public void playPiano(){
        System.out.println("Son2 plays Piano");
    }
}