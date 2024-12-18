public class Main {
    public static void main(String[] args) {
        System.out.println("====Detail Hewan====");

        Kucing kc = new Kucing("Budi", 25, "Kampung");
        System.out.println("\nini adalah " + kc.nama + " !");
        kc.suara();
        kc.makan();
        kc.makan("ikan");
        kc.info();

        Burung br = new Burung("Stepen", 85, "Ungu Janda");
        System.out.println("\nini adalah " + br.nama + " !");
        br.suara();
        br.makan();
        br.makan("biji");
        br.info();
    }
}
