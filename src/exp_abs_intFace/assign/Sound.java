package exp_abs_intFace.assign;
import java.util.Scanner;

interface Soundable {
    void sound();
    void adjustSound();
}

class Radio implements Soundable {
    public void sound(){
        System.out.println("Radio is playing!");
    }

    public void adjustSound(){
        System.out.println("The sound is lower now!");
    }
}

class WalkMan implements Soundable {
    public void sound(){
        System.out.println("Walkman is playing!");
    }

    public void adjustSound(){
        System.out.println("The sound is lower now!");
    }
}

class MobilePhone implements Soundable {
    public void sound(){
        System.out.println("MobilePhone is playing!");
    }

    public void adjustSound(){
        System.out.println("The sound is lower now!");
    }
}
public class Sound {
    public static void main(String[] args){
        Soundable device;
        Scanner reader = new Scanner(System.in);
        int choice = 0;

        System.out.println("Please choose a device to play: ****  1. Radio   2. Walkman  3. MobilePhone");
        choice = reader.nextInt();

        switch (choice){
            case 1: {
                device = new Radio();
                device.sound();
                System.out.println("Do you want to turn down the voice of it? ****  1. Yes    2. No");
                choice = reader.nextInt();
                if(choice == 1){
                    device.adjustSound();
                }
                else{
                    System.out.println("The voice has not been changed!");
                }
                break;
            }

            case 2: {
                device = new WalkMan();
                device.sound();
                System.out.println("Do you want to turn down the voice of it? ****  1. Yes    2. No");
                choice = reader.nextInt();
                if(choice == 1){
                    device.adjustSound();
                }
                else{
                    System.out.println("The voice has not been changed!");
                }
                break;
            }

            case 3: {
                device = new MobilePhone();
                device.sound();
                System.out.println("Do you want to turn down the voice of it? **** 1. Yes    2. No");
                choice = reader.nextInt();
                if(choice == 1){
                    device.adjustSound();
                }
                else{
                    System.out.println("The voice has not been changed!");
                }
                break;
            }

            default: {
                System.out.println("Illegal input!");
                break;
            }
        }


    }

}
