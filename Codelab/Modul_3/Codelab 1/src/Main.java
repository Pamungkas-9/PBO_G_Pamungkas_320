class KarakterGame{
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang" + target.getNama() + "!");
    }
}

class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println("➜ " + target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("➜ " + target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}
public class Main {
    public static void main(String[] args) {
        KarakterGame umum = new KarakterGame("karakter Umum", 100);
        Pahlawan hero = new Pahlawan("Brimstone", 150);
        Musuh villain = new Musuh("Viper", 200);

        System.out.println("=== Status Awal ===");
        System.out.println(hero.getNama() + " memiliki kesehatan: " + hero.getKesehatan());
        System.out.println(villain.getNama() + " memiliki kesehatan: " + villain.getKesehatan());
        System.out.println();

        hero.serang(villain);
        villain.serang(hero);
    }
}