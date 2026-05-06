public class Elektronik extends produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    
    public Elektronik (String nama, double harga, int stok, String kategori, int garansi){
      super(nama, harga, stok, kategori);
      this.garansi = garansi;
    }

    @Override
    public void tampilInfo(){
        System.out.println("ELEKTRONIK");
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