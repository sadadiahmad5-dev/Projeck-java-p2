package p3;
import javax.swing.JOptionPane;;

public class sapa{
    public static void main(String[] args) {
        
        String nama = JOptionPane.showInputDialog("Nama kamu siapa?");

        JOptionPane.showMessageDialog(null, "Halo " + nama + ",semangat ya kuliahnya !");
    }
}