public class Pasien {
    String nama, alamat, telp, ket;
    public String getKet() {
        return ket;
    }
    public void setKet(String ket) {
        this.ket = ket;
    }
    int optPoli, optDokter;
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getTelp() {
        return telp;
    }
    public void setTelp(String telp) {
        this.telp = telp;
    }
    public int getOptPoli() {
        return optPoli;
    }
    public void setOptPoli(int optPoli) {
        this.optPoli = optPoli;
    }
    
    public int getOptDokter() {
        return optDokter;
    }
    
    public void setOptDokter(int optDokter) {
        this.optDokter = optDokter;
    }

    public boolean validateOption(int opt) {
        boolean cont = false;
        if (opt > 3 || opt <= 0 ) {
            cont = true;
        }

        return cont;
    }

    public String getOptPoliString(int optPoli) {
        String res = "";
        if (optPoli == 1) {
            res = "Gigi";
        } else if (optPoli == 2) {
            res = "Anak";
        } else if (optPoli == 3) {
            res = "Umum";
        }
        return res;
    }
    
      public String getOptDokterString(int optDr) {
        String res = "";
        if (optDr == 1) {
            res = "Drg. Ahmad Afandi";
        } else if (optDr == 2) {
            res = "Dr. Aris Wicaksono";
        } else if (optDr == 3) {
            res = "Dr. Alfia Putri";
        }
        return res;
    }

    
}
