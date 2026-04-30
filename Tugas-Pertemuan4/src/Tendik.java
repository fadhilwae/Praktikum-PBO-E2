import java.time.LocalDate;

public class Tendik extends Pegawai{
    protected String Bidang;
    protected final int BUP = 55;

    public Tendik(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double GajiPokok, String Bidang){
        super(NIP, Nama, tanggalLahir, TMT, GajiPokok);
        this.Bidang = Bidang;
    }

    public String getBidang(){
        return this.Bidang;
    }

    public void setBidang(String bidang){
        this.Bidang = bidang;
    }

    public int getBUP(){
        return this.BUP;
    }

    public double getTunjangan(LocalDate TMT){
        return 0.01 * getMasaKerja(TMT) * getGajiPokok();
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang Tendik : " + Bidang);
        System.out.println("BUP Tendik : " + BUP);
    }

    public void printTunjangan(){
        System.out.println("Tunjangan Tendik : " + getTunjangan(TMT));
    }
}