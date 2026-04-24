package Stack.Jobsheet9;

public class StackSurat08 {
    Surat08[] tumpukanSurat;
    int top, size;

    public StackSurat08(int size) {
        this.size = size;  
        tumpukanSurat = new Surat08[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // 1. Terima Surat izin (Push)
    public void push(Surat08 surat) {
        if (isFull()) {
            System.out.println("Tumpukan penuh! Tidak bisa menerima surat izin lagi.");
        } else {
            top++;
            tumpukanSurat[top] = surat;
            System.out.println("Surat izin dari " + surat.namaMahasiswa + " diterima.");
        }
    }

    // 2. Proses Surat izin (Pop)
    public Surat08 pop() {
        if (isEmpty()) {
            System.out.println("Tumpukan surat masih kosong. Belum ada surat masuk untuk diproses.");
            return null;
        } else {
            Surat08 surat = tumpukanSurat[top];
            top--;
            return surat;
        }
    }

    //3. Lihat Surat izin terakhir (Peek)
    public Surat08 peekTeratas() {
        if (isEmpty()) {
            System.out.println("Tumpukan surat masih kosong. Belum ada surat yang masuk.");
            return null;
        } else {
            return tumpukanSurat[top];
        }
    }

    // 4. Cari Surat izin berdasarkan Nama (Sequential Search mundur dari Top)
    public void cariSurat(String nama) {
        if (isEmpty()) {
            System.out.println("Tumpukan surat masih kosong. Belum ada surat yang masuk.");
        } else {
            boolean ditemukan = false;
            for (int i = top; i >= 0; i--) {
                if (tumpukanSurat[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("\n--- Surat Izin Ditemukan ---");
                    System.out.println("Posisi Surat     : Tumpukan ke-" + (top - i + 1));
                    System.out.println("ID Surat         : " + tumpukanSurat[i].idSurat);
                    System.out.println("Nama Mahasiswa   : " + tumpukanSurat[i].namaMahasiswa);
                    System.out.println("Kelas            : " + tumpukanSurat[i].kelas);
                    System.out.println("Jenis Izin       : " + (tumpukanSurat[i].jenisIzin == 'S' || tumpukanSurat[i].jenisIzin == 's' ? "Sakit" : "Izin lain"));
                    System.out.println("Durasi           : " + tumpukanSurat[i].durasi + " hari");
                    ditemukan = true;
                    break; // keluar dari loop setelah menemukan surat pertama dengan nama yang cocok
                }
            }
            if (!ditemukan) {
                System.out.println("Surat izin dengan nama " + nama + " tidak ditemukan.");
            }
        }
    }
}
