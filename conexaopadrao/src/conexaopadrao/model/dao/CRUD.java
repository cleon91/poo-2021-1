package conexaopadrao.model.dao;


import java.util.List;

public interface CRUD {

	public void salvar(Object bean);
	public void atualizar(Object bean);
	public void apagar(int id);
	public Object getById(int id);
	public List<Object> getAll();


}