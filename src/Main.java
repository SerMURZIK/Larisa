import ru.netology.finances.Finances;

class Main {

    public static void main(String[] args) {
        int payment = Finances.calcPayment(2600000, 200000, 2);
        System.out.println("Ежемесячный платеж составит: " + payment);

    }
}