/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._amandadevikahakim_method;

import java.util.Scanner;

/**
 *
 * @author amandadhkm
 */
public class SoalNo1 {
    
    public static void loopingText(int N){
        for (int i = 0; i < N; i++){
            System.out.println("Saya senang belajar bahasa Java");
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pengulangan (N): ");
        int N = input.nextInt();
        
        loopingText(N);
    }
}
