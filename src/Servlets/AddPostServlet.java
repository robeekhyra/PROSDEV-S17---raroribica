package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBConnection.DBConnection;
import Model.QueryFactory;

/**
 * Servlet implementation class AddPostServlet
 */
@WebServlet(name = "createnewpost", urlPatterns = {"/createnewpost"})
public class AddPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPostServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.setContentType("text/html;charset=UTF-8");
		String title = null;
		String description = null;
		String author = null;
		String cover = null;

		QueryFactory qf = new QueryFactory();

		// Get information
		title = request.getParameter("title");
		description = request.getParameter("description");
		author = request.getParameter("name");
		cover = request.getParameter("cover");
		qf.addPost(title, description, author, cover);
		// Redirect to main page
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//processRequest(request, response);
		System.out.println("post");
		String title = null;
		String description = null;
		String author = null;
		String cover = null;

		QueryFactory qf = new QueryFactory();

		// Get information
		title = request.getParameter("title");
		description = request.getParameter("description");
		author = request.getParameter("name");
		cover = request.getParameter("cover");
		qf.addPost(title, description, author, cover);
		// Redirect to main page
		response.sendRedirect("index.jsp");
	}

}