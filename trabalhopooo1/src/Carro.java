public final class Carro extends Terrestre
{

	String matricula;
	double qtdCombs, valPortagem;
	
	public Carro(int codigo, String nome, String BI, String dataP, String dataC, double valor, char formaPag, int nrKm, String matricula, double qtdCombs, double valPortagem)
	{
		super(codigo,nome,BI,dataP,dataC,valor,formaPag, nrKm);
		this.matricula=matricula;
		this.qtdCombs=qtdCombs;
		this.valPortagem=valPortagem;
	}
	
	public Carro()
	{
		this(0," "," "," "," ",0,' ',0," ",0,0);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getQtdCombs() {
		return qtdCombs;
	}

	public void setQtdCombs(double qtdCombs) {
		this.qtdCombs = qtdCombs;
	}

	public double getValPortagem() {
		return valPortagem;
	}

	public void setValPortagem(double valPortagem) {
		this.valPortagem = valPortagem;
	}
	
	public String toString()
	{
		return super.toString()+"Matricula: "+matricula+" |Quantidade de Combustivel: "+qtdCombs+" |Valor Portagem: "+valPortagem;
	}
	
}
