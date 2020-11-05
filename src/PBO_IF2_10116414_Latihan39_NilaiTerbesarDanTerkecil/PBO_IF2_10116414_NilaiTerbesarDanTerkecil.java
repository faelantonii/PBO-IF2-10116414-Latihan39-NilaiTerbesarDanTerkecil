/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan39_NilaiTerbesarDanTerkecil;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan nilai besar dan kecil
 */
public class PBO_IF2_10116414_NilaiTerbesarDanTerkecil {
     public static void main(String[] args) {
        String namaPetugas;
        int jumlahMahasiswa;

        Nilai result = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program Nilai Terbesar dan Nilai Terkceil===");
        
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jumlahMahasiswa = scn.nextInt();
        System.out.println();

        result.inputNilai(jumlahMahasiswa);
        System.out.println();
        
        result.tampilNilaiTerbesarTerkecil(jumlahMahasiswa);

        System.out.println("Nilai Terbesar : " + result.max);
        System.out.println("Nilai Terkecil : " + result.min);        
        System.out.println("\nNama Petugas : " + namaPetugas);
    }
}
