package inheritance;

public class Main {

    public static void main(String[] args){
        //created an object of the Child class
        Child child1= new Child();
        child1.display();
        child1.driving();
        //static object call
        Parent.drivingSpeed(120);


    }

}
