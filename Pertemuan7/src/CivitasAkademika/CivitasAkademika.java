package CivitasAkademika;
public class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // akan dioverride
    public String getNomor() {
        return "-";
    }
}