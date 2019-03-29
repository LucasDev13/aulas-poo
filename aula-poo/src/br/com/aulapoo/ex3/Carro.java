package br.com.aulapoo.ex3;

import javax.swing.JOptionPane;

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
	private int marcha = 0;//atribuido 0 para sem marcha
	public boolean ligado; // o boolean ele é por default - false. Voce precisa mudar o estado dela por realizar a comparação
	public int velocidade;
	public boolean freio = true; //indica que o freio esta puxado

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
	
	//aqui esta encapsulando o atributo marcha que inicia em 0
	public void trocarMarcha() {
		//System.out.println("Marcha trocada");
		this.marcha = this.marcha + 1;// vai acrecentar o marcha em mais 1 a cada chamada do método
	}
	
	
	
	//foi colocado um parametro de velocidade para receber um valor da classe principal,
	//e que ira passar para a variavel(atributo) velocidade da classe carro
	public void acelerar(int vel) {
		if (this.ligado == true) {
			if (this.freio == false) {
				if(this.marcha == 0) {
					JOptionPane.showMessageDialog(null, "Está em ponto morto!!");
				}else if(this.marcha == 1){
					if(vel < 20) {
						// pego vel por parametro
						this.velocidade = vel;
						System.out.println("sua velociade: " + this.velocidade);
					}
				}else if(this.marcha == 2) {
					if(vel < 40) {
						this.velocidade = vel;
						System.out.println("sua velociade: " + this.velocidade);
					}
				}else if(this.marcha == 3) {
					if(vel < 60) {
						this.velocidade = vel;
						System.out.println("sua velociade: " + this.velocidade);
					}
				}
			
		}

		//this.velocidade -> esta pegando diretamento do atributo velocidade da classe carro
		//this.velocidade = 20;// esta recebendo um valor estático
		//velocidade = velocidade; // aqui esta acrescentando na mesma velocidade
		
		//this.velocidade = vel; // esta utilizando o atributo da classe recebendo o parametro do metodo
		//System.out.println("sua velociade: " + this.velocidade);
		
	}
	
	}

	// não executa porque nao tem Objeto instanciado

	// public static void main(String[] args) {
	// //System.out.println("TESTE!");
	// }

}
