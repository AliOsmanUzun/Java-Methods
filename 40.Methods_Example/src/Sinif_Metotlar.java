import java.util.Scanner;


public class Sinif_Metotlar {
	public static void main(String[] args) {
		
		// Girilen sayıların  tek mi çift mi olduklarını bulalım ve ekrana yazdıralım.
		// koşul , döngü , dizi , method konularını kullanmaya çalışacağız.
		
		Scanner input = new Scanner(System.in);
		mesaj();
		int kacsayi = input.nextInt();
		input.nextLine();
		int[] sayilar = new int[kacsayi];
		for (int i = 0; i < sayilar.length; i++) {
			System.out.print("Lütfen "+ i +". sayıyı giriniz : ");
			sayilar[i]=input.nextInt();
			input.nextLine();
		}
		
		for (int i : sayilar) {
			
			tekMiciftMi(i); 
					 	
		} 
		
		input.close();
			
	}
	
	public static void tekMiciftMi(int sayi) {
		
		if (sayi%2==0) {
			 			System.out.println(sayi + " sayısı çift bir sayıdır ");
		} else {
				System.out.println(sayi + " sayısı tek bir sayıdır ");
		}
		
	}

	public static void mesaj() {
		System.out.println("*****SAYININ TEK Mİ ÇİFT Mİ OLDUĞUNU BULMA PROGRAMI*****");
		System.out.print("Kaç tane sayı gireceksiniz lütfen belirtiniz : ");
	}
}
