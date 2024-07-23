
public class WorkSpace_Metotlar {

	public static void main(String[] args) {
		
		cikti();
		cikti();
		
		toplam(45, 34); // Tanımladığım parametrelere metodu çağırdığım zaman değer giriyorum
		
		isim_soyisim("Ali Osman","Uzun"); // String veri tipinde 2 tane para metre aldım ve bunları ekrana yazdırdım
		
		int metottanGelenSonuc = carp(6, 10); // metodum int veri tipinde bir sonuç dönüyor bu sonucu değişken ile yakalayıp ekrana yazdıralım
		System.out.println(metottanGelenSonuc);
		
		
		String adsoyadyazdir = isimDondurme("Ali Osman","Uzun");
		System.out.println(adsoyadyazdir);

		
	}

	// Parametresiz ve geriye değer döndürmeyen metot tanımlama
	// erisim_belirleyicisi dönüş_tipi methodun_adi ()

	public static void cikti() {
		System.out.println("Merhaba");
		System.out.println("Görüşürüz");
		System.out.println("Merhaba");
		System.out.println("Görüşürüz");
		System.out.println("Merhaba");
		System.out.println("Görüşürüz");
		System.out.println("Merhaba");
	     }
	
	// Parametreli ve geriye değer döndürmeyen metot tanımlama 	
	
	public static void toplam(int number1 , int number2) { // Parametre tanımlarken parantezin içine ilk olarak veritipini yazıyorum gelecek olan değerin veri tipinde
	
		int sonuc = number1 + number2 ;
		System.out.println("Sonuç : " + sonuc);
	}
	
	public static void isim_soyisim(String ad,String soyad) {
			
		System.out.println("İsim ve Soyisim : "+(ad+" "+soyad));
	}
	
	// Parametreli ve geriye döndüren metot tanimi
	
	public static int carp(int number1, int number2) { // Döndüreceğim değer neyse onun veri tipine uygun veri tipini metot adından önce yazıyorum
		
		int sonuc = number1*number2 ; 
		return sonuc; // Return bir değer üretir , metot içinde oluşturduğumuz değeri dışarı aktarmamızı sağlar
		
	}

	public static String isimDondurme(String ad , String soyad) {
		
		return (ad +" " + soyad); // Bir metodu sonlandırmak içinde return kullanırım yani return'den sonraki kodların hiç biri çalışmaz çünkü metot'dan çıkmış oluyorum. Bu yüzden return'den sonraki kodlarda ulaşılamaz oluyor.
	
	}
	

}

//Metotları kullanmamım temel amacı defalarca kullanmam gereken bir kod bloğunu
// tek bir defa kullanıp bir metod içinde ihtiyacım olduğunda çağırıp kullanmam.
// Böylece hem kod tekrarı olmayacak , hem de yapmak istediğim işi daha seri bir
// şekilde yapıcam
// Bir kodu bir kere yazıp metot ile her yerde kullanmak temel mantık
