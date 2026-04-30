/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fadhil Yaafi Widodo - 24060124140169
 * Tanggal      : 27 Februaru 2025
 */

public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
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
    
    // mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    public void printCounterTitik() {
        // System.out.println(this.counterTitik);
        System.out.println(counterTitik);
    }

    // mengembalikan nilai kuadran titik
    public int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else if (getAbsis() > 0 && getOrdinat() < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // mengembalikan jarak titik dari titik pusat
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(getAbsis(), 2) + Math.pow(getOrdinat(), 2));
    }

    // mengembalikan jarak titik dari titik lainnya
    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(this.getAbsis() - T.getAbsis(), 2) + Math.pow(this.getOrdinat() - T.getOrdinat(), 2));
    }

    // mengubah titik menjadi titik refleksi terhadap sumbu X
    public void refleksiX() {
        setOrdinat(getOrdinat() * -1);
    }

    // mengubah titik menjadi titik refleksi terhadap sumbu Y
    public void refleksiY() {
        setAbsis(getAbsis() * -1);
    }

    // Mencetak Refleksi dari Titik X
    Titik getRefleksiX(){
        Titik T1 = new Titik();
        T1.setAbsis(absis);
        T1.setOrdinat(-1 * ordinat);
        return T1;
    }

    // Mencetak Refleksi dari Titik Y
    Titik getRefleksiY(){
        Titik T1 = new Titik();
        T1.setAbsis(-1 * absis);
        T1.setOrdinat(ordinat);
        return T1;
    }
}

//end class Titik