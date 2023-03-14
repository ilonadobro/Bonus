public class Main {
    public static void main(String[] args) {

        int amount = 700;
        int inputAmount = 1400;

        int bonus = 0;
        if (inputAmount >= 1000) {

            bonus = inputAmount / 100;
        }
        amount = amount + inputAmount;

        System.out.println(amount);
        System.out.println(bonus);
    }
}