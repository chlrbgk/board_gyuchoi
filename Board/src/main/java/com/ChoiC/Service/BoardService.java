package com.ChoiC.Service;

import java.util.List;

import com.ChoiC.Domain.BoardVO;

public interface BoardService {

// Board__List	
	public List<BoardVO> list() throws Exception;
	
// Board__WRITE
	public void write(BoardVO vo) throws Exception;
	
// Board__View
	public BoardVO view(int bno) throws Exception;
}
