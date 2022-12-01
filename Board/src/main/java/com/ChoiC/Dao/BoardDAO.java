package com.ChoiC.Dao;

import java.util.List;

import com.ChoiC.Domain.BoardVO;

public interface BoardDAO {

// Board_LIST //	
	public List<BoardVO> list() throws Exception;

// Board_Paging [All Count] //
	public int count() throws Exception;
	
// Board_List [ Paging ]	
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception;
	
// Board_WRITE //
	public void write(BoardVO vo) throws Exception;

// Board_DELETE //
	public void delete(int bno) throws Exception;
		
// Board_VIEW //
	public BoardVO view(int bno) throws Exception;

// Board_MODIFY //	
	public void modify(BoardVO vo) throws Exception;
	

	
}
