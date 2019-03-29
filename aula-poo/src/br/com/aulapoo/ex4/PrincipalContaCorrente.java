package br.com.aulapoo.ex4;

/**
 * Exercicio de poo sobre contas correntes
 * Classe main
 * @author Harmfull
 *
 */
public class PrincipalContaCorrente {

	public static void main(String[] args) {


		ContaCorrente cc = new ContaCorrente();
		cc.verSaldo();
		cc.depositar(100);
		cc.verSaldo();
		cc.Sacar(65);
		cc.verSaldo();
		

	}

}
