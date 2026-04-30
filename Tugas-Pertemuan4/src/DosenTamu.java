import java.time.LocalDate;

public class DosenTamu extends Dosen{
    protected String NIDK;
    protected String akhirKontrak;

    // ---------- METHOD ----------
    public DosenTamu(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas, String NIDK, String akhirKontrak){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    public String getNIDK(){
        return this.NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public String getAkhirKontrak(){
        return this.akhirKontrak;
    }

    public void setAkhirKontrak(String akhirKontrak){
        this.akhirKontrak = akhirKontrak;
    }

    public double getTunjangan(){
        return 0.25 * getGajiPokok();
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK Dosen Tamu : " + NIDK);
        System.out.println("Tanggal Berakhir Kontrak Dosen Tamu : " + akhirKontrak);
    }

    public void printTunjangan(){
        System.out.println("Tunjangan Dosen Tamu : " + getTunjangan());
    }
}