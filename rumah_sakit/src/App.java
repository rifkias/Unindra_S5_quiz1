import java.util.Scanner;

public class App {
        static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Pasien pasien = new Pasien();
        pl("----- SELAMAT DATANG DI RUMAH SEHAT TIDAK WARAS -----");
        pl("=====================================================");
        pl("");
        pl("--------------------<*>--------------------");
        pl("*Masukan Data Pasien*");
        p("Masukan Nama : ");
        pasien.setNama(sc.nextLine());
        p("Masukan Alamat : ");
        pasien.setAlamat(sc.nextLine());
        p("Masukan No. Telp : ");
        pasien.setTelp(sc.nextLine());
        pl("");
        pl("*Nama Poli*");
        pl("1. Gigi");
        pl("2. Anak");
        pl("3. Umum");
        pl("");
        int data;
        do{
            p("Pilih Poli :");
            int opt = sc.nextInt();
            pasien.setOptPoli(opt);
        } while (pasien.validateOption(pasien.getOptPoli()));
        pl("");
        pl("*Nama Dokter*");
        pl("1. Drg. Ahmad Afandi");
        pl("2. Dr. Aris Wicaksono");
        pl("3. Dr. Alfia Putri");
        pl("");
        do{
            p("Pilih Dokter :");
            int opt = sc.nextInt();
            pasien.setOptDokter(opt);
        } while (pasien.validateOption(pasien.getOptDokter()));
        pl("");
        pl("Berikan Keterangan Dokter \t: ");
        sc.nextLine();
        pasien.setKet(sc.nextLine());
        pl("");
        p("Masukan Biaya Pendaftaran \t: Rp.");
        int daftar = sc.nextInt();

        p("Masukan Biaya Obat \t\t: Rp.");
        int obat = sc.nextInt();

        p("Masukan Biaya Vitamin \t\t: Rp.");
        int vit = sc.nextInt();

        p("Masukan Biaya Dokter \t\t: Rp.");
        int dokter = sc.nextInt();
        
        Pembayaran pembayaran = new Pembayaran(daftar, obat, vit, dokter);

        pl("-------------------------<*>-------------------------");
        pl("=====================================================");
        pl("Poli \t\t : "+pasien.getOptPoliString(pasien.getOptPoli()));
        pl("Dokter \t\t : "+pasien.getOptDokterString(pasien.getOptDokter()));
        pl("Keterangan \t : "+pasien.getKet());
        pl("");
        pl("Total Biaya yang dibayar pasien adalah : " + pembayaran.getTotal());

        pl("");
        pl("Salah Sehat " + pasien.getNama() + " Dari Rumah Sehat Tidak Waras");
        

    }
    

    // Helper
    static void p(String text) {
        System.out.print(text);
    }

    static void pl(String text) {
        System.out.println(text);
    }
}
