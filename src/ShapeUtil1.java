public class ShapeUtil1 {




    public static void main(String[] args) {

Shape1 [] shape1s= new Shape1[3];
shape1s[0]=new Rectangle(2,3);
shape1s[1]=new Cube(2);
shape1s[2]=new Circle(4);

        for (Shape1 st:shape1s) {
            System.out.print(st);
            System.out.println("  the area is : "+st.getArea());

        }
    }
    }


