public class Pembayaran {
    int daftar, obat, vit, dokter;

    public Pembayaran(int daftar, int obat, int vit, int dokter) {

        this.daftar = daftar;
        this.obat = obat;
        this.vit = vit;
        this.dokter = dokter;
    }

    int getTotal() {
        int res = this.daftar+this.obat+this.vit+this.dokter;

        return res;
    }
}
