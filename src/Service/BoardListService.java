package Service;

import java.util.ArrayList;
import java.util.List;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardListService {

	public List<BoardDTO> boardList() {
		BoardDAO bDAO = new BoardDAO();
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		bDAO.dbConnection();
		boardList = bDAO.boardList();
		bDAO.dbClose();
		return boardList;
	}

}
