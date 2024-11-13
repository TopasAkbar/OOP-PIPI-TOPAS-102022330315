public class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    @Override
    public void Informasi(){
        super.Informasi();
        if(ruangPrivat);
        System.out.println("Ruangan Ber Ac pribadi");
        System.out.println("sofa gaming");
        System.out.println("komputer spesifikasi tinggi");
        System.out.println("koneksi internet 100 mbps");
    }

    public void pesan(int nomorKomputer){
        System.out.println("Memesan Komputer nomor : " + nomorKomputer);
    }
    
    public void TambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan : " + makanan);
    }
    public void TambahLayanan(String makanan, String Minuman){
        System.out.println("Menambah layanan makanan : " + makanan, "Dan Minuman : " + Minuman);
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    
}
