package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager [] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(),
				new TarimKrediManager(),new OgrenciKrediManager()};
		
		
		for (BaseKrediManager krediMeneger:krediManagers) {
			System.out.println(krediMeneger.hesapla(1000));
			
		}
			
				
		
	}

}
