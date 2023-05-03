import ru.netology.finances.Finances;

class Main {

    public static void main(String[] args) {
        int payment = Finances.calcPayment(2_600_000, 200_000, 2);
        System.out.println("Ежемесячный платеж составит: " + payment);
    }
}