public class AntrianKRS21 {
    Mahasiswa21[] data;
    int front;
    int rear;
    int size;
    int max;
    int jmlDilayani = 0;
    
    public AntrianKRS21(int max){
        this.max = max;
        this.data = new Mahasiswa21[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty(){
        if(size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        } else{
            return false;
        }
    }

    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa21 mhs){
        if(IsFull()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public Mahasiswa21 layaniMahasiswa21(){
        if(IsEmpty()){
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa21 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void prosesKRS(){
        if(size < 2){
            System.out.println("Data yang dibutuhkan untuk diproses kurang");
            return;
        }
        
        System.out.println("Proses KRS pada 2 Mahasiswa");
        for (int i = 0; i < 2; i++) {
            Mahasiswa21 mhs = layaniMahasiswa21();
            System.out.print(" - ");
            mhs.tampilkanData();
            jmlDilayani++;
        }
    }

    public void tampilkanSemua(){
        if(IsEmpty()){
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDuaTerdepan(){
        if(IsEmpty()){
            System.out.println("Antrian kosong.");
        } else{
            System.out.println("Dua Mahasiswa Terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = front; i < front + 2; i++) {
                data[i].tampilkanData();
            }
        }
    }
    
    public void lihatAkhir(){
        if(IsEmpty()){
            System.out.println("Antrian kosong.");
        } else{
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    
    public int getJumlahAntrian(){
        return size;
    }

    public int getJmlDilayani(){
        return jmlDilayani;
    }

    public int getSisaDilayani(){
        return 30 - jmlDilayani;
    }
    
}
