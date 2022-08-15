import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqamvn.services.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Min amount, 1, 3, 0",
            "Max amount, 100, 9999, 90",
            "'Min interval where amount 1', 144, 144, 1",
            "'Min interval where amount 0', 145, 145, 0",
            "Interval under 99, 1, 99, 0",
            "Interval upper 9802, 9802, 99999, 0",
    })
    void shouldCalculate(String testName, int unRange, int upRange, int expected) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(unRange, upRange);

        Assertions.assertEquals(actual, expected);
        System.out.println(actual);
    }
}