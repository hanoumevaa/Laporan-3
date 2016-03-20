package lap3overlod;

public class apotek {

    private String nama;
    private String alamat;
    private int jum;
    private int obat1, obat2, obat3, obat4, obat5;
    private int harga[] = {14000, 16000, 18000, 8000, 25000};
    private int total;

    public apotek() {
        nama = "";
        alamat = "";
    }

    public apotek(String a, String b) {
        nama = a;
        alamat = b;
    }

    public void jumlah(int x) {
        jum = x;
    }

    public int obat1() {
        return obat1 = jum * harga[0];
    }

    public int obat2() {
        return obat2 = jum * harga[1];
    }

    public int obat3() {
        return obat3 = jum * harga[2];
    }

    public int obat4() {
        return obat4 = jum * harga[3];
    }

    public int obat5() {
        return obat5 = jum * harga[4];
    }

    public void Total() {
        total = obat1 + obat2 + obat3 + obat4+obat5;
    }

    public int getTotal() {
        return total;
    }

    public void displayMessage() {
        System.out.println("======Apotek Harapan======");
        System.out.println("Nama        : " + nama);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Total       : Rp. " + getTotal());
    }
}
