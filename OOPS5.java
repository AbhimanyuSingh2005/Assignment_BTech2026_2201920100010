import java.util.*;
class Rectangle{
    
    private double l;
    private double b;
    
    public Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public void setLength(double n){
        l = n;
    }
    public void setWidth(double n){
        b = n;
    }
    public double getLength(){
        return l;
    }
    public double getWidth(){
        return b;
    }
    public double calculateArea(){
        return l*b;
    }
    public double calculatePerimeter(){
        return 2*(l+b);
    }
}
class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(10,20);

        System.out.println("Length: " + R1.getLength());
        System.out.println("Width: " + R1.getWidth());
        System.out.println("Area: " + R1.calculateArea());
        System.out.println("Perimeter: " + R1.calculatePerimeter());
    }
}
