import java.io.*;
public class Validacoes
{
	private int n;
	public Validacoes()
	{
		n=0;
	}

	public char validarChar(char a, char b, char c, char d, String msg)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char cc =' ';
		try
		{	
		  do
		    {
			System.out.println(msg);
			cc=br.readLine().charAt(0);

			if (cc!=a && cc!=b && cc!=c && cc!=d)
				System.out.println("Erro, caracter invalido. Tente novamente!");

		    }
		    while(cc!=a && cc!=b && cc!=c && cc!=d);
		}
		catch (IOException e) {e.getMessage();}
		
		
		return cc;
		
		
	}
	public int validarInt(int min, int max, String msg)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		try {
		    do
		    {
			System.out.println(msg);
			num=Integer.parseInt(br.readLine());
			System.out.print(num);
			if (num<min || num>max)
				System.out.println("Erro, numero invalido. Tente novamente!");

		     }
		    while(num<min || num>max);
		}catch (IOException e) {e.getMessage();}
		
		return num;
	}
	public short validarShort(short min, short max, String msg)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short num=0;
		try {
		    do
		    {
			System.out.println(msg);
			num=Short.parseShort(br.readLine());

			if (num<min || num>max)
				System.out.println("Erro, numero invalido. Tente novamente!");

		     }
		    while(num<min || num>max);
		}catch (IOException e) {e.getMessage();}
		
		return num;
	}

	public byte validarByte(byte min, byte max, String msg)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte num = 0;
		try 
		{
		  do
		   {
			System.out.println(msg);
			n=Integer.parseInt(br.readLine());

			if (num<min || num>max)
				System.out.println("Erro, numero invalido. Tente novamente!");

		 }while(num<min || num>max);
		}catch (IOException e) {e.getMessage();}
		
		return num;
	}
	public String validarString(int min, int max, String msg)
	{
		String s = " ";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			try
			{
				System.out.println(msg);
				s = br.readLine();
			}
			catch(NumberFormatException n)
			{
				System.out.println(n.getMessage());
			}
			
			catch(IOException io)
			{
				System.out.println(io.getMessage());
			}
			
			if(s.length()<min || s.length()>max)
			{
				System.out.println("Dado Invalido, Tente Novamente!");
			}
			
		}while(s.length()<min || s.length()>max);
		return s;
	}
}