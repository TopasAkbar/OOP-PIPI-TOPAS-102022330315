class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;
    private Penerbangan penerbangan;

    public Penumpang(String NIK, String namaDepan, String namaBelakang, Penerbangan penerbangan) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.penerbangan = penerbangan; 
    }

    public void tampilDaftarPenumpang() {
        System.out.println("Nomor Induk Kependudukan: " + NIK);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
        
        if (penerbangan != null) {
            System.out.println("Nomor Penerbangan: " + penerbangan.getNomorPenerbangan());
            System.out.println("Bandara Keberangkatan: " + penerbangan.getBandaraKeberangkatan() + 
                               " ---> Bandara Tujuan: " + penerbangan.getBandaraTujuan());
            System.out.println("Waktu Keberangkatan: " + penerbangan.getWaktuKeberangkatan() + 
                               " ---> Waktu Kedatangan: " + penerbangan.getWaktuKedatangan());
            System.out.println("Harga Tiket: Rp." + penerbangan.getHargaTiket());
        }
    }
}
