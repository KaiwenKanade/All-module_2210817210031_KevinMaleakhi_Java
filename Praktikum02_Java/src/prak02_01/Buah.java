package prak02_01;

public class Buah { String Nama;
    double Berat, jumlah_beli, Harga, harga_sebelum_diskon,	total_diskon, harga_setelah_diskon;
    public Buah(String Nama, double Berat, double Harga, double harga_sebelum_diskon, double jumlah_beli){
        this.Nama =Nama; this.Berat =Berat; this.Harga =Harga; this.harga_sebelum_diskon
                =harga_sebelum_diskon;
        this.jumlah_beli =jumlah_beli;
    }
    public void harga_diskon() {
        double potongan = Math.floor(jumlah_beli
                / 4) * 0.02 * Harga * 4;
        total_diskon = potongan; harga_setelah_diskon	=
                harga_sebelum_diskon - total_diskon; System.out.println("Total Diskon: Rp" +
                String.format("%.2f", total_diskon)); System.out.println( "Harga Setelah Diskon: Rp"	+	String.format("%.2f", harga_setelah_diskon));}
    public void info_buah() { System.out.println("Nama prak02_01.Buah: " + Nama); System.out.println("Berat: " + Berat + " kg");
            System.out.println("Harga: Rp" + Harga); System.out.println("Jumlah	Beli:	"	+
            jumlah_beli + "kg");
        System.out.println("Harga Sebelum Diskon: Rp"	+	String.format("%.2f", harga_sebelum_diskon));
        harga_diskon();
    }
}
