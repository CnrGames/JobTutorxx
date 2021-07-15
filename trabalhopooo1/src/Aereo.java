public final class Aereo extends Bilhete 
{

	int qtdMilhas;
	
	public Aereo(int codigo, String nome, String BI, String dataP, String dataC, double valor, char formaPag, int qtdMilhas)
	{
		super(codigo,nome,BI,dataP,dataC,valor,formaPag);
		this.qtdMilhas=qtdMilhas;
	}
	
	public Aereo()
	{
		this(0," "," "," "," ",0,' ',0);
	}
	
	public int getQtdMilhas()
	{
		return qtdMilhas;
	}
	
	public void setQtdMilhas(int qtdMilhas)
	{
		this.qtdMilhas=qtdMilhas;
	}
	
	public String toString()
	{
		return super.toString()+"Quantidade de milhas: "+qtdMilhas+"|";
	}
}
