package FindingPrimeNumbersByUsingRecursiveMethods;
import java.util.Scanner;

public class FindingPrimeNumbersByUsingRecursiveMethods {
	public static void main(String[]args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir sayı girin: ");
	        int sayi = scanner.nextInt();

	        if (isAsal(sayi)) {
	            System.out.println(sayi + " sayısı asaldır.");
	        } else {
	            System.out.println(sayi + " sayısı asal değildir.");
	        }
	    }

	    // Recursive olarak asal sayı kontrolü yapan metot
	    public static boolean isAsal(int sayi) {
	        // Negatif sayılar ve 0, 1 asal sayı değildir
	        if (sayi <= 1) {
	            return false;
	        }
	        // 2 asal bir sayıdır
	        if (sayi == 2) {
	            return true;
	        }
	        // 2 hariç diğer çift sayılar asal değildir
	        if (sayi % 2 == 0) {
	            return false;
	        }
	        // sayi'nin kareköküne kadar olan tüm tek sayıları kontrol et
	        return isAsal(sayi, 3);
	    }

	    // Yardımcı metot, özyinelemeli olarak asal sayı kontrolü yapar
	    private static boolean isAsal(int sayi, int i) {
	        if (i * i > sayi) {
	            return true;
	        }
	        if (sayi % i == 0) {
	            return false;
	        }
	        return isAsal(sayi, i + 2);
	    }
		
}
	


