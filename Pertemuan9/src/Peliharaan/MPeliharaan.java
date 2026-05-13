package Peliharaan;

public class MPeliharaan {
    public static void main(String[] args) {
        Peliharaan p = new Peliharaan();

        p.enqueueAnabul(new Kucing("Lawu", 3.5));
        p.enqueueAnabul(new Anjing("Jack"));
        p.enqueueAnabul(new Anggora("Sawit", 4.2));
        p.enqueueAnabul(new Burung("Dor"));
        p.enqueueAnabul(new Kembangtelon("Snik", 5.0));

        System.out.println("=== Daftar Anabul ===");
        p.showAnabul();

        System.out.println("\n=== Jenis Anabul ===");
        p.showJenisAnabul();

        System.out.println("\nJumlah total: " + p.getNbelm());
        System.out.println("Jumlah kucing: " + p.countKucing());
        System.out.println("Total bobot kucing: " + p.bobotKucing() + " kg");

        System.out.println("\nAnabul terdepan: " + p.getAnabul().getNama());

        Anabul keluar = p.dequeueAnabul();
        System.out.println("Dequeue: " + keluar.getNama());

        System.out.println("\n=== Setelah dequeue ===");
        p.showAnabul();
        System.out.println("Jumlah total: " + p.getNbelm());
    }
}