public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.setSides(6.0, 6.0, 2.0);

        if (triangle1.getA() + triangle1.getB() > triangle1.getC() && triangle1.getA() + triangle1.getC() > triangle1.getB() && triangle1.getC() + triangle1.getB() > triangle1.getA()) {
            System.out.println(triangle1.getId() + " jaqtar " + triangle1.getA() + " , " + triangle1.getB() + " , " + triangle1.getC() + " , " + " audan: " + triangle1.area());
        } else {
            System.out.println("no bro");
        }

    }
}