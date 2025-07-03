import java.math.BigDecimal;

public class Task2 {
    public static void main(String[] args) {
        BigDecimal revenue1Year = BigDecimal.valueOf(100844.3);
        String nishe = "Health";
        double tax = 0;


        switch (nishe) {

            case "Bank": {
                if (revenue1Year.doubleValue() < 250_000) {
                    tax = 0.1;
                } else if (revenue1Year.doubleValue() >= 250_000 && revenue1Year.doubleValue() <= 499_999) {
                    tax = 0.15;
                } else {
                    tax = 0.18;
                }
                break;
            }
            case "Health": {
                if (revenue1Year.doubleValue() < 400_000) {
                    tax = 0.07;
                } else if (revenue1Year.doubleValue() >= 400_000 && revenue1Year.doubleValue() <= 899_999) {
                    tax = 0.12;
                } else {
                    tax = 0.15;
                }
                break;
            }
            case "Transport": {
                if (revenue1Year.doubleValue() < 100_000) {
                    tax = 0.09;
                } else if (revenue1Year.doubleValue() >= 100_000 && revenue1Year.doubleValue() <= 299_999) {
                    tax = 0.13;
                } else {
                    tax = 0.17;
                }
                break;
            }
        }


        double sum = Math.round(tax * revenue1Year.doubleValue());

        String text = "Налог на сумму " + revenue1Year
                + " для отрасли " + nishe + " составляет " + sum
                + ".\nЭто составялет " + Math.round(tax * 100) + " процентов.";

        System.out.println(text);
    }
}
