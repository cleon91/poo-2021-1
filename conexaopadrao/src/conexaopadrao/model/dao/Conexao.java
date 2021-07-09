/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaopadrao.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/aulaconexao";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    private PreparedStatement adiciona;
    
    public static Connection getConexao(){
            Connection connect = null;
        try {
             connect = DriverManager.getConnection(URL, USUARIO, SENHA);
            return connect;
            
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        return connect;
    }
    
    public static void fechaConexao(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Fechada a conexão com o banco de dados");
            }
        }catch (Exception e) {
            System.out.println("Não foi possível fechar a conexão com o banco de dados " + e.getMessage());
        }
    }
    
        public static void fechaConexao(Connection conn, PreparedStatement stm) {
        try {
            if(conn != null){
                fechaConexao(conn);
            }
            if (stm != null) {
                stm.close();
                System.out.println("Fechada a conexão com o banco de dados");
            }
        }catch (Exception e) {
            System.out.println("Não foi possível fechar o statement com o banco de dados " + e.getMessage());
        }
    }
    
    public static void fechaConexao(Connection conn, PreparedStatement stm, ResultSet rs) {
        try {
            if(conn != null || stm != null){
                fechaConexao(conn,stm);
            }
            if (rs != null) {
                rs.close();
                System.out.println("Fechado o resultSet com o banco de dados");
            }
        }catch (Exception e) {
            System.out.println("Não foi possível fechar o resultSet com o banco de dados " + e.getMessage());
        }
    }
    
}
