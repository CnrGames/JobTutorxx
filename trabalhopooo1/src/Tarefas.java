import java.io.*;
import java.util.*;		
		
public class Tarefas 
{
    private Vector v;

	private Validacoes vd;
	
	public Tarefas()
	{		
		vd = new Validacoes();
		v = new Vector();    
	}
	
	
	
////////////////////[Tarefas]//////////////////////////////]
	public void remover() 
	{
		  Bilhete bt = new Bilhete();
		   int cd = vd.validarInt(1000, 9999, "Introduza o codigo do Passaporte que deseja Remover!") ;
		  int nr=0;
		   String st="";
			for(int x =0;x<v.size();x++) 
			{
				bt = (Bilhete)v.elementAt(x);
				if(v.elementAt(x) instanceof Bilhete) 
				{								
				  if(cd== bt.getCodigo()) 
				  {	
					  nr=1;
					  nr=bt.getCodigo();
					v.remove(x);
					
				    }
				  
				}
				
			}
			
			if(nr==0) 
			{
				System.out.println("\n Nada Encontrado!");
			}
			else
			{
				System.out.println("\n"+"Removido com Sucesso!");
			}	
	}
	
	public void pesquisar()
	{
	   Bilhete bt = new Bilhete();
	   int cd = vd.validarInt(1000, 9999, "Introduza o codigo do Passaporte que deseja Pesquisar!") ;
	  
	   String st="";
		for(int x =0;x<v.size();x++) 
		{
			bt = (Bilhete)v.elementAt(x);
			if(cd== bt.getCodigo()) 
			{			
				st+=bt.toString();
			}
			
		}
		
		if(st=="") 
		{
			System.out.println("\n Nada Encontrado!");
		}
		else
		{
			System.out.println("\n"+st);
		}
		
	
	} 
	
	public void alterarMilhas() 
	{
		   Bilhete bt = new Bilhete();
		   Aereo ar;
		   int cd = vd.validarInt(1000, 9999, "Introduza o codigo do Passaporte Aereo que deseja Alterar!") ;
		   int milhas =0;
		   String st="";
			for(int x =0;x<v.size();x++) 
			{
				bt = (Bilhete)v.elementAt(x);
				if(v.elementAt(x) instanceof Aereo) 
				{
				  if(cd== bt.getCodigo()) 
				  {		
					System.out.println();
				    milhas  = vd.validarInt(0, 9999, "Introduza Quantidade de Milhas que deseja (0>Milha<999) ");
					ar= (Aereo)v.elementAt(x);  
					ar.setQtdMilhas(milhas);
					st+=bt.toString();
					
				  }
				}
				
			}
			
			if(st=="") 
			{
				System.out.println("\n Nada Encontrado!");
			}
			else
			{
				System.out.println("\n"+st);
			}
	}
	
	
//Obter a lista pra poder usar em outras Classes
	
