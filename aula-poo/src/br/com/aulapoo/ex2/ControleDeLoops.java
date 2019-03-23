package br.com.aulapoo.ex2;

/**
 * 
 * @author Harmfull
 *
 */
public class ControleDeLoops {

	public static void main(String[] args) {
		int y = 30;
		for (int i = 1; i < y; i++) {
			if (i % 19 == 0) {
				System.out.println("Número divisivel por 19: " + i);
				break;
			}
		}
		
		for (int i = 0; i < 100; i++) {
			if (i>50 && i<60) {
				continue;
			}
			System.out.println("achou" + i);
		}

	}

}
