package br.com.aulapoo.heranca;

public class ContaCorrente2 extends Conta{
	
	
	//reescrever o método da classe pai, Usando o @Overrride
	
	@Override //nesta linha tem uma anotação para sobreescrever um metodo da classe pai
	public void sacar(int saque) {
		super.sacar(saque);
		this.juro();
	}
	
	@Override
	public void verSaldo() {
	this.juro();
	super.verSaldo();
	
	}
	
	//precisa ficar protected aqui e na classe pai para poder herdar da classe pai
		
	protected void juro() {
		this.saldo -= 1;
	}
	
}
