public class Petani extends Manusia {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, String tglLahir, String alamat, double pendapatan, String asalKota) {
        super(nama, tglLahir, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0.05 * getPendapatan(); // contoh 5%
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
        System.out.println();
    }
}