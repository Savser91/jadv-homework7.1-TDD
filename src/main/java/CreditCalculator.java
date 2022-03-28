import java.math.*;

public class CreditCalculator {

    public CreditCalculator() {
    }

    public int getMonthPayment(BigDecimal creditSum, BigDecimal percent, int lengthInMonths) {
        BigDecimal monthlyRate = percent.divide(new BigDecimal("12"));
        BigDecimal pow = monthlyRate.add(new BigDecimal(1)).pow(-lengthInMonths, MathContext.DECIMAL64);
        BigDecimal denominator = new BigDecimal(1);
        denominator = denominator.subtract(pow);

        BigDecimal amount = creditSum.multiply(monthlyRate).divide(
                denominator, RoundingMode.UP
        );
        return amount.intValue();
    }

    public int getFullSum(BigDecimal creditSum, BigDecimal percent) {
        BigDecimal result = creditSum.multiply(percent).add(creditSum);
        return result.intValue();
    }

    public int getOverpay(BigDecimal creditSum, BigDecimal percent) {
        BigDecimal result = creditSum.multiply(percent);
        return result.intValue();
    }
}
