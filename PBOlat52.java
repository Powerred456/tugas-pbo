/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbolat52;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class PBOlat52 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        // Input NIP Dosen
        System.out.print("NIM  mahasiswa: ");
        String nipDosen = input.nextLine();

        // Output informasi Dosen
        System.out.println("Saya Dosen");
        System.out.println("Saya Dede Gunawan sedang belajar  matakuliah PBO");
        int nimmahasiswa = 22166006;

        // Menampilkan NIM Mahasiswa yang diinputkan
        System.out.println("NIM Mahasiswa: " + nimmahasiswa);
    }
}