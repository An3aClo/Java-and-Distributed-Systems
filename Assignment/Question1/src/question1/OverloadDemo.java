package question1;

public class OverloadDemo {

    //overloaded method for to calculate the area of the square
    public double Area(double lenght) {
        double area = lenght * lenght;
        return area;
    }

    //overloaded method for to calculate the area of the rectangle
    public double Area(double width, double height) {
        double area = width * height;
        return area;
    }

    //overloaded method for to calculate the area of the circle
    public double Area(float radius) {
        double r = (double) radius;
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

}
