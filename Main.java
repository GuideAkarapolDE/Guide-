
public class Main {

    public static void main(String args[]) {
        Shape Triangle = new Triangle(51, 82, 69, 41, 30);
        System.out.println("Triangle");
        Triangle.printInfo();

        System.out.println("-----------------and-----------------");

        Shape Rhombus = new Rhombus(74, 96, 86);
        System.out.println("Rhombus");
        Rhombus.printInfo();
    }
}

