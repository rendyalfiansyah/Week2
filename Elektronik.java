public class Elektronik extends produk {
    private int garansi;
    public Elektronik (String nama, double harga, int stok, String kategori, int garansi){
      super(nama, harga, stok, kategori);
      this.garansi = garansi;
    }

    public void tampilkanData(){
        super.tampilInfo();
        System.out.println("Masa garansi:" + garansi + "Hari");
    }

    public void setgaransi (int garansi){
        if(garansi < 0){
            System.out.println("Masa garansi Tidak Boleh Negatif");
        }else{
            this.garansi = garansi;
        }
    }

}