package collection1;
import java.util.ArrayList;

public class ListTest1 {
	public static void main(String[] args) {
		
		
		//safafs
//		generic <>  기본형을 객체로 감싼 타입인 wrapper 클래스인 integer, Double
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println(arrayList);
		arrayList.add(30);
//		System.out.println(arrayList);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(100);
		
		System.out.println(arrayList.size());
		
		int tot = 0;
		
		
//	    1) 인덱싱으로 값 가져와서 누적을 좀 더 배운후 할것
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//			
//			int value = arrayList.get(i);
//			tot += value;
//		}
		
		for (int value : arrayList ) {
			tot += value;
		}
		
		System.out.println(tot/arrayList.size());
		
		
		
	}

	
	
}
