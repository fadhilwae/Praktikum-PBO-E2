package Anabul;
public class Anabul {
    protected String Nama;

    public Anabul(String Nama) {
        this.Nama = Nama;
    }
    
    public void Gerak() {
        System.out.println(Nama + " sedang bergerak");
    }

    public void Bersuara() {
        System.out.println(Nama + " bersuara");
    }
}