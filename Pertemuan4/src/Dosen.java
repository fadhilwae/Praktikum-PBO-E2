import java.time.LocalDate;

public class Dosen extends Pegawai{
    public String Fakultas;

    // -------- METHOD --------
    public Dosen(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.Fakultas = fakultas;
    }

    public String getFakultas(){
        return this.Fakultas;
    }

    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas Dosen : " + Fakultas);
    }
}
