package com.ChoiC.Service;

import java.util.List;

import com.ChoiC.Domain.BoardVO;

public interface BoardService {

// Board_List	
	public List<BoardVO> list() throws Exception;

// Board_List [Paging]
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception;
	
// Board_Paging [All Count]
	public int count() throws Exception;	
	
// 게시물 목록 + 페이징 + 검색
	public List<BoardVO> listPageSearch(
		int displayPost, int postNum, String searchType, String keyword) throws Exception;

// 게시물 총 갯수 + 검색 적용
	public int searchCount(String searchType, String keyword) throws Exception;
	
// Board_WRITE
	public void write(BoardVO vo) throws Exception;

// Board_Delete
	public void delete(int bno) throws Exception;
	
// Board_View
	public BoardVO view(int bno) throws Exception;
	
// Board_MODIFY
	public void modify(BoardVO vo) throws Exception;
	
	
}
