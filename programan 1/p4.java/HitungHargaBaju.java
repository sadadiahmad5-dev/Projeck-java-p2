import java.util.Scanner;

public class HitungHargaBaju {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukan Harga Baju: ");
        double hargaBaju = input.nextDouble();

       
        System.out.print("Masukan Jumlah Baju: ");
        int jumlah = input.nextInt();

        
        double total = hargaBaju * jumlah;

        
        double diskon = 0;
        if (jumlah >= 5) {
            diskon = total * 0.10;
        }

       
        double pajak = (total - diskon) * 0.11;

        
        double totalAkhir = total - diskon + pajak;

        
        System.out.println("\n===== HASIL =====");
        System.out.println("Total harga     : Rp " + total);
        System.out.println("Diskon          : Rp " + diskon);
        System.out.println("Pajak (11%)     : Rp " + pajak);
        System.out.println("Total bayar     : Rp " + totalAkhir);

        input.close();
    }
}
