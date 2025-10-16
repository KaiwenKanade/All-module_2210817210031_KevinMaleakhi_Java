package soal3;
import java.util.ArrayList;
import java.util.Scanner;
class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaList = new
                ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1.	Tambah Mahasiswa");
                    System.out.println("2.	Hapus Mahasiswa berdasarkan NIM");
                            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
                                    System.out.println("4.	Tampilkan Daftar Mahasiswa");
                                            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String	nama	=
                            input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String	nim	=
                            input.nextLine();Mahasiswa  mahasiswa  =  new Mahasiswa(nama, nim);mahasiswaList.add(mahasiswa);
                    System.out.println("Mahasiswa " + nama+ " ditambahkan");
                    break; case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    nim = input.nextLine(); boolean found = false;
                    for	(int	i	=	0;	i	< mahasiswaList.size(); i++) {
                        if (mahasiswaList.get(i).getnim().equals(nim)) {
                            mahasiswaList.remove(i);
                            found = true; break;
                        }
                    }
                    if (found) System.out.println("Mahasiswa dengan NIM " + nim + " dihapus");
                    else {
                        System.out.println("Mahasiswa tidak ditemukan");
                    }
                    break; case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    nim = input.nextLine(); found = false;
                    for	(int	i	=	0;	i	< mahasiswaList.size(); i++) {
                        if (mahasiswaList.get(i).getnim().equals(nim)) {Mahasiswa  mahasiswa1
                                    = mahasiswaList.get(i);
                            System.out.println("NIM: " + mahasiswa1.getnim() + ", Nama: " + mahasiswa1.getNama());
                            found = true; break;
                        }
                    }
                    if (!found) {
                        System.out.println("Mahasiswa tidak ditemukan");
                    }
                    break;
                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mahasiswa1 : mahasiswaList) {
                        System.out.println("NIM: " + mahasiswa1.getnim() + ",	Nama:	" + mahasiswa1.getNama());
                    }
                    break; case 0:
                    mahasiswaList.clear();
                    System.out.println("Terima kasih!");
                    return; default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}
