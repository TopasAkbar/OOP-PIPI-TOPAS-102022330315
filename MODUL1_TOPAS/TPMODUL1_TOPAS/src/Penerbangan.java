
public class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String keberangkatan;
    private String kedatangan;
    private float harga;

    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan,
                       String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.keberangkatan = waktuKeberangkatan;
        this.kedatangan = waktuKedatangan;
        this.harga = hargaTiket;
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return keberangkatan;
    }

    public String getWaktuKedatangan() {
        return kedatangan;
    }

    public float getHargaTiket() {
        return harga;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + keberangkatan + " ---> Waktu Kedatangan: " + kedatangan);
        System.out.println("Harga Tiket: Rp." + harga);
    }
}
