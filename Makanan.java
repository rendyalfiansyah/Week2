public class Makanan extends produk {
    private int expired;

    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }
    
    @Override 
    public void tampilInfo(){
        System.out.println("MAKANAN");
        super.tampilInfo();
        System.out.println("Masa Expired:" + expired + "Hari");
    } 
  
    public void setExpired (int expired, String type){ // penambahan overloading
    if (type. equals("Nasi")){
        if(expired < 0){
            System.out.println("Masa Expired Tidak Boleh Negatif");
        }else{
            this.expired = expired;
     }else{
        if (expired < 2) {
         System.out.println ("Masa Expired Tidak Boleh Negatif");
        }else{
            this.expired = expired;
        }
        }
        }
        }


    