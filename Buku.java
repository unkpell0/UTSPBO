public class Buku extends Koleksi {
    private String penulis;

    public Buku(String kode, String judul, String penulis) {
        super(kode, judul);
        this.penulis = penulis;
    }

    @Override
    public int hitungDenda() {
        return Math.min(hariTerlambat * 1000, 20000);
    }

    @Override
    public String getJenis() { return "Buku"; }
}