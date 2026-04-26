public class Pengeluaran {
    public static void main(String[] args) {

        int hari = 7;

        // Pengeluaran per hari
        double makanan = 20000;
        double transport = 10000;
        double belanja = 50000;

        // Total selama 7 hari
        double totalMakanan = makanan * hari;
        double totalTransport = transport * hari;
        double totalBelanja = belanja * hari;

        // Total keseluruhan
        double totalSemua = totalMakanan + totalTransport + totalBelanja;

        // Hitung persentase
        double persenMakanan = (totalMakanan / totalSemua) * 100;
        double persenTransport = (totalTransport / totalSemua) * 100;
        double persenBelanja = (totalBelanja / totalSemua) * 100;

        // Output
        System.out.println("===== HASIL SELAMA 7 HARI =====");
        System.out.println("Total Makanan   : " + totalMakanan);
        System.out.println("Total Transport : " + totalTransport);
        System.out.println("Total Belanja   : " + totalBelanja);
        System.out.println("Total Semua     : " + totalSemua);

        System.out.println("\n===== PERSENTASE =====");
        System.out.println("Makanan   : " + persenMakanan + "%");
        System.out.println("Transport : " + persenTransport + "%");
        System.out.println("Belanja   : " + persenBelanja + "%");
    }
}
