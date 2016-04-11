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
public class pelajaran extends Buku {
     public void tampilkan (){
        String Banyakhalaman;
        String Tahunterbit;
        String katagori;
        
        Banyakhalaman="100";
        Tahunterbit="2005";
        katagori="Pelajar";
        
        //Buku m= new Buku();
       inputdata("Matematika Kelas 10","Abdul Majid", "Erlangga");
       tampilkandata();
        System.out.println("Banyak Halaman: "+Banyakhalaman);
        System.out.println("Tahun Terbit: "+Tahunterbit);
        System.out.println("Jenis kategori: "+katagori);
     }
}
