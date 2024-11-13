import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    private static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Penumpang penumpang;

    public static void main(String[] args) {
        daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000.0f));
        daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000.0f));
        tampilkanMenu();
    }

    public static void tampilkanMenu() {
        while (true) {
            System.out.println("====EAD Ticket Booking System====");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    pesanTiket();
                    break;
                case 3:
                    cekPesananTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    return;
                default:
                    System.out.println("tidak valid.");
            }
        }
    }

    public static void tampilkanDaftarPenerbangan() {
        System.out.println("\n=== Daftar Penerbangan ===");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ". Penerbangan " + daftarPenerbangan.get(i).getNomorPenerbangan());
        }
        System.out.println();
    }

    public static void pesanTiket() {
        System.out.println("\n=== Silahkan Isi Data Diri ===");
        System.out.print("Masukkan NIK: ");
        String NIK = scanner.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String depan = scanner.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String belakang = scanner.nextLine();

        tampilkanDaftarPenerbangan();
        System.out.print("Pilih nomor penerbangan : ");
        int nomorPenerbangan = scanner.nextInt();
        scanner.nextLine();

        if (nomorPenerbangan > 0 && nomorPenerbangan <= daftarPenerbangan.size()) {
            Penerbangan penerbanganDipilih = daftarPenerbangan.get(nomorPenerbangan - 1);
            penumpang = new Penumpang(NIK, depan, belakang, penerbanganDipilih);

            System.out.println("Pesanan Tiket Berhasil Dilakukan.");
            penumpang.tampilDaftarPenumpang();
        } else {
            System.out.println("Nomor penerbangan tidak valid.");
        }
    }

    public static void cekPesananTiket() {
        if (penumpang == null) {
            System.out.println("Anda belum memesan tiket.");
        } else {
            System.out.println("\n=== Detail Tiket Penerbangan ===");
            penumpang.tampilDaftarPenumpang();
            System.out.println();
        }
    }
}
