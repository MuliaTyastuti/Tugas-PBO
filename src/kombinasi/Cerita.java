/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kombinasi;

/**
 *
 * @author User
 */
public class Cerita extends Buku {
     public void tampilkan (){
        String Banyakhalaman;
        String Tahunterbit;
        String katagori;
        
        Banyakhalaman="371";
        Tahunterbit="2000";
        katagori="Remaja dan Dewasa";
        
        //Buku m= new Buku();
       inputdata("Ketika Aku Menyentuh Awan","Demian Dematra", "Teenlit");
       tampilkandata();
        System.out.println("Banyak Halaman: "+Banyakhalaman);
        System.out.println("Tahun Terbit: "+Tahunterbit);
        System.out.println("Jenis kategori: "+katagori);
     }
}
