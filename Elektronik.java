public class Elektronik extends produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

public Elektronik (String nama, String merek, double harga, int stok, int garansiTahun {
    super(nama, harga, stok);
    this.merek = merek;
    this. garansiTahun = garansiTahun;
}

public String getMerek(){
    return merek;
}

public int getGaransiTahun(){
    return garansiTahun;
}

    @Override
    public void tampilInfo(){
        System.out.println("ELEKTRONIK");
        System.out.println("Nama : " + getNama());
        System.out.println("Merek :" + merek());
        System.out.println("Garansi" + garansiTahun+ "tahun");
        System.out.println("----------");
    }

    public double hitungDiskon(int jumlahBeli, double persenPajak){
        return hitungTotalHarga(jumlahBeli) * PPN;
    }
    public void setgaransi (int gar
        if(garansi < 0){
            System.out.println("Masa garansi Tidak Boleh Negatif");
        }else{
            this.garansi = garansi;
        }
    }

}