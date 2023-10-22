import java.util.Scanner;

public class Perawatan {
    int jenisPerawatan = 0, tipePerawatan = 0, harga = 0, jumlah = 0,totalHarga=0;

    static Scanner sc = new Scanner(System.in);
   
    // Getter Setter
    public int getTotalHarga() {
        return totalHarga;
    }

    public void addTotalHarga(int total_harga) {
        this.totalHarga = this.totalHarga + total_harga;
    }

    public int getJenisPerawatan() {
        return jenisPerawatan;
    }
    public void setJenisPerawatan(int jenisPerawatan) {
        this.jenisPerawatan = jenisPerawatan;
    }
    public int getTipePerawatan() {
        return tipePerawatan;
    }
    public void setTipePerawatan(int tipePerawatan) {
        this.tipePerawatan = tipePerawatan;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public void actionMenu() {
        pnl("*Jenis Perawatan*");
        pnl("1. Fasial Wash");
        pnl("2. Masker");
        pnl("3. Potong Rambut");
        pnl(" ----------------------o0o----------------------  ");
        p("Pilihan Anda :");
        setJenisPerawatan(sc.nextInt());
        pnl(" ----------------------o0o----------------------  ");
        if (getJenisPerawatan() == 1) {
            pnl("Menu Fasial Wash");
            pnl("1. Faisal Biasa");
            pnl("2. Fasial Emas");
        } else if (getJenisPerawatan() == 2) {
            pnl("Menu Masker");
            pnl("1. Masker Buah");
            pnl("2. Masker Lumpur");
        } else if (getJenisPerawatan() == 3) {
            pnl("Menu Potong Rambut");
            pnl("1. Tidak Keramas");
            pnl("2. Keramas");
        }
        pnl(" ----------------------o0o----------------------  ");
        p("Masukan Pilihan Anda :");
        setTipePerawatan(sc.nextInt());
        pnl(" ----------------------o0o----------------------  ");
        p("Berapa Orang : ");
        setJumlah(sc.nextInt());
        setHarga(getHargaTotal());
        pnl("Data Tersimpan");
        pnl("Harga Sebesar : Rp." + getHarga());
        addTotalHarga(getHarga());
    }

    public int getHargaTotal() {
        return getHargaType(getJenisPerawatan(), getTipePerawatan()) * getJumlah();
    }
    public int getHargaType(int jenisPerawatan,int typePerawatan) {
        int typeHarga = 0;
        if (jenisPerawatan == 1) {
            if (typePerawatan == 1) {
                typeHarga = 50000;
            } else if (typePerawatan == 2) {
                typeHarga = 100000;
            } 
        } else if (jenisPerawatan == 2) {
            if (typePerawatan == 1) {
                typeHarga = 40000;
            } else if (typePerawatan == 2) {
                typeHarga = 75000;
            } 
        }else if (jenisPerawatan == 3) {
            if (typePerawatan == 1) {
                typeHarga = 20000;
            } else if (typePerawatan == 2) {
                typeHarga = 35000;
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
