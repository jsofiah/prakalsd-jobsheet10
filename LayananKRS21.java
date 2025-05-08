import java.util.Scanner;
public class LayananKRS21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS21 krs = new AntrianKRS21(10);
        int pilihan;

        do {
            System.out.println("=============================================");
            System.out.println("\t\tMenu Layanan KRS");
            System.out.println("=============================================");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Dua Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat Dua Mahasiswa Terdepan");
            System.out.println("5. Cek Antrian paling belakang");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa yang sudah dilayani");
            System.out.println("8. Jumlah Mahasiswa yang belum dilayani");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM      : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama     : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi    : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas    : ");
                    String kelas = sc.nextLine();
                    Mahasiswa21 mhs = new Mahasiswa21(nim, nama, prodi, kelas);
                    krs.tambahAntrian(mhs);
                    break;
                case 2:
                    krs.prosesKRS();
                    break;
                case 3:
                    krs.tampilkanSemua();
                    break;
                case 4:
                    krs.lihatDuaTerdepan();
                    break;
                case 5:
                    krs.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian: " + krs.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah sudah dilayani: " + krs.getJmlDilayani());
                    break;
                case 8:
                    System.out.println("Jumlah belum dilayani: " + krs.getSisaDilayani());
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}
