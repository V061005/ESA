public class Largest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int largest = num1;

        if (num2 > largest) {
            System.out.println(num2 + " is greater");
        } else if (num3 > largest) {
            System.out.println(num3 + " is greater");
        } else {
            System.out.println(num1 + " is greater");
        }
    }
}