	public Vector getLista()
	{		
		return v;
	}

	
	public void LerFicheiroTexto()
	{
		String linha;
		StringTokenizer cadeia;
		char c1,c2;
		
		//dados do Bilhete
		int codigo;
		String nome, BI, dataP, dataC;
		float valor;
		char formaPag;
		
		//dados do Aereo
		int qtdMilhas;
		String companhia;
		
		//dados do Mar
		String tipo;
		
		//dados do Terrestre
		int nrKm;
		
		//do Carro
		String matricula;
		double qtdCombs, valPortagem;
		
		//do Comboio
		String tipoC;
		
		try
		{
			FileReader fr = new FileReader("Dados.txt");	
			BufferedReader br = new BufferedReader(fr);		
			
			linha = br.readLine();	
			
			while(linha!=null)
			{
				cadeia=new StringTokenizer(linha,"+");
				codigo=Integer.parseInt(cadeia.nextToken());
				nome=cadeia.nextToken();
				BI=cadeia.nextToken();
				dataP=cadeia.nextToken();
				dataC=cadeia.nextToken();
				valor=Float.parseFloat(cadeia.nextToken());
				formaPag=cadeia.nextToken().charAt(0);
				
				
				c1=cadeia.nextToken().charAt(0);
			
				switch(c1)
				{
				  case'T':
					  
					  nrKm=Integer.parseInt(cadeia.nextToken());
					 
					  c2=cadeia.nextToken().charAt(0);
					//  System.out.println(codigo+" | "+nome+" | "+BI+" | "+dataP+" | "+dataC+" | "+valor+" | "+formaPag+" | "+c1+" | "+nrKm+" | "+ c2);
					  switch(c2)
					  {
					  
					      case 'C': 
				               matricula=cadeia.nextToken();
					           qtdCombs=Double.parseDouble(cadeia.nextToken());
					           valPortagem=Double.parseDouble(cadeia.nextToken());
					           
					            criarObjCarro(codigo,nome,BI,dataP,dataC,valor,formaPag,nrKm,matricula,qtdCombs,valPortagem);
								linha=br.readLine();
					           break;

					     case 'O':  
					   
						  tipoC=cadeia.nextToken();
						  criarObjComboio(codigo,nome,BI,dataP,dataC,valor,formaPag,nrKm,tipoC);
						  linha=br.readLine();
						  break;
					  
					  }
					 
					  
					break;  
				  case'A':
					  qtdMilhas=Integer.parseInt(cadeia.nextToken());
					  companhia=cadeia.nextToken();
					  
					   criarObjAereo(codigo,nome,BI,dataP,dataC,valor,formaPag,qtdMilhas);
						linha=br.readLine();
					  break;
					
				  case'M':
					  tipo=cadeia.nextToken();
					  
					   criarObjMar(codigo,nome,BI,dataP,dataC,valor,formaPag,tipo);
					  linha=br.readLine();
					  break;	  
				
				}
				
				
				 
			}
			//System.out.println("Donexx");

			br.close();
			
		}
		catch(FileNotFoundException f)  
		{ 
			System.out.println("O ficheiro nao foi encontrado !"); 
		} 
		
		catch(NumberFormatException f)  
		{ 
			System.out.println(f.getMessage()+" Nr Errado!"); 
		} 
		
		
		catch(IOException e) 
		{   
			System.out.println(e.getMessage()); 
		}						
		
	}
	
	public void criarObjCarro(int codigo, String nome, String BI, String dataP, String dataC, float valor, char formaPag, 
			int nrKm, String matricula, double qtdCombs, double valPortagem)
	{
		Carro c = new Carro();
		c.setCodigo(codigo);
		c.setNome(nome);
		c.setBI(BI);
		c.setDataP(dataP);
		c.setDataC(dataC);
		c.setValor(valor);
		c.setFormaPag(formaPag);
		c.setNrKm(nrKm);
		c.setMatricula(matricula);
		c.setQtdCombs(qtdCombs);
		c.setValPortagem(valPortagem);
		
		v.add(c);
		v.trimToSize();

	}
	
	public void criarObjComboio (int codigo, String nome, String BI, String dataP, String dataC, float valor, 
			char formaPag, int nrKm,String tipoC)
	{
		Comboio c = new Comboio();
		c.setCodigo(codigo);
		c.setNome(nome);
		c.setBI(BI);
		c.setDataP(dataP);
		c.setDataC(dataC);
		c.setValor(valor);
		c.setFormaPag(formaPag);
		c.setNrKm(nrKm);
		c.setTipoC(tipoC);
		
		v.add(c);
		v.trimToSize();


		
	}
	
	public void criarObjAereo(int codigo, String nome, String BI, String dataP, String dataC, float valor, char formaPag, int qtdMilhas)
	{
		Aereo a = new Aereo();
		a.setCodigo(codigo);
		a.setNome(nome);
		a.setBI(BI);
		a.setDataP(dataP);
		a.setDataC(dataC);
		a.setValor(valor);
		a.setFormaPag(formaPag);
		a.setQtdMilhas(qtdMilhas);
		
		v.add(a);
		v.trimToSize();

	}
	
	public void criarObjMar(int codigo, String nome, String BI, String dataP, String dataC, float valor, char formaPag, String tipo) 
	{
		Mar m = new Mar();
		m.setCodigo(codigo);
		m.setNome(nome);
		m.setBI(BI);
		m.setDataP(dataP);
		m.setDataC(dataC);
		m.setValor(valor);
		m.setFormaPag(formaPag);
		m.setTipo(tipo);
		
		v.add(m);
		v.trimToSize();

	}

	
}
