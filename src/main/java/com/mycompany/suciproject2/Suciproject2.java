/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.suciproject2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Suciproject2 {

    public static void main(String[] args) {
        int angka;
        
        Scanner y = new Scanner (System.in);
        System.out.println("Masukan angka");
        
        if (y.hasNextInt()) {
            System.out.println("Angka");
            angka = y.nextInt();
            if (angka > 100){
                System.out.println("Angka harus kurang dari 100");
            }else if (angka < 6 ){
                System.out.println("Angka harus lebih dari 6");
            }else if (angka %2 == 0){
                System.out.println("Angka yang anda masukkan berupa bilangan genap");
            }else{
                System.out.println("Angka yang anda masukkan berupa bilangan ganjil");
            }
        }else{
            System.out.println("anda harus menginputkan angka");
        }
        
        
    }
}
