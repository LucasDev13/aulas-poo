package br.com.aulapoo.heranca;

public class ContaPoupanca extends Conta{

	@Override
	protected void juro() {
		this.saldo += 1;
	}
	
	@Override
	public void depositar(int deposito) {
		this.juro();
		super.depositar(deposito);
	}

}
