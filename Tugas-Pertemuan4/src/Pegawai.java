import java.time.LocalDate;
import java.time.Period;

public class Pegawai{
    protected String NIP;
    protected String Nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    /* -------------- CONSTRUCTOR -------------- */
    public Pegawai(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public int getMasaKerja(){
        return Period.between(TMT, LocalDate.now()).getYears();
    }

    /* -------------- METHOD -------------- */
    public String getNIP(){
        return NIP;
    }
    
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTMT(){
        return this.TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public int getMasaKerja(LocalDate TMT){
        int masaKerja = Period.between(TMT, LocalDate.now()).getYears();
        
        if (masaKerja >= 0){
            return masaKerja;
        } else{
            return 0;
        }
    }

    public void printInfo(){
        System.out.println("NIP = " + NIP);
        System.out.println("Nama = " + Nama);
        System.out.println("Tanggal Lahir = " + tanggalLahir);
        System.out.println("TMT = " + TMT);
        System.out.println("Gaji Pokok = " + gajiPokok);
    }
}