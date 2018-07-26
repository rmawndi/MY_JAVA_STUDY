package icehs.science.chapter07;

public class ItboohTest {

	public static void main(String[] args) {
		Itbooh sql = new Itbooh("SQL Plus", 50000, 5.5);
		Itbooh java = new Itbooh("Java 2.0", 28000, 2.3);
		Itbooh jsp = new Itbooh("Jsp servlet", 37000, 6.9);
		
		System.out.println();
		
		System.out.println(sql.getTitle() + "정가와 할인율을 변경합니다.");
		sql.setDiscountRate(9.5);
		sql.ItboohInfo();
		
		System.out.println();
		
		System.out.println(java.getTitle() + "정가를 변경합니다.");
		java.setPrice(33000);
		java.ItboohInfo();
		
		System.out.println();
		
		System.out.println(jsp.getTitle() + "제목과 할인률을 변경합니다.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscountRate(12.6);
		jsp.ItboohInfo();
		
		
		
		
		
		
		
				

	}

}
