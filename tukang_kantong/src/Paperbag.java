
import java.text.DecimalFormat;
import java.util.Scanner;

public class Paperbag {
    DecimalFormat df = new DecimalFormat();
    static Scanner sc = new Scanner(System.in);
    static private double bunga = 0.025;

    private String ktp, nama;
    private int pilUkuran,lamaPinjam;

    public Paperbag() {
           pl("--------------------<*>--------------------");
        pl("");
        pl("Silahkan Masukan Data Anda ");
        pl("--------------------<*>--------------------");
        p("Masukan nama peminjam \t:");
        nama = sc.nextLine();
        p("Masukan KTP Peminjam \t:");
        ktp = sc.nextLine();
        pl("");
        getUkuranPaperBag();
        p("Masukan Pilihan : ");
        pilUkuran = sc.nextInt();
        sc.nextLine();
        p("Masukan Berapa Lama Pinjam (Bulan) : ");
        lamaPinjam = sc.nextInt();
        pl("===============================");
         pl("Anda Memilih Paket XL ");
        pl("Dengan Pinjam : Rp."+df.format(getHarga()));
        pl("Dengan Bunga : Rp." + df.format(bunga * getHarga()));
        pl("");
        pl("------------------------------------------------");
        pl("----------- Total Kewajiban Pinjaman -----------");
        pl("------------------------------------------------");
        pl("Nama Peminjam : "+nama);
        pl("Kewajiban Bulanan : Rp."+df.format((getHarga() + (bunga * getHarga()))/lamaPinjam));
        pl("");
        // pl(String.valueOf((bunga * getHarga()) + Double.valueOf(getHarga())));
        pl("Total Pinjaman : Rp." + df.format(getHarga() + (bunga * getHarga())));
        
    }
     // Helper
    static void p(String text) {
        System.out.print(text);
    }

    static void pl(String text) {
        System.out.println(text);
    }
     void getUkuranPaperBag() {
        pl("===============================");
        pl("Pilih Ukuran PaperBag");
        pl("===============================");
        pl("1. XL");
        pl("2. L");
        pl("3. M");
    }



    int getHarga() {
        int harga = 0;
        if (pilUkuran == 1) {
            harga = 3000000;
        } else if (pilUkuran == 2) {
            harga = 2000000;
        } else if (pilUkuran == 3) {
            harga = 1000000;
        }
        return harga;
    }
    String getUkuran() {
        String uk = "";
        if (pilUkuran == 1) {
            uk = "XL";
        } else if (pilUkuran == 2) {
            uk = "L";
        } else if (pilUkuran == 3) {
            uk = "M";
        }
        return uk;
    }
}

