import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args){
        DosenTetap DosTetap = new DosenTetap(
            "D07076",
            "Prof. Fadhil, S.Kom., M.Cs.",
            LocalDate.of(1954, 8, 17),
            LocalDate.of(2014, 1, 20),
            15000000.0,
            "Fakultas Sains dan Matematika",
            "007"
        );

        DosenTamu DosTamu = new DosenTamu(
            "D1235",
            "Farel, S.Balap., M.Balap",
            LocalDate.of(1997, 2, 14),
            LocalDate.of(2021, 1, 1),
            10000000.0,
            "Fakultas Sains dan Matematika",
            "999",
            "30 Desember 2027"
        );

        Tendik tendik = new Tendik(
            "T1234",
            "Lamine Yamal",
            LocalDate.of(2007, 7, 13),
            LocalDate.of(2026, 1, 1),
            8000000.0,
            "Sumber Daya"
        );

        System.out.println("==== Dosen Tetap ====");
        DosTetap.printInfo();
        DosTetap.printTunjangan();

        System.out.println("\n==== Dosen Tamu ====");
        DosTamu.printInfo();
        DosTamu.printTunjangan();

        System.out.println("\n==== Tendik ====");
        tendik.printInfo();
        tendik.printTunjangan();
    }
}