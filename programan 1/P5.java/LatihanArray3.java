

import java.util.Scanner;

public class LatihanArray3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();

        String[] namaBarang = new String[jumlah];
        int[] hargaBarang = new int[jumlah];
        int[] jumlahBeli = new int[jumlah];

        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama barang ke-" + (i + 1) + ": ");
            namaBarang[i] = input.next();
            System.out.print("Harga barang ke-" + (i + 1) + ": Rp ");
            hargaBarang[i] = input.nextInt();
            System.out.print("Jumlah beli ke-" + (i + 1) + ": ");
            jumlahBeli[i] = input.nextInt();
        }

        
        int totalBelanja = 0;
        System.out.println("\n===== STRUK BELANJA =====");
        for (int i = 0; i < jumlah; i++) {
            int subtotal = hargaBarang[i] * jumlahBeli[i];
            totalBelanja += subtotal;
            System.out.println((i + 1) + ". " + namaBarang[i] +
                    " x" + jumlahBeli[i] +
                    " = Rp" + subtotal);
        }
        System.out.println("-------------------------");
        System.out.println("TOTAL BELANJA: Rp" + totalBelanja);

        input.close();
    }
}
