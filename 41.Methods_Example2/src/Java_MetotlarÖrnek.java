import java.util.Scanner;

public class Java_MetotlarÖrnek {
	static boolean hesap_aktif = true;
	static int hak_sayisi = 3;

	public static void main(String[] args) {
		// Kullanıcının uygulamaya giriş yapmasını sağlayalım 3 hakkı olsun
		// 3 hakkını doldurduğu zaman hesabını disable yapalım , doğru girer ise sisteme giriş yapsın
		Scanner input = new Scanner(System.in);
		

		if (hesap_aktif) {

			if (hak_sayisi > 0) {
				while (hesap_aktif) {
					System.out.print("Kullanıcı Adınız : ");
					String username = input.nextLine();
					
					System.out.print("Şifreniz : ");
					String password = input.nextLine();
					
					  boolean sonuc =  login(username, password); // boolean dönene değeri değişken ile yakalıyorum	// metodun parametrelerine değişken de gönderebilirim , yazabilirim
					 if (sonuc) {
						 System.out.println("Sisteme başarılı bir şekilde giriş yaptınız .");
						 break; // break direkt döngüden çıkıyordu continue ise atlama yapıp döngünün başına geliyordu hatırlatma
				      	}
					 else { // sonuc true değilse ve eğer hak sayisi 0 eşit ise aktiflik durumunu false yap ve döngüden çık
						 if (hak_sayisi==0) {
							 hesap_aktif=false; // hesabı pasif hale getirdim
							 break; // döngüyü kırdım bir daha soru soramayacak
						}
						
					}
					 						 }
				   }  
				
					if (hesap_aktif==false) {
						System.out.println("Hak sayınız dolmuştur.");
					}
			   } else 
					System.out.println("Hesabınız aktif değildir , lütfen yöneticiniz ile iletişime geçiniz ! ");
		
					input.close();
		}

	

	public static boolean login(String username, String password) {

		// Kullanıcı adı ; Ali Osman ---- Şifre : 5858
		if (username.equals("Ali Osman") && password.equals("5858")) { // equals metodu iki tane string metini eşit mi  diye karşılaştırır ve sonuca göre true yada false değer döndürür.
			return true;
		} else {
			hak_sayisi--;
			System.out.println("Kullanıcı adı ve şifreniz yanlış!! ");
			return false;
		}

	}

}
