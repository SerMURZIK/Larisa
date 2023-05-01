public class CreditPaymentService {
    public int calculator(int creditAmountRub, double creditRatePercent, int periodYear) {
        double monthRate = creditRatePercent / (12 * 100); // m (см. строку 3), процентная ставка в месяц, переведенная в доли
        double a = 1 + monthRate;// 1+m (см. строку 3)
        int paymentNumber = periodYear * 12;// количество платежей, ' (см. строку 3)
        double q = Math.pow(a, paymentNumber);// (1+m)' (см. строку 3)
        double annuityRatio = (monthRate * q) / (q - 1);// коэффициент аннуитета, Q (см. строку 3)
        double payment = creditAmountRub * annuityRatio; // расчет по формуле: P=S*Q; Q=(m*(1+m)'/(1+m)'-1), где ' - количество платежей.
        return (int) payment;
    }
}
