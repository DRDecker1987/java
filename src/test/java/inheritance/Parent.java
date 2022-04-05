package inheritance;

public class Parent {

    String lastName = "Decker";

    public void driving(){
        System.out.println("I can drive");
    }
    public static void drivingSpeed(int maxSpeed){
        System.out.println("I can drive at max "+maxSpeed+" mph");
    }
}
