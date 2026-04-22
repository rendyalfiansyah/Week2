
public class Main{
    public static void main(String[] args) {
    produk p = new produk("baju", 1000.0, 10, "unique");

    System.out.println(p.getNama());
    System.out.println(p.getHarga());

    p.setHarga(20000.0);
    System.out.println(p.getHarga());

 }
}
