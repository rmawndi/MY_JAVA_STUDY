package icehs.science.chapter05;

public class GuGuDanTest {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 9; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				
				if(j < 9) {
					System.out.print(i + "*" + j + "=" + i*j + ",\t");
				}else {
					System.out.print(i + "*" + j + "=" + i*j); 
				}
				
			} 
			
			System.out.println();
		}

	}

}
