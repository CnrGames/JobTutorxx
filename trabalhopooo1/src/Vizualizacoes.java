import java.util.*;
public class Vizualizacoes 
{

	private Validacoes vd;
	
	public Vizualizacoes()
	{
		vd = new Validacoes();
	}
	
	
	
	public void verVooLongo(Vector v)
	{
		Bilhete b;
		Aereo ae = new Aereo();
		Aereo aeMax = new Aereo();
		for(int x=0;x<v.size();x++) 
		{
			
			b = (Bilhete)v.elementAt(x);
			
			
			if(v.elementAt(x) instanceof Aereo) 		
			{		
				ae = (Aereo)v.elementAt(x);
				if(x<1)
				{
				  aeMax = (Aereo)v.elementAt(x);
				}
				else 
				{
			       if(ae.getQtdMilhas()>aeMax.getQtdMilhas()) 
					{
						aeMax = ae;
					}	
				}			
			
			}	
			
			
		}
		
		System.out.println("o voo Mais logo e de : "+aeMax.getQtdMilhas());
	}

	public void verTodosBilhetes(Vector v)
	{
		
		String res ="";
		int tam= 0;
		for (int x = 0;x<v.size();x++) 
		{
			
			res+="\n"+v.elementAt(x).toString();
		tam++;
		}
		
		System.out.println("Resultado:\n "+res);
		System.out.println("Tamanho "+tam);
		
	}
	
	public void verCadaTipo( Vector v)
	{
		short op ;
		short subop;
		System.out.println("***********[Vizualizar Bilhetes]*************");
		System.out.println("***********[Escolha o Tipo]******************");
		System.out.println("[1].Aereo");
		System.out.println("[2].Maritmo");
		System.out.println("[3].Terrestre");
		op = vd.validarShort((short)1,(short)3, "Escolha o tipo de Bilhete");
		switch(op) 		
		{
		 case 1:verBAereo(v); break;
		 case 2:verBMaritmo(v); break;
		 case 3:verBTerrestre(v); break;

		}
		
	}
	
	public void verBCarros(Vector v) 
	{
		
		String res = "";
		int t = 0;
		Carro cr;
		for(int x=0;x<v.size();x++) 
		{
			
			
			
			if(v.elementAt(x) instanceof Carro) 
			{		
				cr = (Carro)v.elementAt(x);
				res+= "\n"+cr.toString();
				t++;
			}
				
		}
		
		System.out.println("/////////[CARROS]///////");
		System.out.println(res);
		
	}
	
	public void verBAereo(Vector v) 
	{		
		String res = "";
		Bilhete b;
		Aereo ae;
		for(int x=0;x<v.size();x++) 
		{
			
			b = (Bilhete)v.elementAt(x);
			
			if(v.elementAt(x) instanceof Aereo) 
			{		
				ae = (Aereo)v.elementAt(x);
				res+= "\n"+ae.toString();
	
			}	
		}
		
		System.out.println("/////////[AEREO]///////");
		System.out.println(res);
		
	}
	
	public void verBComboio(Vector v) 
	{
		String res = "";
		int t = 0;
		Bilhete b;
		Comboio cb;
		for(int x=0;x<v.size();x++) 
		{
			
			b = (Bilhete)v.elementAt(x);
			
			if(v.elementAt(x) instanceof Comboio) 
			{		
				cb = (Comboio)v.elementAt(x);
				res+= "\n"+cb.toString();
				t++;
			}	
		}
		
		System.out.println("/////////[COMBOIOS]///////");
		System.out.println(res);
			
	}
	
	public void verBMaritmo(Vector v) 
	{		
		String res = "";
		int t = 0;
		Bilhete b;
		Mar mr;
		for(int x=0;x<v.size();x++) 
		{	
			b = (Bilhete)v.elementAt(x);
			
			if(v.elementAt(x) instanceof Mar) 
			{		
				mr = (Mar)v.elementAt(x);
				res+= "\n"+mr.toString();
				t++;
			}	
		}
		
		System.out.println("/////////[Maritmo]///////");
		System.out.println(res);
	}
	
	public void verBTerrestre(Vector v) 
	{		
		String res = "";
		int t = 0;
		Bilhete b;
		Terrestre tr;
		for(int x=0;x<v.size();x++) 
		{	
			b = (Bilhete)v.elementAt(x);
			
			if(v.elementAt(x) instanceof Terrestre) 
			{		
				tr = (Terrestre)v.elementAt(x);
				res+= "\n"+tr.toString();
				t++;
			}	
		}
		
		System.out.println("/////////[Terrestre]///////");
		System.out.println(res);
	}
	
}
