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
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; 
		
		int media = gastosTrimestre / 3;
		
		System.out.println("O gasto trimestral é: " + gastosTrimestre);
		System.out.println("Média: " + media);
		
		//calculo de multiplicação 
		int gastoMulti = gastosJaneiro * gastosFevereiro * gastosMarco;
		System.out.println("gasto multiplicado: " + gastoMulti);
	}

}
