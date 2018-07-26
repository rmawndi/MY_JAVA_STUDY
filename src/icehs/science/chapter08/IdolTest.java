package icehs.science.chapter08;

public class IdolTest {

	public static void main(String[] args) {
		idol[] idols = new idol[4];
		
		idols[0] = new idol("소녀시대", "태연");
		idols[1] = new idol("씨스타", "보라");
		idols[2] = new idol("빅뱅", "지드래곤");
		idols[3] = new idol("비스트", "양요섭");
		
		
		for(int i = 0 ; i < idols.length ; i++) {
			System.out.println(idols[i].getGroup() + " : " + idols[i].getName());
		}
		
		
		
		
		
		/*System.out.println(idols[0].getGroup() + " : " + idols[0].getName());
		System.out.println(idols[1].getGroup() + " : " + idols[1].getName());
		System.out.println(idols[2].getGroup() + " : " + idols[2].getName());*/
		
				
		
		

	}

}
