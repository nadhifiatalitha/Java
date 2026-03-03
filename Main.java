import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        User u = new User();
        u.User(12345677, "nahnahnah", "Nadhif", "nadhif@gmail.com", "nonono");

        System.out.println("===== USER =====");
        System.out.println("User ID: " + u.getUserId());
        System.out.println("Username: " + u.getUsername());
        System.out.println("Nama: " + u.getNamaLengkapPembeli());
        System.out.println("Email: " + u.getEmail());
        System.out.println("Password: " + u.getKataSandi());

        Pesanan p = new Pesanan();
        p.mengisiData("nadhif", "d_19", 00, 01, "Rp.20000", "dibuang", 12);

        System.out.println("=====PESANAN=====");
        System.out.println("nama: " + p.mengambilNamaPembeli());
        System.out.println("user: " + p.mengambilUserPembeli());
        System.out.println("idpesanan: " + p.mengambilIdPesanan());
        System.out.println("idpembeli: " + p.mengambilIdPembeli());
        System.out.println("totalharga: " + p.membuatTotalHarga());
        System.out.println("status: " + p.memunculkanStatus());
        System.out.println("waktupesanan: " + p.membuatWaktuPesanan());

        DetailPesanan Dp = new DetailPesanan ();
        Dp.DetailPesanan(9100, 01, 65, 3, 55999);

        System.out.println("=====DETAIL PESANAN=====");
        System.out.println("Id Item Pesanan:" + Dp.getIdItemPesanan());
        System.out.println("Id Pesanan:"+ Dp.getIdPesanan());
        System.out.println("Id Produk:" + Dp.getIdProduk());
        System.out.println("Jumlah:" + Dp.getJumlah());
        System.out.println("Harga Satuan:" + Dp.getHargaSatuan());


    }
}