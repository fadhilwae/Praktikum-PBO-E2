public class Manusia {
    protected String nama;
    protected String tglLahir;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Konstruktor
    public Manusia(String nama, String tglLahir, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    // Setter
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method hitung pajak (default, nanti dioverride)
    public double hitungPajak() {
        return 0;
    }

    // Method hitung masa kerja (sederhana)
    public int hitungMasaKerja() {
        // Ambil tahun dari tanggal lahir
        int tahunLahir = Integer.parseInt(tglLahir.substring(6));
        int tahunSekarang = 2024; // bisa kamu ganti dinamis kalau mau
        return tahunSekarang - tahunLahir;
    }

    // Cetak info
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println();
    }

    // Static getter
    public static int getCounterMns() {
        return counterMns;
    }
}