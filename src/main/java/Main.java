import ru.netology.services.CalculateService;

public class Main {
    public static void main(String[] args) {

        CalculateService service = new CalculateService();
        System.out.println(service.calculate(10000, 3000, 20000));
        System.out.println(service.calculate(100000, 60000, 150000));
    }
}