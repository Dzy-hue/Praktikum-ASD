package Stack.Jobsheet9;

public class StackTugasMahasiswa08 {
    Mahasiswa08[] stack;
    int top, size;

    public StackTugasMahasiswa08(int size) {
        this.size = size;
        stack = new Mahasiswa08[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa08 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa08 pop() {
        if (!isEmpty()) {
            Mahasiswa08 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa08 peekTeratas() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public Mahasiswa08 peekBawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void hitungTugas() {
        if (!isEmpty()) {
            int jumlah = top + 1;
            System.out.println("Banyaknya tugas yang sudah dikumpulkan saat ini: " + jumlah);
        } else {
            System.out.println("Belum ada tugas yang dikumpulkan (0)");
        }
    }
    
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}