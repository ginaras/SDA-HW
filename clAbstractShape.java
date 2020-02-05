package advancedHW;

public class clAbstractShape {
    public static void main(String[] args) {
        AbShape rectangle = new Rectangle(4,5, 3.14);
        rectangle.area();
        rectangle.perimeter();
        AbShape circle = new Circle(3,0,3.14);
        circle.areaCircle();
        circle.perimeterCircle();

    }
}
    abstract class AbShape {
        int a; int b; double c;
        int area;
        int perimeter;
        double areaCircle;
        double perimeterCircle;

        public AbShape(int a, int b, double c) {
            this.area = a*b;
            this.perimeter =2*(a* b);
            this.areaCircle=a*(c*c);
            this.perimeterCircle= 2*a*a;
        }
        public abstract void area();
        public abstract void areaCircle();
        public abstract void perimeter();
        public abstract void perimeterCircle();
    }

    class Rectangle extends AbShape {
         public  Rectangle (int a, int b, double c){
             super(a, b, c);
         }

        @Override
        public void area (){
         System.out.println("Area is: "+area);
         }

        @Override
        public void perimeter() {
            System.out.println("Perimeter is: "+ perimeter);
        }
        @Override
        public void areaCircle(){}
        @Override
        public void perimeterCircle(){}
    }
    class Circle extends AbShape {
        public Circle(int a, int b, double c){
            super(a, b, c);
        }
        @Override
        public void areaCircle(){
            System.out.println("Circle arc is: "+perimeterCircle);
        }
        @Override
        public void perimeterCircle(){
            System.out.println("Circle Area  is: "+areaCircle);
        }

        @Override
        public void area(){
            System.out.println();

        }
        @Override
        public void perimeter() {

        }
}






