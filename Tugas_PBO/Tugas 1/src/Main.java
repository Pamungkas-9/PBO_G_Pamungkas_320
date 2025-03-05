import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner identitas = new Scanner(System.in);

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = identitas.nextInt();
        identitas.nextLine();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan username: ");
                String useradmin = identitas.nextLine();
                System.out.print("Masukkan password: ");
                String passadmin = identitas.nextLine();

                String benar1 = "Admin320";
                String benar2 = "password320";

                if (useradmin.equals(benar1)  && passadmin.equals(benar2)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
                break;
            case 2:
                System.out.print("Masukkan Nama: ");
                String namamaha = identitas.nextLine();
                System.out.print("Masukkan NIM: ");
                String nimmaha = identitas.nextLine();

                String benar3 = "Muchammad Pamungkas Sakti Nur Wisisono";
                String benar4 = "202410370110320";

                if (namamaha.equals(benar3) && nimmaha.equals(benar4)) {
                    System.out.println("Login Mahasiswa berhasil!");
                    System.out.println("Nama: " + namamaha);
                    System.out.println("NIM: " + nimmaha);
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;

        }

        identitas.close();
    }
}