/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fadhil Yaafi Widodo - 24060124140169
 * Tanggal      : 27 Februaru 2025
 */

public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y; 
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    
    // Kuadran

    // Mencetak Refleksi dari Titik X
    Titik getRefelksiX(){
        Titik T1 = new Titik();
        T1.setAbsis(absis);
        T1.setOrdinat(-1 * ordinat);
        return T1;
    }

    // Mencetak Refleksi dari Titik Y
    Titik getRefelksiY(){
        Titik T1 = new Titik();
        T1.setAbsis(-1 * absis);
        T1.setOrdinat(ordinat);
        return T1;
    }
}

//end class Titik