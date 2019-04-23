package br.com.aulapoo.ex4;

/**
 * Exercicio de poo sobre contas correntes
 * @author Harmfull
 *
 */
public class ContaCorrente {
	
	//quando se trabalha com atributos, ele podem ser interceptado e modificado
	
	//atributos
	
	//private so é visto dentro da classe
	private double saldo; //quanto tem na conta - só pode ser executado nesta classe
	private double valorSaque;
	public int conta; // a conta pode estar com ou sem dinheiro
	public double desconto;
	
	
	//métodos
	//esse metodo não e publico porque ele e utilizado so dentro da classe
	private void juroSaque() {
		this.desconto = this.saldo * 3 /100;
//		System.out.println("Foi descontado " + this.saldo + " do seu saque");
	}
	
	private void juroVerSaldo() {
		this.saldo = (this.saldo * 1)/100;
//		this.saldo = this.saldo - this.desconto;
//		System.out.println("Foi descontado " + this.saldo + " do seu saque");
//		System.out.println("sua conta tem: " + this.saldo);
	}
	
	
	public void depositar(int deposito) {
		this.saldo += deposito;//realiza o depósito na conta
	}
	
	
	public void Sacar(int saque) {
		//this.valorSaque = saque;
		if(this.saldo < saque) {
			System.out.println("voce não pode sacar");
		}else {
			this.saldo = this.saldo - this.valorSaque;
			//this.juroSaque();
			System.out.println("Você sacou: " + this.valorSaque);
			//this.juroVerSaldo();
		}
	}
	
	public Double verSaldo() {
//		if(this.saldo == 0) {
//			System.out.println("conta zerada");
//		}else {
//			
//		}
		return this.saldo;
		
	}
}
