package br.com.vemprafam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import br.com.vemprafam.pojo.Aluno;

public class DaoAluno {

	private String user="SA";
	private String password="";
	private String url="jdbc:hsqldb:hsql://localhost/";
	private Connection connection =null;
	
	public DaoAluno() {
		super();
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void inserir( Aluno aluno ) {
		try {
			String sql = "INSERT INTO ALUNOS VALUES(?,?,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, aluno.getRa());
			pstmt.setString(2, aluno.getNome());
			pstmt.setDate(3, new java.sql.Date(aluno.getDataNascimento().getTime()));
			pstmt.setDouble(4, aluno.getSalario());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Aluno> getLista() {
		return null;
	}
	
	public Aluno buscarPeloRa( int ra ) {
		return null;
	}
	
	public void atualizar( Aluno aluno ) {}
	
	public void excluir( Aluno aluno ) {}
	
	public static void main(String[] args) {
		DaoAluno dao = new DaoAluno();
		dao.inserir(new Aluno(999,"teste999",new Date(), 999));
	}
}
