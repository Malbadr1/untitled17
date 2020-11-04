import java.awt.*;

public  abstract  class Shape1 {
    private String name;
    public Shape1(String name){
        this.name=name;

    }


    public abstract void getDraw();
    public abstract  double getArea();
    public abstract  String getName();



}

class Rectangle extends Shape1{
     private double length;
     private double width;
     public Rectangle(double length,double width){
         super("Rectangle");
         this.length=length;
         this.width=width;

     }

    @Override
    public void getDraw() {

    }

    public double getArea(){
         return length*width;

     }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle:  " +
                "length=" + length +
                ", width=" + width ;
    }
}
class Cube extends Shape1 {
    private double sid;

    public Cube( double sid) {
        super("Cub");
        this.sid = sid;
    }

    @Override
    public void getDraw() {

    }

    @Override
    public double getArea() {
        return 6 * (sid * sid);
    }

    @Override
    public String getName() {
        return "Cube";
    }

    @Override
    public String toString() {
        return "Cube : " +
                "sid=" + sid
                ;
    }
}

    class Circle extends Shape1 {
        private double radius;

        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        @Override
        public String getName() {
            return "Circle";
        }

        @Override
        public double getArea() {
            return Math.PI*(radius*radius);
        }

        @Override
        public void getDraw() {

        }

        @Override
        public String toString() {
            return "Circle : " +
                    "radius=" + radius
                    ;
        }
    }





