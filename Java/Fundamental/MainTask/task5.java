import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter number from  1 to 12:");
            while (!console.hasNextInt()) {
                System.out.println("It's not number!");
                console.next();
            }
            number = console.nextInt();
            if (number < 1 || number > 12) {
                System.out.println("Please enter correct number!");
            }
        } while (number < 1 || number > 12);
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}
