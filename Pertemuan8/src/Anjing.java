public class Anjing extends Anabul {
    private double berat;

    public Anjing(String nama, double berat) {
        super(nama);
        this.berat = berat;
    }

    @Override
    public void gerak() {
        System.out.println("berlari");
    }

    @Override
    public void bersuara() {
        System.out.println("guk..guk..");
    }

    @Override
    public String toString() {
        return "Anjing: " + getNama() + " (" + berat + " kg)";
    }
}