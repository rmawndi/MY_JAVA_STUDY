package icehs.science.chapter07;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		
		Book book2 = new Book("�ظ�����", 15000);
		Book book3 = new Book("Į�� �뷡", "����" );
		Book book4 = new Book("�ٶ��� ��","�Ѻ��" , 39200 );
		
		book1.printBookInfo();
		book2.printBookInfo();
		book3.printBookInfo();
		book4.printBookInfo();
		

	}

}
