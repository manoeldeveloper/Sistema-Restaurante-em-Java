package com.java.restaurante;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static Scanner leia = new Scanner(System.in);
	static TreeSet<Comanda> comanda;
		
	
	public static void main(String[] args) {
		comanda = new TreeSet<Comanda>();
		
		
	menu();
	}

	private static void menu() {
		while(true) {
			System.out.println("Mesas Totais: 10\n\n 1 - Listar Mesas\n 2 - Adicionar comanda a Mesa\n 3 - Ver mesas ocupadas\n 4 - Liberar Mesa\n 5 - Cobrar Comanda");
			int opcao = leia.nextInt();
				
					switch(opcao) {
					case 1 :
						listar();
						break;
					case 2 :
						add();
						break;
					case 3 :
						mesasOcupadas();
						break;
					case 4 :
						liberarMesa();
						break;
					case 5 :
						cobrarMesa();
						break;
					}
		}
		
	}

	private static void cobrarMesa() {
		if(!comanda.isEmpty()) {
			System.out.println("Digite o número da Comanda:");
			int comand = leia.nextInt();
				for(Comanda c : comanda) {
					if(c.getNumero() == comand) {
						System.out.println("Valor: ");
							double valor = leia.nextDouble();
								c.setValor(c.getValor() + valor);
				}
			}
		}
	}

	private static void liberarMesa() {
		if(!comanda.isEmpty()) {
			System.out.println("Digite o número da mesa:");
				int mesa = leia.nextInt();
					for(Comanda c : comanda) {
						if(c.getMesa() == mesa) {
							comanda.remove(c);
						}
					}
		} else {
			System.out.println("Todas as Mesas estão livres");
		}
	}

	private static void mesasOcupadas() {
		if(!comanda.isEmpty()) {
			for(Comanda c : comanda) {
				if(c.getNome() != null) {
					System.out.println("\nMesa: " + c.getMesa());
				} else {
					System.out.println("Essa mesa está livre");
				}
			}
		} else {
			System.out.println("Todas as Mesas estão livres");
		}
		menu();
	}

	private static void add() {
		System.out.println("Nome do Cliente:");
		leia.nextLine();
			String nome = leia.nextLine();
		System.out.println("Número da Comanda: ");
			int num = leia.nextInt();
			for(Comanda c : comanda) {
				if(c.getNumero() == num) {
					System.out.println("Comanda está sendo utilizada");
					menu();
				}
			}
		System.out.println("Digite o Número da Mesa:");
			int mesa = leia.nextInt();
			

				if(mesa <= 10) {
					comanda.add(new Comanda(num, mesa, nome, 0));
				} else {
					System.out.println("Essa mesa não existe");
				}
	}

	private static void listar() {
		if(!comanda.isEmpty() ) {
			for(Comanda c : comanda) {
				System.out.println(c);
			}
		}
	menu();
	}
}
