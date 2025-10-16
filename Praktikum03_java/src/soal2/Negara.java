package soal2;
public class Negara {
    private String nama, jenisKepemimpinan, namaPemimpin;
    private int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan	= jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin; this.tanggalKemerdekaan	=
                tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan; this.tahunKemerdekaan = tahunKemerdekaan;
    }
    public String getNama() { return nama;
    }
    public String getJenisKepemimpinan() { return jenisKepemimpinan;
    }
    public String getNamaPemimpin() { return namaPemimpin;
    }
    public int getTanggalKemerdekaan() { return tanggalKemerdekaan;
    }
    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }
    public int getTahunKemerdekaan() { return tahunKemerdekaan;
    }
}
