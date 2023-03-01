package lesson017;

import java.util.Stack;

public class StackOrnek {

	// ekleme islemi:

	// stack--> Lıfo
	// bir tane stack olusturalıö
	// birkac int deger atalom
	// bu stack i yazdıralım

	// stack bosalana kadar butun elemanları yazdıralım.
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		
		stack.add(1);
		stack.add(513);
		stack.add(123);
		stack.add(23);// boolean donuyor
		System.out.println(stack.add(23));// true yazar
		stack.push(70);// integer donuyor
		System.out.println(stack.push(23));// 23 yazar
		System.out.println("\n" + stack);

//	for(Integer integer : stack) {
//		System.out.println(integer);
//	}

		System.out.println("\n* * * * * \n");

		System.out.println(stack);
		for (int i = stack.size(); i > 1; i--) {
			stack.pop();
			System.out.println(stack);
		}
		// ustteki dongu sunu yazar:
//				[1, 513, 123, 23, 23, 70, 23]
//				[1, 513, 123, 23, 23, 70]
//				[1, 513, 123, 23, 23]
//				[1, 513, 123, 23]
//				[1, 513, 123]
//				[1, 513]
//				[1]
//				[]


		System.out.println("\n* * * * * \n");

//		while (!stack.isEmpty()) {
//			System.out.print(stack.pop()+", ");
//			//23, 70, 23, 23, 123, 513, 1, 
//		}
		
		System.out.println(stack);
		// 100den kucuk degerleri toplayıp stackten cıkaralım 100den buyukleri de farklı bir stackin icine atalım
		// toplamı ve yeni stacki yazdıralım...{

			
		int toplam=0;
		while(!stack.isEmpty()) {
			if(stack.peek() <100 ) {
				toplam += stack.peek(); // direkt stack.pop da yazabilirim. hem çıkar hem ekle gibi
				stack.pop();
			}
			else
				stack2.push(stack.pop());
				
		}
	
		System.out.println(toplam);
		System.out.println(stack2);
		
		
		

	}
}
