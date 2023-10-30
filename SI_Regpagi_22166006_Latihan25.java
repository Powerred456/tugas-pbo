/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166006_latihan25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author asus
 */
public class SI_Regpagi_22166006_Latihan25 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");

        String formattedTime = now.format(formatter);
        System.out.println("Hari ini adalah hari " + formattedTime);
    }
}