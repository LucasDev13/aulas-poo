package br.com.aulapoo.mainPrincipal;

import br.com.aulapoo.ex4.ContaCorrente;
import br.com.aulapoo.heranca.Conta;
import br.com.aulapoo.heranca.ContaCorrente2;
import br.com.aulapoo.heranca.ContaMajorotaria;
import br.com.aulapoo.heranca.ContaPoupanca;
import br.com.aulapoo.heranca.ContaSalario;

/**
 * Exercicio de poo sobre contas correntes
 * Classe main
 * @author Harmfull
 *
 */
public class MainPrincipal {

	public static void main(String[] args) {
//		ContaCorrente cc = new ContaCorrente();
//		cc.verSaldo();
//		cc.depositar(100);
//		cc.verSaldo(); //desconto de 1% para ver o saldo
//		cc.Sacar(65);
//		cc.verSaldo();
		
//		ContaCorrente2 c = new ContaCorrente2();
//		c.verSaldo();
//		c.depositar(100);
//		c.verSaldo();
//		c.verSaldo();
		
//		ContaMajorotaria cm = new ContaMajorotaria();
//		cm.depositar(100);
//		cm.verSaldo();
//		cm.depositar(100);
//		cm.verSaldo();
		
//		ContaSalario cs = new ContaSalario();
//		cs.depositar(200);
//		cs.verSaldo();
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(200);
		cp.verSaldo();
		cp.depositar(200);
		cp.verSaldo();
	}

}
