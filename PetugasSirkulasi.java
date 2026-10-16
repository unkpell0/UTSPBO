public class PetugasSirkulasi {
    private String nama;

    public PetugasSirkulasi(String nama) { this.nama = nama; }

    // hanya mencetak, tidak menyimpan hasil
    public void cetakDenda(Koleksi k) {
        System.out.println("=== Rincian Denda ===");
        System.out.println("Koleksi   : " + k.judul + " (" + k.getJenis() + ")");
        System.out.println("Terlambat : " + k.hariTerlambat + " hari");
        System.out.println("Denda     : Rp" + k.hitungDenda());
    }
}