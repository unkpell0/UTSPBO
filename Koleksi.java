public abstract class Koleksi {
    protected String kode;
    protected String judul;
    protected int hariTerlambat;
    protected Anggota peminjam;

    public Koleksi(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
    }

    public void setPeminjam(Anggota peminjam) { this.peminjam = peminjam; }
    public void setHariTerlambat(int hariTerlambat) {
        this.hariTerlambat = Math.max(hariTerlambat, 0);
    }

    public abstract int hitungDenda();
    public abstract String getJenis();
}