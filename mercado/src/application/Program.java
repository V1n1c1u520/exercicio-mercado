package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Product produto = new Product();
				
		System.out.println("Insira os dados do produto:");
		System.out.print("Nome: ");
		produto.name = ler.nextLine();
		
		System.out.print("Preço: ");
		produto.price = ler.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		produto.quant = ler.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.println("Insira a quantidades de produtos que você quer adicionar ao estoque: ");
		int quantidade = ler.nextInt();
		produto.addProducts(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizado: " + produto);
		
		System.out.println();
		System.out.println("Insira a quantidades de produtos que você quer retirar do estoque: ");
		quantidade = ler.nextInt();
		produto.removeProducts(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizado: " + produto);
		
		ler.close();
	}

}
