import java.util.Scanner;

public class CekJabatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pejabat: ");
        String nama = input.nextLine();

        System.out.print("Masukkan masa jabatan (tahun): ");
        int masa = input.nextInt();

        if (masa >= 10) {
            System.out.println("Nama: " + nama);
            System.out.println("Status: Pejabat Senior");
        } else if (masa >= 5) {
            System.out.println("Nama: " + nama);
            System.out.println("Status: Pejabat Menengah");
        } else {
            System.out.println("Nama: " + nama);
            System.out.println("Status: Pejabat Baru");
        }

        input.close();
    }
}
