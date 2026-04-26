package p3;

import javax.swing.JOptionPane;

public class Latihan1 {
    public static void main(String[] args) {

        
        String nama = JOptionPane.showInputDialog("Siapa nama kamu?");
        String usiaStr = JOptionPane.showInputDialog("Berapa usia kamu?");
        int usia = Integer.parseInt(usiaStr);

        
        JOptionPane.showMessageDialog(null, "Halo " + nama + "! Kamu berusia " + usia + " tahun. Semangat belajar Java!");
    }
}
