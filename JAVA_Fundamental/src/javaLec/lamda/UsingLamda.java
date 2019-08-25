package javaLec.lamda;

import java.util.Arrays;
import java.util.Comparator;

public class UsingLamda {
	
	public static void main(String[] args) {
		
		//about lamda
		
//		MyFunc addF1 = new MyFunc(){
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10;
//			}
//		};
		
		/*** 1?¨κ³? : ?΄??€λ₯? ??€?€ ***/
//		MyFunc addF1 =
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10;
//			}
		
		/*** 2?¨κ³? : λ©μ? ?΄λ¦μ ??€?€ : ?¬κΈ°μλΆ??΄ ?Έ ? ??€. ?μ§?λ§? ? μ€μΌ ? ?? ***/
//		MyFunc addF1 =(int x, int y)->{return x+y+10;};

		/*** 3?¨κ³? : ?λ£ν? ??€?€. ? ?€ ??μ§? ? ?€ ??μ§? ?΄?Ό??€. ??λ§? ?λ£ν λΆ??¬ λΆκ?***/
//		MyFunc addF1 =(x, y)->{return x+y+10;};
		
		/*** 4?¨κ³? : λ¦¬ν΄? ??€?€.***/
		MyFunc addF1 =(x, y)->x+y+10;
		
//		MyFunc addF2 = new MyFunc(){
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10+20;
//			}
//		};
		MyFunc addF2 = 	(x, y)->x+y+10+20;
		System.out.println(addF2.calculator(10, 10));
		
		
		
//		System.out.println(new MyFunc(){
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10+20+30;
//			}
//		}.calculator(10, 10));
		
		
		String[] names = new String[] {"e","b","c","f","a","d"};
//		?€λ¦μ°¨?
//		Arrays.sort(names);
		
//		?΄λ¦Όμ°¨?
//		Arrays.sort(names,new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s2.compareTo(s1);
//			}
//		});
		
//		?΄λ¦Όμ°¨?(??€?)
		Arrays.sort(names,(s1, s2)->s2.compareTo(s1));
		System.out.println(Arrays.toString(names));
	}
}

























