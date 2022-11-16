public class Main {
    public static void main(String[] args) {
        int account = 100; // Счёт
        int a = 1100; // Пополнения на счёт
        int bonus = a / 100; // Бонусные рубли
        if (a > 1000){
            bonus = bonus;

        } else {
            bonus = 0;
        }
        int adding = a + account + bonus; // Баланс счёта после пополнения

        System.out.println("На вашем счету:" + adding);
        System.out.println("Из них бонусных:" + bonus);
    }

}
