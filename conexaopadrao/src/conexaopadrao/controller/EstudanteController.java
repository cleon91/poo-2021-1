package conexaopadrao.controller;

import conexaopadrao.model.bean.Estudante;
import conexaopadrao.model.dao.EstudanteDAO;

public class EstudanteController implements IController {

	private Estudante estudante;
	@Override
	public void executa(Object view, int parameter) {
		EstudanteDAO estudanteDAO = new EstudanteDAO();
				
		estudante = (Estudante) view;
		if (parameter == 1) {
			estudanteDAO.salvar(estudante);	
		}
	}
	

}
