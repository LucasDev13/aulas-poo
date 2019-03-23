package br.com.aulapoo.ex3;

/**
 * 
 * @author Harmfull
 *
 */
public class Carro {

	// Atributos
	// O String é uma biblioteca que transforma em string
	public String marca;

	// variaveis primitivas são declaradas com letras minusculas e com cores
	// diferentes
	public int ano;
	public int marcha;
	public boolean ligado; // o boolean ele é por default - false. Voce precisa mudar o estado dela por realizar a comparação
	public int velocidade;

	// Métodos
	// public - vai ser enchergado por todo o projeto
	// void- não da retorno nenhum - dá o retorno só dentro do método
	// this -> é para usar atributos da classe

	public void ligar() {
		if (this.ligado == false) {
			this.ligado = true;
			System.out.println("Ligar o carro");
		}else {
			System.out.println("Carro ja esta desligado");
		}
	}

	// true =  para carro ligado 
	// false = para carro desligado
	public void desligar() {
		if(this.ligado == true ) {
			this.ligado = false;
			System.out.println("Carro desligado");
		}else {
			System.out.println("Carro não esta ligado");
		}

	}
	
	public void trocarMarcha() {
		System.out.println("Marcha trocada");
	}
	
	//foi colocado um parametro de velocidade
	public void acelerar(int vel) {
		if (this.ligado == true) {
			this.velocidade = vel;
			System.out.println("sua velociade: " + this.velocidade);
		}

		//this.velocidade = 20;// esta recevendo um valor estático
		//velocidade = velocidade; // aqui esta acrescentando na mesma velocidade
		
		//this.velocidade = vel; // esta utilizando o atributo da classe recebendo o parametro do metodo
		//System.out.println("sua velociade: " + this.velocidade);
		
	}

	// não executa porque nao tem Objeto instanciado

	// public static void main(String[] args) {
	// //System.out.println("TESTE!");
	// }

}
