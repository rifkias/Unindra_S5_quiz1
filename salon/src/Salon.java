import java.util.Scanner;

public class Salon {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String nama, telpon;
        Perawatan perawatan = new Perawatan();
        Sewa sewa = new Sewa();


        pnl("   ----  Selamat Datang di Salon Cantika ---- ");
        pnl(" =============================================== ");
        p("Masukan Nama Pelanggan \t\t : ");
        nama = sc.nextLine();
        p("Masukan No.Telp Pelanggan \t : ");
        telpon = sc.nextLine();
        String opt1;
        pnl(" ----------------------o0o----------------------  ");
        p("Lakukan Transaksi ? [y/t]");
        opt1 = sc.nextLine();
        pnl(" ----------------------o0o----------------------  ");
        if (opt1.equals("y") || opt1.equals("Y")) {
            pnl("");
            String pilih;
            do {
                pnl("Menu Pilihan yang tersedia :");
                pnl("1. Perawatan");
                pnl("2. Penyewaan");
                pnl(" ----------------------o0o----------------------  ");
                p("Pilihan Menu :");
                int opt2;
                opt2 = sc.nextInt();
                pnl(" ----------------------o0o----------------------  ");
                if (opt2 == 1) {
                    perawatan.actionMenu();
                } else if (opt2 == 2) {
                    sewa.actionMenu();
                }
                p("Press Any Key To Continue");
                sc.nextLine();
                sc.nextLine();
                // System.out.print("Input Lagi [y/t] : ");
                p("Input Lagi [y/t] : ");
                pilih = sc.nextLine();
            } while (pilih.equals("Y") || pilih.equals("y"));

            pnl("Total yang harus dibayar : "+(perawatan.getTotalHarga() + sewa.getTotalHarga()));
        }
        pnl("Terima Kasih " + nama + " sudah datang di salon Cantika");
        pnl("Membuat Anda Cantik Adalah Keahlian Kami");
    }
    
    // Helper
    static void p(String text) {
        System.out.print(text);
    }

    static void pnl(String text){
        System.out.println(text);
    }
}
