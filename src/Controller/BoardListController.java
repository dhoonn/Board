package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.BoardDTO;
import Service.BoardListService;
import java.util.*;

@WebServlet("/boardlist")
public class BoardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardListController() {
		super();
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		BoardListService blistService = new BoardListService();
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		boardList = blistService.boardList();
		if (boardList != null) {
			request.setAttribute("boardList", boardList); 
			RequestDispatcher dispatcher = request.getRequestDispatcher("BoardList.jsp"); 
			dispatcher.forward(request,response);
		}else {
			response.sendRedirect("BoardListFail.jsp");		
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
