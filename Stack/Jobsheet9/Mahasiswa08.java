package Stack.Jobsheet9;

public class Mahasiswa08 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa08() {
    }

    Mahasiswa08(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}