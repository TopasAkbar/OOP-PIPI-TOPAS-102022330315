class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
 // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    @Override
   public void Informasi(){
        super.Informasi();
        if (vipCard);
        System.out.println("Status : " + vipCard);
        System.out.println("Diskon 10% untuk di atas 3 jam");
        System.out.println("gratis minimun setiap 4 jam");
        System.out.println("prioritas booking komputer gaming");
    } 
    
    public void Login(String Username){
        System.out.println("Login dengan username : " + Username);
    }
    public void bermain(int jam){
        System.out.println("Bermain Selama : " + jam, "Jam");
    }
    
    public void bermain(int jam, int menitTambahan){
        System.out.println("tambah billing selana " + jam, "jam" + menitTambahan, "Menit");
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

}