public class PetugasSirkulasi {
    private String nama;

    public PetugasSirkulasi(String nama) { this.nama = nama; }

    // hanya mencetak, tidak menyimpan hasil
    public void cetakDenda(Koleksi k) {
        String peminjam = (k.peminjam != null) ? k.peminjam.getNama() : "-";
        System.out.println("[" + k.getJenis() + "] " + k.kode + " " + k.judul
                + " | Peminjam: " + peminjam
                + " | Terlambat " + k.hariTerlambat + " hari"
                + " | Denda: " + k.hitungDenda());
    }
}