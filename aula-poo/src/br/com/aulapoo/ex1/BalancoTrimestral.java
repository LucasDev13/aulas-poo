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
		int gastosMar�o = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMar�o; 
		
		int media = gastosTrimestre / 3;
		
		System.out.println("O gasto trimestral �: " + gastosTrimestre);
		System.out.println("M�dia: " + media);
		System.out.println("Realizado o commit e push 11/03/19");

	}

}
