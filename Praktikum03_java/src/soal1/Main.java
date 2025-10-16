package soal1;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        LinkedList	<Dadu>	daduList=	new
                LinkedList<>();
        int jumlah_dadu = input.nextInt();

        for (int i = 0; i<jumlah_dadu; i++){
            Dadu Dadu = new Dadu(); Dadu.acak_nilai(); daduList.add(Dadu);
        }
        int total_nilai = 0;
        for (int i=0; i < daduList.size(); i++){ Dadu Dadu = daduList.get(i);
            int nilai = Dadu.getNilai(); System.out.println("Dadu ke-" + (i+1)
                    + " bernilai " + nilai);
            total_nilai += nilai;
        }
        System.out.println("Total	nilai	dadu keseluruhan "+ total_nilai);
    }
}
