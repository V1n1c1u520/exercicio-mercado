package entities;

public class Product {

	public String name;
	public double price;
	public int quant;
	
	public double totalValueInStock()
	{
		return price * quant;
	}
	
	public void addProducts(int quant)
	{
		// this serve para fazer ref ao objeto da classe, e não ao parametro do metodo. Assim evitando ambiguidade
		this.quant += quant;
	}
	
	public void removeProducts(int quant)
	{
		this.quant -= quant;
	}
	
	public String toString()
	{
		// toString pode ser visto como uma formatacao padrao ao chamar um objeto para a impressao na tela
		return name 
		+ "| R$" 
		+ String.format("%.2f", price)
		+ "| " 
		+ quant 
		+ " unidades| Total: R$" 
		+ String.format("%.2f", totalValueInStock());
	}
}
