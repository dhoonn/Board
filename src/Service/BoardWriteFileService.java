package Service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardWriteFileService {

	public int boardWriteFile(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//파일이 저장될 위치를 savePath변수에 저장
		String savePath="D:\\source\\servlet\\Board\\WebContent\\UploadFile";
		
		MultipartRequest multi = new MultipartRequest(
				request,
				savePath,
				10*1024*1024,
				"UTF-8",
				new DefaultFileRenamePolicy()
				);
		BoardDTO board = new BoardDTO();
		String bwriter = multi.getParameter("bwriter");
		String btitle = multi.getParameter("btitle");
		String bcontents = multi.getParameter("bcontents");
		String bfilename = multi.getOriginalFileName((String)multi.getFileNames().nextElement());
		board.setBtitle(btitle);
		board.setBwriter(bwriter);
		board.setBtitle(btitle);
		board.setBcontents(bcontents);
		board.setBfilename(bfilename);
		
		BoardDAO bDAO = new BoardDAO();
		bDAO.dbConnection();
		int writeResult = bDAO.boardWriteFile(board);
		bDAO.dbClose();
		return writeResult;
	}
}
