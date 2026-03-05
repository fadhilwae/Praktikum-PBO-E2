/*
* Nama File    : Dosen.java
* Pembuat      : Fadhil Yaafi Widodo - 24060124140169
* Tanggal      : 5 - 3 - 2026
*/

public class Dosen {
    /*********** ATRIBUT ***********/
    private String NIP;
    private String Nama;
    private String Prodi;
    private static int countDosen;

    /*********** CONSTRUCTOR ***********/
    public Dosen(){
        this("0", "Default", "Belum");
        countDosen++;
    }
    
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
        countDosen++;
    }
    
    /*********** METHOD ***********/
    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    public static int getCountDosen(){
        return countDosen;
    }

    public void printDosen(){
        System.out.println("NIP = " + NIP + ", Nama = " + Nama + ", Prodi = " + Prodi);
    }
}
