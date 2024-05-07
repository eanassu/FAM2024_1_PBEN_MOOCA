package br.com.vemprafam.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.vemprafam.dao.DaoAluno;
import br.com.vemprafam.pojo.Aluno;

public class LogicaAlterar implements Logica {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		Aluno aluno = extracted(request);
		DaoAluno dao = new DaoAluno();
		dao.atualizar(aluno);
		return "alterado.jsp";
	}

	private Aluno extracted(HttpServletRequest request) {
		int ra = Integer.parseInt(request.getParameter("ra"));
		String nome = request.getParameter("nome");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimento;
		try {
			dataNascimento = dateFormat.parse(request.getParameter("dataNascimento"));
		} catch (ParseException e) {
			dataNascimento = new Date();
		}
		double renda = Double.parseDouble(request.getParameter("renda"));
		Aluno aluno = new Aluno(ra,nome,dataNascimento,renda);
		return aluno;
	}

}
