public class Main {
    public static void main(String[] args) {
        int bill = 300;
        int increaseBill = 3350;
        if (increaseBill > 1000) {
            int bonus = increaseBill / 100;
            System.out.println("Бонус =");
            System.out.println(bonus);
            System.out.println("Баланс =");
            System.out.println(bill + increaseBill + bonus);
        } else {
            System.out.println("Баланс =");
            System.out.println(bill + increaseBill);
        }
    }
}
