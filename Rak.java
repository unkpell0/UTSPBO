public class Rak {
    private String kode;
    private Koleksi[] isi = new Koleksi[3];
    private int jumlah;

    public Rak(String kode) { this.kode = kode; }

    public boolean taruh(Koleksi k) {
        if (isiPenuh()) {
            System.out.println("Rak " + kode + " penuh, koleksi \""
                    + k.judul + "\" tidak dapat ditambahkan.");
            return false;
        }
        isi[jumlah++] = k;
        return true;
    }

    public boolean isiPenuh() { return jumlah >= isi.length; }

    public Koleksi[] getIsi() { return isi; }
}