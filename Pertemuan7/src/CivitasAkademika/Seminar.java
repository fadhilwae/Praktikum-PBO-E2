package CivitasAkademika;
public class Seminar {
    private static CivitasAkademika[] peserta = new CivitasAkademika[100];
    private int countPeserta;

    // konstruktor
    public Seminar() {
        countPeserta = 0;
    }

    // countPeserta
    public int countPeserta() {
        return countPeserta;
    }

    // registrasi
    public void registrasi(CivitasAkademika c) {
        if (countPeserta < 100) {
            peserta[countPeserta] = c;
            countPeserta++;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    // tampil peserta
    public void tampilPeserta() {
        for (int i = 0; i < countPeserta; i++) {
            System.out.println(
                peserta[i].getNomor() + " - " + peserta[i].getNama()
            );
        }
    }

    // count mahasiswa
    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < countPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                jumlah++;
            }
        }
        return jumlah;
    }
}