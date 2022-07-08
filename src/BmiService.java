public class BmiService {
    public double calculate(double weight , double height) {
        double bmi = weight / (height * height);
        if (bmi < 18) {
            System.out.println(" Дефецит массы тела: меньше чем 18");
        }
        else if (bmi <= 25) {
            System.out.println(" Норма: между 18 и 25");
        }
        else if (bmi <= 30) {
            System.out.println(" Лишний вес: между 25 и 30");
        }
        else if (bmi >= 31) {
            System.out.println(" Ожирение: 31 и больше");
        }
        return bmi;
    }


}
