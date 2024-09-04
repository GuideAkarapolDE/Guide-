
public abstract class Shape {

    abstract double getArea();

    abstract double getParemiter();
    
    public void printInfo(){
    System.out.println("Area:"+getArea()+"m");
    System.out.println("Paremiter:"+getParemiter()+"m");
    }
}
