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
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
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
    
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi08 stack = new StackKonversi08();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}