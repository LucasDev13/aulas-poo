package br.com.aulapoo.ex2;

import java.util.Calendar;

/**
 * 
 * @author Harmfull
 *
 */
public class ExIfElse {
	public static void main(String[] args) {
		int idade = 15;
		boolean amigoDoDono = true;
		if (idade < 18 && !amigoDoDono) {
			System.out.println("Não pode entrar");
		} else {
			System.out.println("Pode entrar");
		}
		
		//Método para pegar a data e hora local
		Calendar c = Calendar.getInstance();
		System.out.println("Data e hora atual: " + c.getTime());
		
		//Manipulando o Calendar
		System.out.println("Data/Hora atual: " + c.getTime());
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
		
		
		//Mostra o dia da semana, mês e ano
		c.set(Calendar.YEAR, 2039);
		c.set(Calendar.MONTH, Calendar.MARCH);
		c.set(Calendar.DAY_OF_MONTH, 20);
		
	}
}
