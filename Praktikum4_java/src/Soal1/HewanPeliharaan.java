package Soal1;
import java.util.Scanner; public class HewanPeliharaan {
    private String Nama, Ras;
    Scanner masukan = new Scanner(System.in); public HewanPeliharaan(String n, String r){
        this.Nama = n; this.Ras = r;
    }
    public void display(){
        System.out.print("Nama Hewan Peliharaan : ");
                Nama = masukan.nextLine(); System.out.print("Ras: "); Ras = masukan.nextLine();
        System.out.println("\nDetail	Hewan Peliharaan: ");
        System.out.println("Nama	Hewan Peliharaanku adalah: "+ Nama);
        System.out.println("Dengan	Ras	Kucing: "+Ras);
    }
}
