public class MTeman {
    public static void main(String[] args) {
        Teman teman = new Teman(); 
        teman.addNama("Met");
        teman.addNama("Budi");
        teman.addNama("Gunarji");
        teman.addNama("Sulis");
        teman.addNama("Sri");

        System.out.println("\n=============== getNbelm ===============");
        System.out.println("Jumlah teman: " + teman.getNbelm());

        System.out.println("\n=============== getNama  ===============");
        System.out.println("Nama teman ke-2 sebelum diganti: " + teman.getNama(1));;

        System.out.println("\n=============== setNama  ===============");
        teman.setNama(1, "Budi"); // Mengganti nama teman ke-2
        System.out.println("Nama teman ke-2 setelah diganti: " + teman.getNama(1));

        System.out.println("\n=============== delNama  ===============");
        teman.delNama("Gunarji"); // Menghapus nama "Charlie"
        System.out.println("Jumlah teman setelah dihapus: " + teman.getNbelm());
    
        System.out.println("\n=============== isMember ===============");
        if (teman.isMember("Widodo") == false){
            System.out.println("Salah, nama tersebut bukan teman");
        } else{
            System.out.println("Benar, nama tersebut adalah teman");
        }

        System.out.println("\n=============== gantiNama ===============");
        teman.gantiNama("Sulis", "Iwan");

        System.out.println("\n=============== countNama ===============");
        System.out.println("Jumlah teman bernama Iwan:" + teman.countNama("Daud"));

        System.out.println("\n=============== showTeman ===============");
        teman.showTeman();
    }
}