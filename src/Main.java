public class Main {

    public static void main(String[] args) {
        int amount = 500; // Первоначальная сумма
        int summa = 2100; // Сумма пополнения

        if (summa <= 1000) {
            System.out.println((amount + summa) + " Итоговая сумма");
            System.out.println((0) + " Количество бонусных рублей");
        } else {
            int bonus = (summa / 100); // Бонус при пополнении
            System.out.println((amount + summa + bonus) + " Итоговая сумма");
            System.out.println((bonus) + " Количество бонусных рублей");
        }


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}