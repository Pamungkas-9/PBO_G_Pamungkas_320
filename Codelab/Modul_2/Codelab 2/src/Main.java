import java.util.Scanner;
class RekeningBank {
    private String nomor; // Atribut untuk menyimpan nomor
    private String nama; // Atribut untuk menyimpan nama
    private double saldo; // Atribut untuk menyimpan saldo

    // Konstruktor untuk menginisialisasi objek RekeningBank
    public RekeningBank(String nomor, String nama, double saldo) {
        this.nomor = nomor;
        this.nama = nama;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("═════════════════════════");
        System.out.println("   INFORMASI REKENING ");
        System.out.println("═════════════════════════");
        System.out.println("Nomor Rekening: " + nomor);
        System.out.println("Nama Pemilik: " + nama);
        System.out.println("Saldo: " + saldo);
    }

    // Metode untuk menyetor uang ke rekening
    public void setorUang(Scanner bank) {
        System.out.print(nama + " masukkan jumlah yang ingin disetor: Rp");
        double jumlah = bank.nextDouble();

        if (jumlah > 0) {
            saldo += jumlah;
            System.out.print(nama + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo );
        } else {
            System.out.println("Jumlah setor uang harus lebih dari Rp 0.");
        }

    }

    // Metode untuk menarik uang dari rekening
    public void tarikUang(Scanner bank) {
        System.out.print(nama + ", masukkan jumlah yang ingin ditarik: Rp");
        double jumlah = bank.nextDouble();

        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah ;
            System.out.print(nama + " manarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else if (jumlah > saldo) {
            System.out.print(nama + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            System.out.println("Jumlah tarik uang harus lebih dari Rp 0.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner bank = new Scanner(System.in); // Scanner untuk input pengguna

        // Membuat dua objek rekening dengan nilai yang diinginkan
        RekeningBank rekening1 = new RekeningBank("202410370110320", "Pamungkas", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370110304", "Ibrahim", 1000000);

        // Menampilkan informasi awal kedua rekening
        rekening1.tampilkanInfo();
        System.out.println(); // Memberikan spasi antar output
        rekening2.tampilkanInfo();
        System.out.println();

        // Proses penyetoran uang
        rekening1.setorUang(bank);
        System.out.println();
        rekening2.setorUang(bank);
        System.out.println();
        System.out.println();

        // Proses penarikan uang
        rekening1.tarikUang(bank);
        System.out.println();
        rekening2.tarikUang(bank);
        System.out.println();
        System.out.println();

        // Menampilkan informasi akhir setelah transaksi
        rekening1.tampilkanInfo();
        System.out.println();
        rekening2.tampilkanInfo();

        bank.close(); // Menutup scanner
    }
}