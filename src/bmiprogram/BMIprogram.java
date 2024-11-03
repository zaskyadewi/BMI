/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmiprogram;

/**
 *
 * @author zaskya dewi
 */
import java.util.Scanner;
public class BMIprogram {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("silahkan masukkan berat badan anda : ");
        int beratBadan = input.nextInt();
        System.out.print("silahkan masukkan tinggi badan anda : ");
        int tinggiBadan = input.nextInt();
        BMIclass bmicalculator = new BMIclass(tinggiBadan,beratBadan);
        bmicalculator.tampilkanKategoriBMI();
        // TODO code application logic here
    }
}
