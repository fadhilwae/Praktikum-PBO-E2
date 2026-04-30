package CivitasAkademika;
public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String NIM, Dosen dosenWali) {
        super(nama);
        this.NIM = NIM;
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public String getNIM() {
        return NIM;
    }

    // set wali
    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    // tampil data mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM   : " + NIM);
        System.out.println("Nama  : " + nama);
        System.out.println("Wali  : " + dosenWali.getNama());
        System.out.println("------------------------------");
    }
}