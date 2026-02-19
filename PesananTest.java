class Pesanan {

    public String namaLengkapPembeli;
    public String username;
    public int idPesanan;
    public int idPembeli;
    public String totalHarga;
    public String status;
    public int waktuPesanan;

    public void mengisiData(String nama, String user, int idpesanan, int idpembeli, String totalharga, String stat,
            int waktupesanan) {
        namaLengkapPembeli = nama;
        username = user;
        idPesanan = idpesanan;
        idPembeli = idpembeli;
        totalHarga = totalharga;
        status = stat;
        waktuPesanan = waktupesanan;
    }

    public String mengambilNamaPembeli() {
        return namaLengkapPembeli;
    }

    public String mengambilUserPembeli() {
        return username;
    }

    public int mengambilIdPesanan() {
        return idPesanan;
    }

    public int mengambilIdPembeli() {
        return idPembeli;
    }

    public String membuatTotalHarga() {
        return totalHarga;
    }

    public String memunculkanStatus() {
        return status;
    }

    public int membuatWaktuPesanan() {
        return waktuPesanan;
    }
}

public class PesananTest {
    public static void main(String[] args) {
        Pesanan p = new Pesanan();

        p.mengisiData("nadhif", "d_19", 00, 01, "Rp.20000", "dibuang", 12);
        System.out.println("nama: " + p.mengambilNamaPembeli());
        System.out.println("user: " + p.mengambilUserPembeli());
        System.out.println("idpesanan: " + p.mengambilIdPesanan());
        System.out.println("idpembeli: " + p.mengambilIdPembeli());
        System.out.println("totalharga: " + p.membuatTotalHarga());
        System.out.println("status: " + p.memunculkanStatus());
        System.out.println("waktupesanan: " + p.membuatWaktuPesanan());
    }
}
