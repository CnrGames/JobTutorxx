public final class Mar extends Bilhete
{
  String tipo;
  
  public Mar(int codigo, String nome, String BI, String dataP, String dataC, double valor, char formaPag, String tipo)
  {
	  super(codigo,nome,BI,dataP,dataC,valor,formaPag);
	  this.tipo=tipo;
  }
  
  public Mar()
  {
	  this(0," "," "," "," ",0,' '," ");
  }
  
  public String getTipo()
  {
	  return tipo;
  }
  
  public void setTipo(String tipo)
  {
	  this.tipo=tipo;
  }
  
  public String toString()
  {
	  return super.toString()+"Tipo: "+tipo+"|";
  }
}
