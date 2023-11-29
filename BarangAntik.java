/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbolat56;

/**
 *
 * @author asus
 */
/*package barangantik;*/
public class BarangAntik {
    private int umur;
    
    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public class Radio extends BarangAntik {
        private String name;

        public Radio(int umur, String name) {
            super(umur); 
            this.name = name;
        }

        public String getNama() {
            return name;
        }

        public void tampilUmur() { 
            System.out.println("Nama barang antik: " + getNama());
            System.out.println("Umur barang antik ini adalah: " + getUmur() + " tahun");
        }
    }

    public static void main(String[] args) {
        BarangAntik barang = new BarangAntik(234);
        BarangAntik.Radio radio = barang.new Radio(234, "Radio am"); 
        radio.tampilUmur();

    }
    
}
