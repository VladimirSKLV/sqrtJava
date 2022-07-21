import ru.netology.javaqamvn.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrt(10, 99));
    }
}
