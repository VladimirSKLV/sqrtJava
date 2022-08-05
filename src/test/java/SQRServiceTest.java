import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqamvn.services.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void calcSqr() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.calcSqrt(10, 99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcSqrFalse() {
        SQRService service = new SQRService();
        int expected = 10;
        int actual = service.calcSqrt(10, 99);
        Assertions.assertEquals(expected, actual);
    }
}
