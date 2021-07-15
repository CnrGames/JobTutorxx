
public class Menu 
{
	Tarefas tr;
    Vizualizacoes vs;
    
	public Menu () 
	{
		tr = new Tarefas();
		vs = new Vizualizacoes();	
		tr.LerFicheiroTexto();
		vs.verVooLongo(tr.getLista());
		vs.verTodosBilhetes(tr.getLista());
		vs.verCadaTipo(tr.getLista());
	}
	
}
