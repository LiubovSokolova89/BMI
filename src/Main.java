import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60;
        double height = 1.7;
        double massIndex = service.calculate(weight , height);

        System.out.println(massIndex);

    }
}
