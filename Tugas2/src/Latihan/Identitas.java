/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.Scanner;
/**
 *
 * @author AfdalMaulana
 */
public class Identitas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stambuk, nama, fakultas;
        System.out.print("Masukkan NIM : ");
        stambuk = input.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Fakultas : ");
        fakultas = input.nextLine();
        System.out.println("NIM : "+stambuk);
        System.out.println("Nama : "+nama);
        System.out.println("Fakultas : "+fakultas);
    }
}
