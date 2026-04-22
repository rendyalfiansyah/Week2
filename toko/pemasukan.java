package toko;

import base.produk;

class pemasukan extends produk {
    private double totalPemasukan;

    public Pemasukan(String nama, double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        this.totalPemasukan= 0;
        
    }

    Void tambahanPemasukan(int jumlah){
    if (jumlah == stok) {
        totalPemasukan += jumlah * harga;
        stok -= jumlah;
    
    }
    else {
        System.out.println("Stok tidak cukup");
    }
}
}

