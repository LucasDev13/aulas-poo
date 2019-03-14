package br.com.aulapoo.ex1;

/**
 * 
 * @author Harmfull
 *
 */
public class BalancoTrimestral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarço = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarço; 
		
		int media = gastosTrimestre / 3;
		
		System.out.println("O gasto trimestral é: " + gastosTrimestre);
		System.out.println("Média: " + media);
		System.out.println("Realizado o commit e push 11/03/19");

	}

}
