package br.com.vemprafam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.vemprafam.dao.DaoAluno;
import br.com.vemprafam.dao.DaoFuncionario;
import br.com.vemprafam.pojo.Aluno;
import br.com.vemprafam.pojo.Funcionario;

/**
 * Servlet implementation class ServletTabela
 */
@WebServlet("/ServletTabelaF")
public class ServletTabelaF extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTabelaF() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		DaoFuncionario dao = new DaoFuncionario();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>tabela</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<table border='1'>\r\n"
				+ "<tr>\r\n"
				+ "<th>RE</th><th>nome</th><th>data de admiss�o</th><th>sal�rio</th>\r\n"
				+ "</tr>\r\n");
			List<Funcionario> lista = dao.getLista();
			for( Funcionario a: lista ) {
		         out.println("<tr>\r\n"
				+ "<td>" + a.getRe() + "</td>"
				+ "<td>" + a.getNome() + "</td>"
				+ "<td>" + dateFormat.format(a.getDataAdmissao()) +"</td>"
				+ "<td>" + currencyFormat.format(a.getSalario()) + "</td>\r\n"
				+ "</tr>\r\n");
			}
			out.println( "</table>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
