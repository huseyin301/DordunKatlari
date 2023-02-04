package Dongu;
import java.util.Scanner;
public class Kod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nbr, total = 0;

        do {

            System.out.print("Bir sayı giriniz : ");
            nbr = sc.nextInt();
            if (nbr % 4 == 0){

                total += nbr;

            }

        }while (nbr % 2 == 0);

        System.out.print("Dördün katlarının toplamı : " + total);

    }
}
