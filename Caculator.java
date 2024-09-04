
public class Caculator extends BMI {

    private double weight;
    private double height;

    public Caculator(double weight, double height) {
        this.weight = weight;
        this.height = height / 100;
        this.BMI = calculateBMI();
    }

    public double calculateBMI() {
        return weight / (height * height);
    }
}
