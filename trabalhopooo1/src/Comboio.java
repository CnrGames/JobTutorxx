public final class Comboio extends Terrestre
{
	
  String tipo;
  
  public Comboio(int codigo, String nome, String BI, String dataP, String dataC, double valor, char formaPag, int nrKm,String tipo)
  {
	  super(codigo,nome,BI,dataP,dataC,valor,formaPag, nrKm);
	  this.tipo=tipo;
  }
  
  public Comboio()
  {
	  this(0," "," "," "," ",0,' ',0," ");
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
	  return super.toString()+"Tipo: "+tipo;
  }

public void setTipoC(String tipoC) 
{
	// TODO Auto-generated method stub
	
}

}
