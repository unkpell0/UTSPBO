public class Majalah extends Koleksi {
    private String edisi;

    public Majalah(String kode, String judul, String edisi) {
        super(kode, judul);
        this.edisi = edisi;
    }

    @Override
    public int hitungDenda() {
        return hariTerlambat * 500;
    }

    @Override
    public String getJenis() { return "Majalah"; }
}