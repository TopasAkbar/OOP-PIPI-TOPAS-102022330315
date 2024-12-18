public class Burung extends Hewan {
    private String warna;

    public Burung(String nama, int umur, String warna) {
        super(nama, umur);
        this.warna = warna;
    }

    @Override
    public void suara() {
        System.out.println(nama + " berkicauuuuuuuu.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Warna bulu: " + warna);
    }
}
