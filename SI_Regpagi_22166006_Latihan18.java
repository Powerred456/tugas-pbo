/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166006_latihan18;

/**
 *
 * @author asus
 */
public class SI_Regpagi_22166006_Latihan18 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
      // Inisialisasi variabel
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lamaBulan = 6;
        
        // Hitung saldo akhir setiap bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double saldoAkhir = saldoAwal + (saldoAwal * bunga);
            saldoAwal = saldoAkhir;
            System.out.printf("Saldo bulan ke-%d: Rp%,.2f\n", i, saldoAkhir);
}
        }
    }