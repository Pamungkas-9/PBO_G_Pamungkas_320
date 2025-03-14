class Hewan {
    private String nama; //Atribut untuk menyimpan nama hewan
    private String jenis; //Atribut untuk menyimpan jenis hewan
    private String suara; //Atribut untuk menyimpan suara hewan

    // Konstruktor untuk menginisialisasi objek Hewan
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("╔══════════════════════╗");
        System.out.println("   Informasi Hewan  ");
        System.out.println("╚══════════════════════╝");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println("------------------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan dengan nilai yang dinginkan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Menampilkan informasi hewan1
        hewan1.tampilkanInfo();
        System.out.println(); // Memberikan spasi antar output

        // Menampilkan informasi hewan2
        hewan2.tampilkanInfo();
    }
}