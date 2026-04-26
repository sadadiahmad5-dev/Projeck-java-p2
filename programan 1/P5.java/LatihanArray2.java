import java.util.Scanner;

public class LatihanArray2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        // Input data
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data ke-" + i + ": ");
            data[i] = input.nextInt();
        }

        // Output data
        System.out.println("\nHasil data:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data[" + i + "] = " + data[i]);
        }
    }
}
