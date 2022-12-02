package com.ChoiC.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ChoiC.Dao.BoardDAO;
import com.ChoiC.Domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDAO dao;

// Board__List //		
	@Override
	public List<BoardVO> list() throws Exception{
		return dao.list();
	}

 // 게시물 목록 + 페이징 + 검색
	@Override
	public List<BoardVO> listPageSearch(
			int displayPost, int postNum, String searchType, String keyword) throws Exception {
		return  dao.listPageSearch(displayPost, postNum, searchType, keyword);
	}	
	
 // 게시물 총 갯수
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
		return dao.searchCount(searchType, keyword);
	}	
	
 // Board__Write //  	
	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);
	}

// Board__Delete //
	@Override
	public void delete(int bno) throws Exception{
		dao.delete(bno);
	}
	
 // Board__View // 
	@Override
	public BoardVO view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(bno);
	}

// Board__Modify //	
	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.modify(vo);
	}
	
// Board__Paging //
	@Override
	public int count() throws Exception{
		return dao.count();
	}

// Board__List	
	@Override
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception {
		// TODO Auto-generated method stub
		return dao.listPage(displayPost, postNum);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}














