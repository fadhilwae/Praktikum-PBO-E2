/* Nama File    : MTitik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fadhil Yaafi Widodo - 24060124140169
 * Tanggal      : 27 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        // Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        // T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        // T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        // T1.printTitik(); //mencetak koordinat T1 ke layar
        // T1.geser(3,4); //menggeser T1 sejauh (3,4)
        // T1.printTitik(); //menampilkan koordinat T1 setelah digeser
        
        // // Bagian 2 - Object Reference
        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        // Buat 2 titik
        Titik T1 = new Titik(3, 4);
        Titik T2 = new Titik(5, -2);

        // Cetak koordinat awal
        T1.printTitik();
        T2.printTitik();

        // Tes kuadran
        System.out.println(T1.getKuadran());
        System.out.println(T2.getKuadran());

        // Tes jarak dari pusat
        System.out.println(T1.getJarakPusat());
        System.out.println(T2.getJarakPusat());

        // Tes jarak antar titik
        System.out.println(T1.getJarak(T2));

        // Tes refleksi langsung
        T1.refleksiX();
        T1.printTitik();

        T2.refleksiY();
        T2.printTitik();

        // Tes refleksi menghasilkan titik baru
        T1.getRefleksiX().printTitik();
        T2.getRefleksiY().printTitik();

        // Total counterTitik
        System.out.println(Titik.getCounterTitik());
    }
}
