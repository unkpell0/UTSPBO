public class Perpustakaan {
    private String nama;
    private Rak[] daftarRak;
    private Pustakawan kepala;

    public Perpustakaan(String nama, int jumlahRak) {
        this.nama = nama;
        // Komposisi: Rak dibuat di dalam Perpustakaan
        daftarRak = new Rak[jumlahRak];
        for (int i = 0; i < jumlahRak; i++) {
            daftarRak[i] = new Rak("R" + (i + 1));
        }
    }

    public void setKepala(Pustakawan kepala) { this.kepala = kepala; }

    // simpan di rak pertama yang belum penuh
    public void simpanKoleksi(Koleksi k) {
        for (Rak r : daftarRak) {
            if (!r.isiPenuh()) {
                r.taruh(k);
                return;
            }
        }
        System.out.println("Semua rak penuh, koleksi \"" + k.judul + "\" tidak dapat disimpan.");
    }

    // simpan di rak tertentu (nomor mulai dari 1)
    public void simpanKoleksi(Koleksi k, int nomorRak) {
        if (nomorRak < 1 || nomorRak > daftarRak.length) {
            System.out.println("Rak nomor " + nomorRak + " tidak ada.");
            return;
        }
        daftarRak[nomorRak - 1].taruh(k);
    }

    public void tampilInfo() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Kepala : " + (kepala != null ? kepala.getNama() : "-"));
        for (int i = 0; i < daftarRak.length; i++) {
            System.out.print("Rak " + (i + 1) + ": ");
            for (Koleksi k : daftarRak[i].getIsi()) {
                if (k != null) System.out.print("[" + k.getJenis() + ": " + k.judul + "] ");
            }
            System.out.println();
        }
    }
}