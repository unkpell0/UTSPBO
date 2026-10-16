public class Main {
    public static void main(String[] args) {
        Perpustakaan p = new Perpustakaan("Perpustakaan Kampus", 2);
        p.setKepala(new Pustakawan("198001", "Budi"));

        Koleksi b1 = new Buku("B-01", "Pemrograman Java", "Andi");
        Koleksi b2 = new Buku("B-02", "Struktur Data", "Siti");
        Koleksi m1 = new Majalah("M-01", "Info Komputer", "Ed. 10");

        p.simpanKoleksi(b1);
        p.simpanKoleksi(b2);
        p.simpanKoleksi(m1);

        Anggota rafi = new Anggota("A1", "Rafi");
        Anggota nadia = new Anggota("A2", "Nadia");

        b1.setPeminjam(rafi);
        b2.setPeminjam(nadia);
        m1.setPeminjam(rafi);   // satu anggota meminjam banyak koleksi

        b1.setHariTerlambat(4);
        b2.setHariTerlambat(25);
        m1.setHariTerlambat(6);

        PetugasSirkulasi petugas = new PetugasSirkulasi("Sari");
        petugas.cetakDenda(b1);
        petugas.cetakDenda(b2);
        petugas.cetakDenda(m1);
    }
}