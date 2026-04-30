public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10, "Merah", "Putus-putus");
        Persegi P2 = new Persegi(13, "Hitam", "Solid");
        BangunDatar L1 = new Lingkaran(7, "Biru", "Solid");
        Lingkaran L2 = new Lingkaran(5, "Merah", "Solid");

        System.out.println("Apakah luas P1 sama dengan P2 = " + P1.isEqualLuas(P2));
        
        // L1.zoomIn();
        L2.zoomIn();
        L2.zoomOut();
        L1.getLuas();

    }
}