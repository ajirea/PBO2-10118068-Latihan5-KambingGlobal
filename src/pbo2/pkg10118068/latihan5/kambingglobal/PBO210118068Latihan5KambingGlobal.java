/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan5.kambingglobal;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Pada latihan ini, yaitu membuat kelas dengan
 * variable instance jumlahKambing serta fungsi untuk menambahkan dan
 * menampilkan jumlahKambing
 */
public class PBO210118068Latihan5KambingGlobal {

    // variable jumlahKambing menjadi variable instance
    int jumlahKambing = 88;
    
    // method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    // method untuk menambahkan jumlahKambing
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PBO210118068Latihan5KambingGlobal kambingSusu = new
            PBO210118068Latihan5KambingGlobal();
        
        // menampilkan jumlahKambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // menambah satu kambing
        kambingSusu.tambahKambing();
        
        // menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
