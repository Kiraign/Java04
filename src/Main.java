public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.60;
        int weight = 50;
        int index = service.calculate(height, weight);
        System.out.println(index);
    }
}
