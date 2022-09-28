package methods;

public class Main {

	public static void main(String[] args) {
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();
		

	}
	//camel casing
	public static void sayıBulmaca() {
		int[] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 10;
		
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break; //break döngüyü bitir demek
			}
		}
		
		String mesaj="";
		if(varMi) {  //true yazmakla varMi yazmak aynı şey
			mesaj = "Sayı mevcuttur:"+aranacak;
			mesajVer(mesaj);
		}else {
			mesajVer("Sayı mevcuttur değildir:"+aranacak);
		}

	}
	public static void mesajVer(String mesaj) {
		System.err.println(mesaj);
		
	}
	
	}

