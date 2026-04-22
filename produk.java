import javax.swing.border.StrokeBorder;

public class produk {
    private String nama;
    String kategori;
    private double harga;
    private int stok;

    public produk(String nama, double harga, int stok, String kategori){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;

    }

    public String getNama (){return nama;}
    public double getHarga(){return harga;}
    public int getStok () {return stok;}

    
    public void setHarga (double harga){
        this.harga = harga;
    }
     public void setStok (int stok){
        this.stok = stok;
    }
    

    public void tampilInfo(){
        System.out.println("produk: "+nama);
        System.out.println("kategori: "+kategori);
        System.out.println("harga: "+harga);
        System.out.println("stok: "+stok);
        System.out.println(".........");

    
    }
        
    }


