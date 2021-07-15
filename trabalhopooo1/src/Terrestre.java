public abstract class Terrestre extends Bilhete
{

	int nrKm;
	
	public Terrestre(int codigo, String nome, String BI, String dataP, String dataC, double valor, char formaPag, int nrKm)
	{
		super(codigo,nome,BI,dataP,dataC,valor,formaPag);
		this.nrKm=nrKm;
	}
	
	public Terrestre()
	{
		this(0," "," "," "," ",0,' ',0);
	}
	
	public int getNrKm()
	{
		return nrKm;
	}
	
	public void setNrKm(int nrKm)
	{
		this.nrKm=nrKm;
	}
	
	public String toString()
	{
		return super.toString()+"Numero de Km: "+nrKm+"|";
	}
}
