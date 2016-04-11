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
public class Buku {
    String Judulbuku;
    String Pengarang;
    String Penerbit;

    public String getJudulbuku() {
        return Judulbuku;
    }

    public void setJudulbuku(String Judulbuku) {
        this.Judulbuku = Judulbuku;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }
    
       public void tampilkandata(){
        System.out.println("Judul Buku:"+getJudulbuku());
        System.out.println("Pengarang:"+getPengarang());
        System.out.println("Penerbit:"+getPenerbit());
    }
    public void inputdata(String j,String p,String pn){
        setJudulbuku(j);
        setPengarang(p);
        setPenerbit(pn);
    }
}
