package conexaopadrao.view;




import conexaopadrao.controller.EstudanteController;
import conexaopadrao.model.bean.Estudante;


public class EstudanteForm{

    public static void main(String[] args) {
    	Estudante estudante = new Estudante();
    	
    	estudante.setNome("Cleon");
    	estudante.setIdade(29);
    	
    	EstudanteController estudanteController = new EstudanteController();
    	estudanteController.executa(estudante,1);
    	
    }
}