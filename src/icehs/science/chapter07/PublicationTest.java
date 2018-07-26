package icehs.science.chapter07;

public class PublicationTest {

	public static void main(String[] args) {
		Pubilcation pub1 = new Pubilcation();
		
		System.out.println("=============츌판물 정보를 세팅합니다.================");
		pub1.setTitle("만화 삼국지");
		pub1.setPrice(-1000);
		pub1.setPrice(5000);
		pub1.setPage(-100);
		pub1.setPage(300);
		pub1.printPublicationInfo();

	}

}
