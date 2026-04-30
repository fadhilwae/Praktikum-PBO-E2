package Anabul;
public class Burung extends Anabul {
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " bersuara cuit cuit cuit");
    }
}