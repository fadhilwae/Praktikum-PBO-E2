package Peliharaan;

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("berlari");
    }

    @Override
    public void bersuara() {
        System.out.println("guk..guk..");
    }
}