import java.util.Scanner;
public class QueueMain21 {
    public static void menu(){
        System.out.println("======================================");
        System.out.println("   Masukkan operasi yang diinginkan");
        System.out.println("======================================");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("======================================");
        System.out.print("Masukkan pilihan: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue21 Q = new Queue21(n);
        int pilih;
        boolean berjalan = true;

        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if(Q.IsFull()){
                        System.out.println("Queue Penuh. Program dihentikan");
                        berjalan = false;
                    } else{
                        System.out.print("Masukkan data baru: ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                    }
                    break;
                case 2:
                    if(Q.IsEmpty()){
                        System.out.println("Queue Kosong. Program dihentikan");
                        berjalan = false;
                    } else{
                        int dataKeluar = Q. Dequeue();
                        if(dataKeluar != 0){
                            System.out.println("Data yang dikeluarkan: " + dataKeluar);
                            break;
                        }
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while(pilih >= 1 && pilih <= 5 && berjalan);
    }
}
