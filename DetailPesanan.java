class DetailPesanan {

    public int idItemPesanan;
    public int idPesanan;
    public int idProduk;
    public int jumlah;
    public int hargaSatuan;

    public void DetailPesanan (int iditempesanan, int idpesanan, int idproduk, int jmlh, int hargasatuan){
        idItemPesanan = iditempesanan;
        idPesanan = idpesanan;
        idProduk = idproduk;
        jumlah = jmlh;
        hargaSatuan = hargasatuan;
    }
public int getIdItemPesanan() {
    return idItemPesanan;
}
public int getIdPesanan() {
    return idPesanan;
}
public int getIdProduk() {
    return idProduk;
}
public int getJumlah() {
    return jumlah;
}
public int getHargaSatuan() {
    return hargaSatuan;
}
    
}
