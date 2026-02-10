import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         String tipeSoal = sc.next(); // Soal1, Soal2, dst

        switch (tipeSoal) {

            //  SOAL 1 
            case "Soal1": {
                int a = sc.nextInt();
                int b = sc.nextInt();

                // Deteksi overflow TANPA long, BigInteger, try-catch
                if (a > 0 && b > 0 && a > Integer.MAX_VALUE - b) {
                    System.out.println("OVERFLOW");
                } 
                else if (a < 0 && b < 0 && a < Integer.MIN_VALUE - b) {
                    System.out.println("OVERFLOW");
                } 
                else {
                    int hasil = a + b;
                    System.out.println(hasil);
                }
                break;
            }

           //  SOAL 2 
            case "Soal2": {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                float f1 = (float) x;
                float f2 = (float) y;

                float hasilFloat = f1 + f2;
                double hasilDouble = x + y;

                double selisih = Math.abs(hasilDouble - hasilFloat);

                System.out.printf("%.6f\n", selisih);
                break;
            }
            //  SOAL 3
            case "Soal3": {
                int N = sc.nextInt();

                Integer a = N;
                Integer b = a;

                a = a + 1;

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }
             //  SOAL 4
            case "Soal4": {
                String S = sc.next();

                String a = S;
                String b = new String(S);

                a = a + "X";

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }
             //  SOAL 5 
            case "Soal5": {
                String sInt = sc.next();
                String sDouble = sc.next();
                String sBool = sc.next();

                int i = Integer.parseInt(sInt);
                double d = Double.parseDouble(sDouble);
                boolean bool = Boolean.parseBoolean(sBool);

                double hasil = i * d;

                if (bool == false) {
                    hasil = hasil * -1;
                }

                System.out.printf("%.2f\n", hasil);
                break;
            }
        }

        sc.close();
    }
}

        
    
    
