import java.util.Scanner;

public class Sewa {
    int jenisSewa = 0, jenisMenu = 0, jumlahJam = 0,harga = 0, totalHarga = 0;

    // Getter & Setter
    public int getJenisSewa() {
        return jenisSewa;
    }
    public void setJenisSewa(int jenisSewa) {
        this.jenisSewa = jenisSewa;
    }
    public int getJenisMenu() {
        return jenisMenu;
    }
    public void setJenisMenu(int jenisMenu) {
        this.jenisMenu = jenisMenu;
    }
    public int getJumlahJam() {
        return jumlahJam;
    }
    public void setJumlahJam(int jumlahJam) {
        this.jumlahJam = jumlahJam;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void addTotalHarga(int total_harga) {
        this.totalHarga = this.totalHarga + total_harga;
    }
    static Scanner sc = new Scanner(System.in);

    public void actionMenu() {
        pnl("*Jenis Sewa*");
        pnl("1. Rias Wajah");
        pnl("2. Baju Pengantin");
        pnl("3. Aksesoris");
        pnl(" ----------------------o0o----------------------  ");
        p("Pilihan Anda :");
        setJenisSewa(sc.nextInt());
        pnl(" ----------------------o0o----------------------  ");
        if (getJenisSewa() == 1) {
            pnl("Menu Rias Wajah");
            pnl("1. Rias Wajah Biasa Rp."+getHargaType(1,1));
            pnl("2. Rias Wajah (Make Up Artis) Rp."+getHargaType(1,2));
        } else if (getJenisSewa() == 2) {
            pnl("Menu Baju Pengantin");
            pnl("1. Baju Pengantin Adat Rp."+getHargaType(2,1));
            pnl("2. Baju Pengantin Internasional Rp."+getHargaType(2,2));
        } else if (getJenisSewa() == 3) {
            pnl("Menu Aksesoris");
            pnl("1. Aksesoris Anak Rp."+getHargaType(3,1));
            pnl("2. Aksesoris Dewasa Rp."+getHargaType(3,2));
        }
        pnl(" ----------------------o0o----------------------  ");
        p("Masukan Pilihan Anda :");
        setJenisMenu(sc.nextInt());
        pnl(" ----------------------o0o----------------------  ");
        p("Berapa Jam : ");
        setJumlahJam(sc.nextInt());
        setHarga(getHargaTotal());
        pnl("Data Tersimpan");
        pnl("Harga Sebesar : Rp." + getHarga());
        addTotalHarga(getHarga());
    }

    public int getHargaTotal() {
        return getHargaType(getJenisSewa(), getJenisMenu()) * getJumlahJam();
    }

    public int getHargaType(int opt1, int opt2) {
        int typeHarga = 0;
        if (opt1 == 1) {
            if (opt2 == 1) {
                typeHarga = 100000;
            } else if (opt2 == 2) {
                typeHarga = 250000;
            }
        } else if (opt1 == 2) {
            if (opt2 == 1) {
                typeHarga = 150000;
            } else if (opt2 == 2) {
                typeHarga = 350000;
            }
        } else if (opt1 == 3) {
            if (opt2 == 1) {
                typeHarga = 20000;
            } else if (opt2 == 2) {
                typeHarga = 50000;
            }
        }

        return typeHarga;
    }
    // Helper
    static void p(String text) {
        System.out.print(text);
    }

    static void pnl(String text) {
        System.out.println(text);
    }

}
