public class Main {
    public static void main(String[] args) {
        int account = 10; // Счёт
        int adding = 1100; // Пополнения на счёт
        int bonus = adding / 100; // Бонусные рубли
        if (adding > 1000){
            bonus = bonus;

        } else {
            bonus = 0;
        }
        int addingAccount = adding + account + bonus; // Баланс счёта после пополнения

        System.out.println("На вашем счету:" + addingAccount);
        System.out.println("Из них бонусных:" + bonus);
    }

}
