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
public class SoalNo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan bilangan pertama: ");
            int a = input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            int b = input.nextInt();
            
            System.out.println("PBT dari " + a + " dan " + b + " adalah: " + hitungPBT(a, b));
        }
    }
    
    public static int hitungPBT(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

