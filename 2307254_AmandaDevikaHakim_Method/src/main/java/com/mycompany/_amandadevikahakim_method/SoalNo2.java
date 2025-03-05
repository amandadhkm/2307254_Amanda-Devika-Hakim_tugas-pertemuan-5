/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._amandadevikahakim_method;

import java.util.Scanner;

/**
 *
 * @author amandadhkm
 */
public class SoalNo2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        System.out.println("Deret angka genap dari " + batasAwal + " hingga " + batasAkhir + " adalah:");
        
        tampilkanDeretGenap(batasAwal, batasAkhir);
    }
    
    public static void tampilkanDeretGenap(int batasAwal,int batasAkhir){
        for (int i = batasAwal; i <= batasAkhir; i++) { 
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
}
