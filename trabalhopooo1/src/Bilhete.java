/*
   Venda de Bilhetes

Sabe-se que cada bilhete é caracterizado por um código, nome do Cliente, BI do cliente, Data de Partida, 
Data de Chegada, Valor do Bilhete e Forma de Pagamento (dinheiro/cheque).
*/

public class Bilhete
{
	protected int codigo;
	protected String nome, BI, dataP, dataC;
	protected double valor;
	protected char formaPag;
	
	public Bilhete(int codigo, String nome, String BI, String dataP, String dataC, double valor, char formaPag)
	{
		this.codigo=codigo;
		this.nome=nome;
		this.BI=BI;
		this.dataP=dataP;
		this.dataC=dataC;
		this.valor=valor;
		this.formaPag=formaPag;
	}
	
	public Bilhete()
	{
		this(0," "," "," "," ",0,' ');
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBI() {
		return BI;
	}

	public void setBI(String bI) {
		BI = bI;
	}

	public String getDataP() {
		return dataP;
	}

	public void setDataP(String dataP) {
		this.dataP = dataP;
	}

	public String getDataC() {
		return dataC;
	}

	public void setDataC(String dataC) {
		this.dataC = dataC;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public char getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(char formaPag) {
		this.formaPag = formaPag;
	}
	
	public String toString()
	{
		return "Código: "+codigo+" |Nome do Cliente: "+nome+" |BI do cliente: "+BI+" |Data de Partida: "+dataP+" |Data de Chegada: "+dataC+" |Valor do Bilhete: "+valor+" |Forma de Pagamento (d-dinheiro/c-cheque) |";
	}
}