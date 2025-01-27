import java.io.*;
import java.util.*;
class Animal{
    void walk(){
      System.out.println("I am walking");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }
}
public class OOPS1 {
        
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.walk();
        b1.fly();
        b1.sing();
    }
}
