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
public class Dongeng extends Buku {
    public void tampilkan (){
        String Banyakhalaman;
        String Tahunterbit;
        String katagori;
        
        Banyakhalaman="50";
        Tahunterbit="1999";
        katagori="Anak-anak";
        
        //Buku m= new Buku();
       inputdata("Malin Kundang","Wahyu Ningrat", "Gramedia");
       tampilkandata();
        System.out.println("Banyak Halaman: "+Banyakhalaman);
        System.out.println("Tahun Terbit: "+Tahunterbit);
        System.out.println("Jenis kategori: "+katagori);
     }  
}
