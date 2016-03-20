package lap3overlod;

import java.util.Scanner;

public class mainApotek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;
        System.out.print("Nama          : ");
        String n = in.nextLine();
        System.out.print("Alamat        : ");
        String al = in.nextLine();
        apotek pilihan = new apotek(n, al);

        System.out.println("");
        System.out.println("======Selamat Datang======");
        System.out.println("Daftar obat         Harga");
        System.out.println("1. Mefenamic Acid   14000");
        System.out.println("2. Paracetamol      16000");
        System.out.println("3. Amoxilin         18000");
        System.out.println("4. Procold           8000");
        System.out.println("5. OBH              25000");
        System.out.println("");
        System.out.print("Masukkan pilihan    : ");
        pil = in.nextInt();
        switch (pil) {
            case 1:
                System.out.print("Banyak Obat     : ");
                int a = in.nextInt();
                pilihan.jumlah(a);
                pilihan.obat1();
                break;
            case 2:
                System.out.print("Banyak obat     : ");
                a = in.nextInt();
                pilihan.jumlah(a);
                pilihan.obat2();
                break;
            case 3:
                System.out.print("Banyak Obat     : ");
                a = in.nextInt();
                pilihan.jumlah(a);
                pilihan.obat3();
                break;
            case 4:
                System.out.print("Banyak Obat     : ");
                a = in.nextInt();
                pilihan.jumlah(a);
                pilihan.obat4();
                break;
            case 5:
                System.out.print("Banyak Obat     : ");
                a = in.nextInt();
                pilihan.jumlah(a);
                pilihan.obat5();
                break;
            default:
                System.out.println("Maaf, jenis obat yang anda inginkan tidak tersedia");
        }
        pilihan.Total();
        pilihan.displayMessage();
    }
}
