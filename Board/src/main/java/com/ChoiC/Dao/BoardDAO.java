package com.ChoiC.Dao;

import java.util.List;

import com.ChoiC.Domain.BoardVO;

public interface BoardDAO {

// Board_LIST //	
	public List<BoardVO> list() throws Exception;

// Board_WRITE //
	public void write(BoardVO vo) throws Exception;
	
// Board_VIEW //
	public BoardVO view(int bno) throws Exception;
	
}
