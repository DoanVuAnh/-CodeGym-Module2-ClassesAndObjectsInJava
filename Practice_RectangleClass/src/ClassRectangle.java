import java.awt.*;

public class ClassRectangle {
    double width;
    double length;

    public ClassRectangle(){
    }
    public  ClassRectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return (this.length + this.width) * 2;
    }
    public  String display(){
        return  "Rectangle{" + "width=" + width + ", length=" + length + "}";
    }
}
