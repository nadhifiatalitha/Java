import java.util.ArrayList;
class User {
   

    public int userId;
    public String username;
    public String namaLengkapPembeli;
    public String email;
    public String kataSandi;

    private ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

    public void User (int userid, String user, String nama, String Email, String katasandi){ 
        userId = userid;
        username = user;
        namaLengkapPembeli = nama;
        email = Email;
        kataSandi = katasandi;
    }

    public void tambahPesanan(Pesanan p) {
        daftarPesanan.add(p);
    }

    public int getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getNamaLengkapPembeli() {
        return namaLengkapPembeli;
    }
    public String getEmail() {
        return email;
    }
    public String getKataSandi() {
        return kataSandi;
    }

}

