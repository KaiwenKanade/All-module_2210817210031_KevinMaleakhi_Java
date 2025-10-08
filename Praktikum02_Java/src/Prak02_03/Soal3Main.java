public class Soal3Main {
    public static void main(String[] args) { Pegawai p1 = new Pegawai();
// baris ini kurang tanda ;
// p1.nama = "Roi" p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
// pada baris ini harus di buat properti dari umur agar bisa menghasilkan output yg sesuai
//contoh: p1.umur = 17; p1.umur = 17; p1.setJabatan("Assasin");
// Print output diubah menjadi Nama saja
//System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama	:	"	+ p1.getNama());
        System.out.println("Asal:	"	+ p1.getAsal());
        System.out.println("Jabatan:	"	+ p1.jabatan);
//pernyataan p1.umur error karena tidak ada nilai propertynya dan perlu ditambah kalimat tahun pada ujung outputnya.
//System.out.println("Umur: " + p1.umur); System.out.println("Umur: " + p1.umur + "tahun");
    }
}
