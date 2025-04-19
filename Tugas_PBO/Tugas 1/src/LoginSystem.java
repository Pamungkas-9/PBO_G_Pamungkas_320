import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User umum = new User("nama", "2024");
        Admin admin = new Admin("Pamungkas", "320", "Admin320", "password320");
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
