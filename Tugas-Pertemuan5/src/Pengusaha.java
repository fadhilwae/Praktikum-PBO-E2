public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tglLahir, String alamat, double pendapatan, String npwp) {
        super(nama, tglLahir, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan(); // contoh 15%
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println();
    }
}