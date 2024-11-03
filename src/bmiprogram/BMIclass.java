/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmiprogram;

/**
 *
 * @author fone0
 */
public class BMIclass {
    int beratBadan;
    int tinggiBadan;
    
public BMIclass (int beratBadan, int tinggiBadan){
    this.beratBadan = beratBadan;
    this.tinggiBadan = tinggiBadan;
}
void tampilkanKategoriBMI() {
    int hasilnya = beratBadan / (tinggiBadan*tinggiBadan);
    System.out.println("hasil perhitungan BMI dengan berat " + tinggiBadan + " kg dan tinggi " + beratBadan + " m");
    if (hasilnya < 18.5){
            System.out.println("adalah " + hasilnya + " yahh berat badan anda termasuk dalam kategori kurang ideal");
        }    else if (hasilnya >= 18 && hasilnya <= 22.9){
            System.out.println("adalah " + hasilnya + " yeyy berat badan anda termasuk dalam kategori ideal");
        }    else if (hasilnya >= 23 && hasilnya <= 24.9){
            System.out.println("adalah " + hasilnya + " yahh berat badan anda termasuk dalam kategori melebihi batas ideal");
        }    else if (hasilnya >= 25 && hasilnya <= 29.9){
            System.out.println("adalah " + hasilnya + " berat badan anda termasuk dalam kategori obesitas");
        }    else {
        }
        
    }
}
