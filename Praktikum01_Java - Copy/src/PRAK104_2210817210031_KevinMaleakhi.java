import java.util.Scanner;
public	class
PRAK104_2210817210031_KevinMaleakhi
{
    public static void main(String[] args) {
        Scanner	input	=	new Scanner(System.in);
        System.out.print("Tangan	Abu: ");
                String	abuRonde1	= input.next().toUpperCase();
        String	abuRonde2	=
                input.next().toUpperCase();
        String	abuRonde3	= input.next().toUpperCase();
        System.out.print("Tangan Bagas: ");
                String	bagasRonde1	= input.next().toUpperCase();
        String	bagasRonde2	= input.next().toUpperCase();
        String	bagasRonde3	= input.next().toUpperCase();
        int poinAbu = 0; int poinBagas = 0;
        if	(abuRonde1.equals("B")	&& bagasRonde1.equals("G") ||
                abuRonde1.equals("G") && bagasRonde1.equals("K") ||
                abuRonde1.equals("K") && bagasRonde1.equals("B")) {
            poinAbu++;
        }	else	if (bagasRonde1.equals("B")	&& abuRonde1.equals("G") ||
                bagasRonde1.equals("G") && abuRonde1.equals("K") ||
                bagasRonde1.equals("K") && abuRonde1.equals("B")) {
            poinBagas++;
        }
        if	(abuRonde2.equals("B")	&& bagasRonde2.equals("G") ||
                abuRonde2.equals("G") && bagasRonde2.equals("K") ||
                abuRonde2.equals("K") && bagasRonde2.equals("B")) {
            poinAbu++;
        }	else	if (bagasRonde2.equals("B")	&& abuRonde2.equals("G") ||
                bagasRonde2.equals("G") && abuRonde2.equals("K") ||
                bagasRonde2.equals("K") && abuRonde2.equals("B")) {
            poinBagas++;
        }
        if	(abuRonde3.equals("B")	&& bagasRonde3.equals("G") ||
                abuRonde3.equals("G") && bagasRonde3.equals("K") ||
                abuRonde3.equals("K") && bagasRonde3.equals("B")) {
            poinAbu++;
        }	else	if (bagasRonde3.equals("B")	&& abuRonde3.equals("G") ||
                bagasRonde3.equals("G") && abuRonde3.equals("K") ||
                bagasRonde3.equals("K") && abuRonde3.equals("B")) {
            poinBagas++;
        }
        if (poinAbu > poinBagas) { System.out.println("Pemenang: Abu");
        } else if (poinBagas > poinAbu)
        {
            System.out.println("Pemenang: Bagas");
        } else {
            System.out.println("Hasil: Seri");
        }
        input.close();
    }
}
