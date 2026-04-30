package Anabul;
public class Kucing extends Anabul {
    public Kucing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " bersuara miaw");
    }
}