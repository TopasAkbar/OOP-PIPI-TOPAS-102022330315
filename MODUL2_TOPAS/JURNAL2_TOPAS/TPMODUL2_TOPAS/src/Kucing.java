public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void suara() {
        System.out.println(nama + " mengeong ngeooongggg.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println();
    }
}
