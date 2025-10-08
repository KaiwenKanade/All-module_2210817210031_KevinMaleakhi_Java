package prak02_01;

class Soal1Main {
    public static void main(String[] args){
        Buah Apel = new Buah("Apel", 0.4, 7000.0,700000.00, 40.0 );
        Buah Mangga = new Buah("Mangga", 0.2, 3500.00,262500.00, 15.0 );
        Buah Alpukat = new Buah("Alpukat", 0.25, 10000.0,480000.00, 12.0 );

        Apel.info_buah();
        System.out.println(" ");
        Mangga.info_buah();
        System.out.println(" ");
        Alpukat.info_buah();
    }
}
