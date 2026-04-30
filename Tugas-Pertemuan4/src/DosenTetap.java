import java.time.LocalDate;

public class DosenTetap extends Dosen{
    protected String NIDN;
    protected final int BUP = 65;
    
    // ---------- METHOD ----------
    public DosenTetap(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas, String NIDN){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return this.NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public int getBUP(){
        return this.BUP;
    }

    public double getTunjangan(){
        return 0.02 * getMasaKerja() * getGajiPokok();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN Dosen Tetap : " + NIDN);
        System.out.println("BUP Dosen Tetap : " + BUP);
    }

    public void printTunjangan(){
        System.out.println("Tunjangan Dosen Tetap : " + getTunjangan());
    }
}