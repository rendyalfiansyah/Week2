public class Makanan {

} extends produk {
    private int kedaluwarsa;
    private String kategori;

    public Makanan(String nama, double harga, int stok, String kategori, int expired) { // Konstruktor untuk kelas makanan
        super(nama, harga, stok, kategori);
        this.kedaluwarsa= kedaluwarsa;
        this.kategori= kategori;
    }
    
    public String getKedaluwarsa() {
        return kedaluwarsa;
    }
    public String getKategori(){
        return kategori;
    }

    @Override
    public void tampilInfo() { 
        System.out.println("MAKANAN");
        System.out.println("Kategori:" + kategori);
        System.out.println("Kedaluwarsa:" + kedaluwarsa);
        System.out.println("-------");
    }


    public doule hitungDiskon(int jumlahBeli) {
        if(jumlahBeli >= 10)
            return hitungTotalHarga(jumlahBeli)* 0.05;
        return 0;
    }

     public double hitungDiskon(int jumlahBeli, double persenDiskon){
        return hitungTotalHarga(jumlahBeli) * (persenDiskon / 100);
    }
     public double hitungHargaSetelahDiskon(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) - hitungDiskon(jumlahBeli);
    }
     

    public void setExpired(int expired, String type) { // Setter untuk atribut expired
        if (type.equals("Nasi")) {
            if (expired > 4){
                System.out.println("Masa Expired Tidak Boleh Negatif ");
            } else {
                this.expired = expired;
            }
        } else {
            if (expired < 2) {
                System.out.println("Masa expired tidak boleh nol atau negatif.");
            } else {
                this.expired = expired;
            }
        }
    
    }
}