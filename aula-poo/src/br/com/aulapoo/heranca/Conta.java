package br.com.aulapoo.heranca;

public abstract class Conta {
		//quando se trabalha com atributos, ele podem ser interceptado e modificado
		
		//atributos
		
		//private so é visto dentro da classe
		protected double saldo; //quanto tem na conta - só pode ser executado nesta classe
		private double valorSaque;// so pode acessar o valorSaque dentro desta classe
		public int conta; // a conta pode estar com ou sem dinheiro
		public double desconto;

		
		public void sacar(int saque) {
			this.valorSaque = saque;
			if(this.valorSaque < 10) {
				System.out.println("voce não pode sacar");
			}else {
				this.saldo = this.saldo - this.valorSaque;

				System.out.println("Você sacou: " + this.valorSaque);
				
			}
		}
		
		protected abstract void juro();
		
		
		public void depositar(int deposito) {
			this.saldo += deposito;//realiza o depósito na conta
		}
		
		
		public void verSaldo() {
			System.out.println("sua conta tem: " + this.saldo + " Reais");	
		}
	}
