/*
* Nama File    : Matkul.java
* Pembuat      : Fadhil Yaafi Widodo - 24060124140169
* Tanggal      : 5 - 3 - 2026
*/

public class Matkul {
    /*********** ATTRIBUTE ***********/
    private String idMatKul;
    private String nama;
    private int sks;
    private static int counterMatkul;

    /*********** CONSTURCTOR ***********/
    public Matkul(){
        this("0", "Default", 0);
        counterMatkul++;
    }

    public Matkul(String idMatkul, String nama, int sks){
        this.idMatKul = idMatkul;
        this.nama = nama;
        this.sks = sks;
        counterMatkul++;
    }

    /*********** METHOD ***********/
    public String getIdMatkul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatkul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public static int getCounterMatkul(){
        return counterMatkul;
    }

    public void printMatkul(){
        System.out.println("ID Matkul = " + idMatKul + ", Nama = " + nama + ", SKS = " + sks);
    }
}