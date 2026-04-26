package p2.p2;


import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan alamat kantor: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan kode kantor: ");
        String kode = input.nextLine();

        System.out.print("Masukkan nomor telepon kantor: ");
        String telepon = input.nextLine();

        
        System.out.println("\n===== DATA KANTOR =====");
        System.out.println("Alamat Kantor  : " + alamat);
        System.out.println("Kode Kantor    : " + kode);
        System.out.println("No Telepon     : " + telepon);

        input.close();
    }
}
