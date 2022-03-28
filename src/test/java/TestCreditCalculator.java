import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class TestCreditCalculator {

    @Test
    public void check_monthPaymentCountCorrect() {
        CreditCalculator creditCalculator = new CreditCalculator();
        BigDecimal creditSum = new BigDecimal("200000");
        BigDecimal percent = new BigDecimal("0.12");
        int creditLengthInMonth = 24;
        int subResult = creditCalculator.getMonthPayment(creditSum, percent, creditLengthInMonth);
        int expectedResult = 9414;
        Assertions.assertEquals(expectedResult, subResult);
    }

    @Test
    public void check_fullSumToPay() {
        CreditCalculator creditCalculator = new CreditCalculator();
        BigDecimal creditSum = new BigDecimal("1000000");
        BigDecimal percent = new BigDecimal("0.097");

        int subResult = creditCalculator.getFullSum(creditSum, percent);
        int expectedResult = 1097000;
        Assertions.assertEquals(expectedResult, subResult);
    }

    @Test
    public void check_overpayCount() {
        CreditCalculator creditCalculator = new CreditCalculator();
        BigDecimal creditSum = new BigDecimal("1000000");
        BigDecimal percent = new BigDecimal("0.1");

        int sumResult = creditCalculator.getOverpay(creditSum, percent);
        int expectedResult = 100000;
        Assertions.assertEquals(expectedResult, sumResult);
    }
}
