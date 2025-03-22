import java.awt.*;
import java.util.Scanner;
class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(String userInput, String passInput) {
        if (userInput.equals(username) && passInput.equals(password)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }
}

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void login(String namaInput, String nimInput) {
        if (namaInput.equals(nama) && nimInput.equals(nim)) {
            displayInfo();
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }

    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin("Admin320", "password320");
        Mahasiswa mahasiswa = new Mahasiswa("Muchammad Pamungkas Sakti Nur Wisisono", "202410370110320");

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();
        System.out.println();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan username: ");
                String userAdmin = input.nextLine();
                System.out.print("Masukkan password: ");
                String passAdmin = input.nextLine();
                admin.login(userAdmin, passAdmin);
                break;

            case 2:
                System.out.print("Masukkan Nama: ");
                String namaMaha = input.nextLine();
                System.out.print("Masukkan NIM: ");
                String nimMaha = input.nextLine();
                mahasiswa.login(namaMaha, nimMaha);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }
}
