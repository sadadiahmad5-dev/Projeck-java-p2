import java.util.Scanner;

public class PejabatIndonesia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pejabat: ");
        String nama = input.nextLine();

        System.out.print("Masukkan gaji per bulan: ");
        int gaji = input.nextInt();

        if (gaji > 50000000) {
            System.out.println("Nama: " + nama);
            System.out.println("Status: Pejabat Tinggi Negara");
        } else {
            System.out.println("Nama: " + nama);
            System.out.println("Status: Pejabat Daerah");
        }

        input.close();
    }
}
