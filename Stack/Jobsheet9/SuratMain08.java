package Stack.Jobsheet9;

import java.util.Scanner;

public class SuratMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat08 stack = new StackSurat08(4);
        int menu;

        do {
            System.out.println("\n=== SISTEM SURAT IZIN MAHASISWA JTI ===");
            System.out.println("1. Menerima Surat Izin");
            System.out.println("2. Memproses dan Memverifikasi Surat Izin Terakhir Diterima");
            System.out.println("3. Melihat Surat Izin Terakhir Diterima");
            System.out.println("4. Mencari Surat (Berdasarkan Nama Mahasiswa)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n--- Input Data Surat Baru ---");
                    System.out.print("ID Surat         : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa   : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas            : ");
                    String kelas = sc.nextLine();
            
                    char jenis;
                    while (true) {
                        System.out.print("Jenis Izin (S/I) : ");
                        jenis = sc.nextLine().charAt(0);

                        if (jenis == 'S' || jenis == 's' || jenis == 'I' || jenis == 'i') {
                            break;
                        } else {
                            System.out.println("Input tidak valid! Harap hanya ketik 'S' atau 'I'.");
                        }
                    }
                    
                    System.out.print("Durasi (hari)    : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat08 SuratMasuk = new Surat08(id, nama, kelas, jenis,  durasi);
                    stack.push(SuratMasuk);
                    break;
                case 2:
                    System.out.println("\n--- Memproses Surat Izin JTI---");
                    Surat08 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat ID " + diproses.idSurat + " milik " + diproses.namaMahasiswa + " Kelas " + diproses.kelas + " keterangan (" + diproses.jenisIzin + ") " + diproses.durasi + " hari telah diproses dan diverifikasi");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Surat Izin Teratas JTI ---");
                    Surat08 teratas = stack.peekTeratas();
                    if (teratas != null) {
                        System.out.println("Surat terakhir diajukan oleh: " + teratas.namaMahasiswa + " kelas " + teratas.kelas + " dengan id " + teratas.idSurat + " keterangan (" + teratas.jenisIzin + ") " + teratas.durasi + " hari");
                    }
                    break;
                case 4: 
                    System.out.println("\n--- Pencarian Surat Izin JTI---");
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 0:
                    System.out.println("Terimakasih telah menggunakan program. sampai jumpa kembali...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (menu != 0);
        sc.close();
    }
}
