public class Main {
    public static void main(String[] args) {
        Perpustakaan p = new Perpustakaan("Perpustakaan Kampus", 2);
        p.setKepala(new Pustakawan("198001", "Budi"));

        Koleksi b1 = new Buku("B1", "Pemrograman Web", "Andi");
        Koleksi b2 = new Buku("B2", "Basis Data", "Siti");
        Koleksi m1 = new Majalah("M1", "Tech Monthly", "Ed. 10");
        Koleksi m2 = new Majalah("M2", "Sains Populer", "Ed. 5");

        p.simpanKoleksi(b1);
        p.simpanKoleksi(b2);
        p.simpanKoleksi(m1);       // rak 1 penuh
        p.simpanKoleksi(m2, 1);    // ditolak dengan pesan
        p.simpanKoleksi(m2);       // masuk rak 2
        p.tampilInfo();

        Anggota a = new Anggota("A1", "Marvel");
        b1.setPeminjam(a);         // anggota meminjam lewat setPeminjam
        m1.setPeminjam(a);         // satu anggota bisa meminjam banyak koleksi

        PetugasSirkulasi petugas = new PetugasSirkulasi("Sari");
        b1.setHariTerlambat(30);
        m1.setHariTerlambat(30);
        petugas.cetakDenda(b1);    // Rp20000 (kena batas maksimal)
        petugas.cetakDenda(m1);    // Rp15000
    }
}