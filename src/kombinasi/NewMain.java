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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Novel");
        Cerita h=new Cerita();
        h.tampilkan();
        
       System.out.println("\nBuku Pelajaran");
        pelajaran p=new pelajaran();
        p.tampilkan();
        
         System.out.println("\nBuku Cerita");
        Dongeng d=new Dongeng();
        d.tampilkan();
    }
    
}
