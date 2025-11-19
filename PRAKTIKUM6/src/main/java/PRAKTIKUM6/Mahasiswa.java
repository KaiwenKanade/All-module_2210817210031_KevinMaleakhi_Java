package PRAKTIKUM6;
public class Mahasiswa {
    String nama, nim;
    int id;
    public Mahasiswa(String nama, String nim, int id) {
        this.nama = nama;
        this.nim = nim;
        this.id = id;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}