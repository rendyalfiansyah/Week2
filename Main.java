import base.Produk;

public class Main{
    public static void main(String[] args) {
        produk p = new produk("Indoie goreng", 3500, 100, "makanan");
         System.out.println(p.stok);
         System.out.println(p.harga);
         System.out.println(p.kategori);
         System.out.println(p.nama);

         p.tampilInfo();
    }
}
