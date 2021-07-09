package conexaopadrao.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import conexaopadrao.model.bean.Estudante;

public class EstudanteDAO implements CRUD {

	@Override
	public void salvar(Object bean) {
		// TODO Auto-generated method stub
		Estudante estudante = (Estudante) bean;
		
		if(estudante != null){
            Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstm;
            pstm = conn.prepareStatement("INSERT INTO estudante(nome, idade) values (?,?)");
            pstm.setString(1, estudante.getNome());
            pstm.setInt(2, estudante.getIdade());
            pstm.execute();
            System.out.println("Armazenado com sucesso");
            Conexao.fechaConexao(conn, pstm);
            
        }   catch (SQLException ex) {
        	System.out.println("Erro: " + ex);
        }
   
          }
		
	}

	@Override
	public void atualizar(Object bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
