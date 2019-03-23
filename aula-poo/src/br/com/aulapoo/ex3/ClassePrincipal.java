package br.com.aulapoo.ex3;

/**
 * 
 * @author Harmfull
 *
 */
public class ClassePrincipal {

	public static void main(String[] args) {
	
//		System.out.println("ola Lucas!!");
//		System.err.println("mensagens de erro");
		
		//Ele acha a classe por que esta no mesmo nivel do projeto, caso contrario teria que importar o biblioteca
		
		//Instanciar uma classe qualquer e transformar a classe em um Objeto
		Carro c4 = new Carro();
		c4.ligar();
//		c4.trocarMarcha();
//		c4.acelerar(50);// ira passar o valor aqui e não direto no metodo
//		c4.acelerar(80);// quando chama o metodo ele ja da uma  opção de velocidade
//		c4.acelerar(100);// o parametro criado no metodo acelerar será utilizado aqui nesta linha 
//		c4.acelerar(120);
		c4.desligar();
		
	}

}
