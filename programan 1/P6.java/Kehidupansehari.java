import java.util.Scanner;

public class Kehidupansehari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan uang: ");
        int uang = input.nextInt();

        if (uang >= 40000) {
            System.out.println("Makan enak");
        } else if (uang >= 15000) {
            System.out.println("Makan biasa");
        } else {
            System.out.println("Ngutang ke teman");
        }
    }
}
