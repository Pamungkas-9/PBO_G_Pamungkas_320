public class User {
    private String nama;
    private String nim;

    public User(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void login(String namaInput, String nimInput) {
        if (namaInput.equals(nama) && nimInput.equals(nim)) {
            System.out.println("Login Berhasil!");
        } else {
            System.out.println("Login gagal! coba lagi.");
        }
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
