public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(50, 1.64);
        System.out.println(bmi);
    }
}