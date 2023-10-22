import java.util.Scanner;

public class Pinjaman {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int pil;
        pl("----- WELCOME TO THE SOLUTION OF MONEY -----");
        pl("============================================");
        pl("");
        pl("Silahkan Pilih Paket Pinjaman");
        pl("1. PAKET KARUNG");
        pl("2. PAKET PAPER BAG");
        pl("");
        p("Masukan Pilihan Paket : ");
        pil = sc.nextInt();
        if (pil == 1) {
            new Karung();
        } else if (pil == 2) {
            new Paperbag();
        }
        pl("");
        pl("");
        pl("Terima kasih sudah meminjam di THE SOLUTION OF MONEY");
        pl("Nantikan Sensasi ditagih rentenir dengan kejam :)");
        pl("");
        pl("");
        pl("================================================");
        pl("DENGAN BERHUTANG HIDUP JADI MENANTANG");
        pl("================================================");
    }

    // Helper
    static void p(String text) {
        System.out.print(text);
    }

    static void pl(String text) {
        System.out.println(text);
    }
}
