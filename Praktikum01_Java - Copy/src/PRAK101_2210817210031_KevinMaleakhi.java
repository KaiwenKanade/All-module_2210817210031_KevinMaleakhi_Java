import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRAK101_2210817210031_KevinMaleakhi {
    public static void main(String[] args) throws IOException {
        String nama;
        String tempat_lahir;
        int tanggal_lahir, bulan_lahir, tahun_lahir, tinggi_badan;
        double berat_badan;

        String[] namaBulan = {
                "Januari", "Februari", "Maret",
                "April", "Mei", "Juni",
                "Juli", "Agustus", "September",
                "Oktober", "November", "Desember"
        };

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Masukkan Nama Lengkap: ");
        nama = br.readLine();

        System.out.print("Masukkan Tempat Lahir: ");
        tempat_lahir = br.readLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        tanggal_lahir = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Bulan Lahir: ");
        bulan_lahir = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Tahun Lahir: ");
        tahun_lahir = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Tinggi Badan (cm): ");
        tinggi_badan = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Berat Badan (kg): ");
        berat_badan = Double.parseDouble(br.readLine());

        String namaBulanLahir = (bulan_lahir >= 1 && bulan_lahir <= 12)
                ? namaBulan[bulan_lahir - 1]
                : "Bulan Tidak Valid";

        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Tempat, Tanggal Lahir: " + tempat_lahir + ", " + tanggal_lahir + " " + namaBulanLahir + " " + tahun_lahir);
        System.out.println("Tinggi Badan: " + tinggi_badan + " cm");
        System.out.println("Berat Badan: " + berat_badan + " kg");
    }
}
