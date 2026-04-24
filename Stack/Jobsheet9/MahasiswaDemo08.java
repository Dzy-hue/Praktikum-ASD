package Stack.Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa08 stack = new StackTugasMahasiswa08(5);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas(Terakhir)");
            System.out.println("4. Melihat Tugas Terbawah(Pertama)");
            System.out.println("5. Menghitung Jumlah Tugas");
            System.out.println("6. Melihat Daftar Tugas");
            System.out.println("7. Keluar");    
            System.out.print("Pilih opsi: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa08 mhs = new Mahasiswa08(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa08 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        sc.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa08 lihatTeratas = stack.peekTeratas();
                    if (lihatTeratas != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihatTeratas.nama);
                    }
                    break;
                case 4:
                    Mahasiswa08 lihatBawah = stack.peekBawah();
                    if (lihatBawah != null) {
                        System.out.println("Tugas terbawah dikumpulkan oleh " + lihatBawah.nama);
                    }
                    break;
                case 5:
                    stack.hitungTugas();
                    break;
                case 6:
                    System.out.println("Daftar semua Tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 7);
        sc.close();
    }
}