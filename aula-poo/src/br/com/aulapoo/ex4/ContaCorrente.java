package br.com.aulapoo.ex4;

/**
 * Exercicio de poo sobre contas correntes
 * @author Harmfull
 *
 */
public class ContaCorrente {
	
	//atributos
	public double saldo; 
	private double valorSaque;
	public int conta; // a conta pode estar com ou sem dinheiro
	public double desconto;
	
	//métodos
	public void depositar(int deposito) {
		this.saldo = deposito;//realiza o depósito na conta
	}

	
	public void Sacar(int saque) {
		this.valorSaque = saque;
		if(this.valorSaque < 10) {
			System.out.println("voce não pode sacar");
		}else {
			this.saldo = this.saldo - this.valorSaque;
			System.out.println("Você sacou: " + this.valorSaque);
			
			this.desconto = (this.saldo * 3)/100;
			this.saldo = this.saldo - this.desconto;
			System.out.println("Foi descontado " + this.desconto + " do seu saque");
		}
	}
	
	public void verSaldo() {
		if(this.saldo == 0) {
			System.out.println("conta zerada");
		}else {
			System.out.println("sua conta tem: " + this.saldo + " Reais");
		}
		
		
	}
}
