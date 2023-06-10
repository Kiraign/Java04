public class BmiService {
    public int calculate(int height, int weight) {
        double index = weight / (height * height);

        return (int) index;
    }
}
