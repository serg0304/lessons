import java.math.BigDecimal;

public class Task3 {
    public static void main(String[] args) {
        BigDecimal balance = BigDecimal.valueOf(455);
        BigDecimal withdraw = BigDecimal.valueOf(430);
        BigDecimal limit = BigDecimal.valueOf(500);

        boolean m20 = withdraw.remainder(new BigDecimal(20)).compareTo(BigDecimal.ZERO) == 0;
        boolean balanceOk = balance.compareTo(withdraw) >= 0;
        boolean limitOk = limit.compareTo(withdraw) >= 0;

        if (balanceOk && m20 && limitOk) {
            balance = balance.subtract(withdraw);
            System.out.println("Транзакция прошла успешно.\nВаш баланс = " + balance);
        }
        else {
            System.out.println("Ошибка. Невозможно снять средства!\nВаш баланс = " + balance);
        }
    }
}
