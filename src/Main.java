public class Main {
    public static void main(String[] args) {
        int bill = 300;
        int increasebill = 3350;
        if (increasebill > 1000) {
            int bonus = increasebill / 100;
            System.out.println("Бонус =");
            System.out.println(bonus);
            System.out.println("Баланс =");
            System.out.println(bill + increasebill + bonus);
        } else {
            System.out.println("Баланс =");
            System.out.println(bill + increasebill);
        }
    }
}