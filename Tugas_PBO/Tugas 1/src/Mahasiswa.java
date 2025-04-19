public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login(String namaInput, String nimInput) {
        if (namaInput.equals(getNama()) && nimInput.equals(getNim())) {
            displayInfo();
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa Berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}
