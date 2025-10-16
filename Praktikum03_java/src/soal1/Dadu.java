package soal1;
import java.util.Random; public class Dadu {
    private int nilai;
    public void acak_nilai(){
        Random nilaiRan = new Random(); nilai = nilaiRan.nextInt(6)+1;
    }
    public int getNilai(){ return nilai;
    }
}
