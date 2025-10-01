import java.util.Scanner;
public	class
PRAK105_2210817210031_KevinMaleakhi { public static void main(String[] args) {
    Scanner input = new Scanner(System.in); final double PHI = 3.14; System.out.print("Masukkan	jari-jari	: ");
    double jariJari = input.nextDouble(); System.out.print("Masukkan tinggi : "); double tinggi = input.nextDouble(); double volumeM3 = (PHI * Math.pow(jariJari
            / 100, 2) * tinggi / 100) * 1000000;
    System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n", jariJari, tinggi, volumeM3);
    input.close();
}
}
