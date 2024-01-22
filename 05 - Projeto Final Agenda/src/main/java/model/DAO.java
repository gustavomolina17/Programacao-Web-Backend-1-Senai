/* Dao acrônimo de DATA ACESS OBJETO é responsável pela separação das regras de negócio das regras
 * de acesso ao banco de dados.
 * É nessa parte do nosso projeto que teremos a conexão com o BD e o CRUD*/

package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {

	/* Módulo de Conexão */
	// Parâmetros de conexão

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "admin";

	// métodos de conexão

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/*
	 * teste de conexão
	 * 
	 * public void testeConexao() { try { Connection con = conectar();
	 * System.out.println(con); con.close(); } catch (Exception e) {
	 * System.out.println(e); } }
	 */

	/** CRUD CREATE **/

	public void inserirContato(JavaBeans contato) {

		String create = "insert into contatos (nome, fone, email) values (?,?,?)";
		try {
			// abrir a conexão com o banco
			Connection con = conectar();
			// Preparar a query para execução no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			// Substituir os parâmetros (?) pelo conteúdo das variáveis JavaBeans
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			// Executar a Query
			pst.executeUpdate();
			// Encerrar a conexão com o Banco de dados
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/** CRUD READ **/

	public ArrayList<JavaBeans> listarContatos() {

		// Criando um objeto para acessar a classe JavaBEans

		ArrayList<JavaBeans> contatos = new ArrayList<>();
		String read = "Select * from contatos order by nome";
		try {

			// abrir a conexão com o banco
			Connection con = conectar();

			// Preparar a query para execução no banco de dados
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery(); // usado para armazenar o retorno do banco de dados temporariamente em um
												// objeto

			// o laço abaixo será executado enquanto houver contatos

			while (rs.next()) {
				// variáveis de apoio que recebem os dados do banco

				String idcon = rs.getString(1);
				String nome = rs.getString(2);
				String fone = rs.getString(3);
				String email = rs.getString(4);

				// populando o arraylist
				contatos.add(new JavaBeans(idcon, nome, fone, email));

			}

			con.close();
			return contatos;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	/** CRUD UPDATE **/

	/**
	 * Selecionar contato.
	 *
	 * 
	 */
	
	public void selecionarContato(JavaBeans contato) {
		String read2 = "select * from contatos where idcon = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, contato.getIdcon());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				contato.setIdcon(rs.getString(1));
				contato.setNome(rs.getString(2));
				contato.setFone(rs.getString(3));
				contato.setEmail(rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void alterarContato(JavaBeans contato) {
		String update = "update contatos set nome=?,fone=?,email=? where idcon=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.setString(4, contato.getIdcon());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
 
	
	/** CRUD DELETE **/
	
	/**
	 * Deletar contato.
	 *
	 * 
	 */
	public void deletarContato(JavaBeans contato) {
		String delete = "delete from contatos where idcon=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, contato.getIdcon());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

	

