import java.util.*;
class Circle{
    
    private double r;
    
    public Circle(double r){
        this.r=r;
    }
    public void setRadius(double n){
        r = n;
    }
    public double getRadius(){
        return r;
    }
    public double calculateArea(){
        return Math.PI*r*r;
    }
    public double calculateCircumference(){
        return Math.PI*r*2;
    }
}
class OOPS4 {
    public static void main(String[] args) {
        Circle C1 = new Circle(10);

        System.out.println("Radius: " + C1.getRadius());
        System.out.println("Area: " + C1.calculateArea());
        System.out.println("Circumference: " + C1.calculateCircumference());

        C1.setRadius(7.5);
        System.out.println("Updated Radius: " + C1.getRadius());
        System.out.println("Updated Area: " + C1.calculateArea());
        System.out.println("Updated Circumference: " + C1.calculateCircumference());
    }
}
