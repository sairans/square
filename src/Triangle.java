public class Triangle {
    private static int id_gen = 1;
    private int id;
    private double area, a, b, c;

    public Triangle(){
        id = id_gen++;
    }

    public Triangle(double a, double b, double c){
        this();
        setSides(a, b, c);

    }

    public int getId() {
        return id;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public void setSides(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area(){
         double p = (a + b + c) / 2;
         return Math.sqrt(p * (p - a) *(p - b) * (p - c));
     }
}

