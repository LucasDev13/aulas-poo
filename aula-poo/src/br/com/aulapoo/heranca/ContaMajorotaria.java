package br.com.aulapoo.heranca;

import br.com.aulapoo.heranca.Conta;

public class ContaMajorotaria extends Conta{

	@Override
	public void depositar(int deposito) {
		super.depositar(deposito);
		this.juro();//vai acrescentar o juros na hora de positar
	}

	@Override
	protected void juro() {
		this.saldo += 5;		
	}
	
	
	
}
