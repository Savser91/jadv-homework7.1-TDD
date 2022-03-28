import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CreditCalculator calculator = new CreditCalculator();
        System.out.println(calculator.getMonthPayment(new BigDecimal("200000"), new BigDecimal("0.12"), 24));
        System.out.println(calculator.getFullSum(new BigDecimal("1000000"), new BigDecimal("0.097")));
        System.out.println(calculator.getOverpay(new BigDecimal("1000000"), new BigDecimal("0.097")));
    }
}
