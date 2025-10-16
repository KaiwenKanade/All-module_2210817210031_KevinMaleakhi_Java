package soal2;
import java.util.HashMap; import java.util.LinkedList; import java.util.Scanner; public class Main2 {
    public static void main(String[] args) { Scanner input = new Scanner(System.in); LinkedList<Negara>	negaraList	=	new
            LinkedList<>();
        HashMap<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari"); bulanMap.put(2, "Februari"); bulanMap.put(3, "Maret"); bulanMap.put(4, "April"); bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli"); bulanMap.put(8, "Agustus"); bulanMap.put(9, "September"); bulanMap.put(10, "Oktober"); bulanMap.put(11, "November"); bulanMap.put(12, "Desember");
        int jumlahNegara = input.nextInt(); input.nextLine();
        for (int i = 0; i < jumlahNegara; i++) { String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine(); int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0; int tahunKemerdekaan = 0; if
            (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                tanggalKemerdekaan	=
                        input.nextInt();
                input.nextLine();
                bulanKemerdekaan	=
                        input.nextInt();
                input.nextLine();
                tahunKemerdekaan	=
                        input.nextInt();
                input.nextLine();
            }
            Negara infonegara = new Negara(nama, jenisKepemimpinan,	namaPemimpin,
                    tanggalKemerdekaan,	bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(infonegara);
        }
        for (int i = 0; i < negaraList.size(); i++)
        {
            Negara negara = negaraList.get(i); if
        (negara.getJenisKepemimpinan().equalsIgnoreCase("m onarki")) {
            System.out.println("Negara " + negara.getNama() + " mempunyai Raja bernama " + negara.getNamaPemimpin());
        }	else	if (negara.getJenisKepemimpinan().equalsIgnoreCase("p residen")) {
            System.out.println("Negara " + negara.getNama() + " mempunyai Presiden bernama " + negara.getNamaPemimpin());
            System.out.println("Deklarasi Kemerdekaan	pada	Tanggal		"		+ negara.getTanggalKemerdekaan()	+	"		"	+ bulanMap.get(negara.getBulanKemerdekaan()) + " " +
                    negara.getTahunKemerdekaan());
        } else {
            System.out.println("Negara " + negara.getNama() + " mempunyai Perdana Menteri bernama " + negara.getNamaPemimpin());
            System.out.println("Deklarasi Kemerdekaan	pada	Tanggal		"		+ negara.getTanggalKemerdekaan()	+	"		"	+ bulanMap.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan());
        }
            System.out.println();
        }
    }
}
