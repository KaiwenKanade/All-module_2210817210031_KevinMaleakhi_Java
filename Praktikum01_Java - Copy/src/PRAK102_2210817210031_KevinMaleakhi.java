import java.util.Scanner;
public	class
PRAK102_2210817210031_KevinMaleakhi { public static void main(String args[]){
    Scanner input = new Scanner(System.in); System.out.print(" ");
    int angkaAwal = input.nextInt(); int deretKe = 1;
    while (deretKe <= 11) { int hasil = angkaAwal;
        if (angkaAwal % 5 == 0) { hasil = angkaAwal / 5 - 1;
        }
        System.out.print( " " + hasil); angkaAwal++;
        deretKe++;
    }
    input.close();
}
}
