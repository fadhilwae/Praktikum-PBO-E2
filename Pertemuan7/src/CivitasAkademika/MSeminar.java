package CivitasAkademika;
public class MSeminar {
    public static void main(String[] args) {

        // untuk dosen
        Dosen d1 = new Dosen("Edy Suharto, S.T., M.Kom", "198009142006041002");
        Dosen d2 = new Dosen("Khadijah, S.Kom., M.Cs.", "198903032015042002");

        // untuk mahasiswa
        Mahasiswa m1 = new Mahasiswa("Fadhil Yaafi Widodo", "24060124140169", d1);
        Mahasiswa m2 = new Mahasiswa("Jook Oh Wie", "24060124130004", d1);
        Mahasiswa m3 = new Mahasiswa("Praroro", "24060124141008", d2);
        Mahasiswa m4 = new Mahasiswa("Anton", "24060124120049", d2);
        Mahasiswa m5 = new Mahasiswa("Hitler", "24060124130746", d1);

        // seminar
        Seminar s = new Seminar();

        // registrasi
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // jumlah peserta
        System.out.println("Total Peserta: " + s.countPeserta());

        // tampil peserta
        System.out.println("\nDaftar Peserta");
        System.out.println("----------------------------------------------");
        s.tampilPeserta();

        // jumlah mahasiswa
        System.out.println("\nJumlah Mahasiswa: " + s.countMahasiswa());

        // ubah wali
        m1.setWali(d2);

        // tampil data mahasiswa
        System.out.println("\nData Mahasiswa");
        System.out.println("--------------------------------");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}