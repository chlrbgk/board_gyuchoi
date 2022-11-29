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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}














