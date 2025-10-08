package prak02_02;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols; public class Kopi {
    String namaKopi, ukuran, Pembeli; double harga;
    public void setPembeli(String Pembeli) { this.Pembeli = Pembeli;
    }
    public String getPembeli() { return Pembeli;
    }
    public double getPajak() { double pajak = harga * 0.11; return pajak;
    }
    public void info() {
        DecimalFormatSymbols	symbols	=	new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.'); DecimalFormat	df	=	new
                DecimalFormat("###0.0", symbols); System.out.println("Nama	Kopi:	"	+
                namaKopi);
        System.out.println("Ukuran: " + ukuran); System.out.println("Harga:	Rp.	"	+
                df.format(harga));
    }
}
