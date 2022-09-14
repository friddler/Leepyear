import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange ett årtal:");
        int input = sc.nextInt();
        sc.nextLine();

        if(input % 4 == 0 && input % 100 == 0 && input % 400 == 0) {
            System.out.println("Du har angett år " + input + " och det är ett skottår");
        } else {
                System.out.println("Du har angett år " + input + " och det är inte ett skottår");
            }
        }
}