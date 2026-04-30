public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tglLahir, String alamat, double pendapatan, String nip) {
        super(nama, tglLahir, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan(); // contoh 10%
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println();
    }
}