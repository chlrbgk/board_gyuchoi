package com.ChoiC.Dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ChoiC.Domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession sql;

	private static String namespace = "com.ChoiC.mappers.board";
	
	
// BOARD__LIST //
	@Override
	public List<BoardVO> list() throws Exception {
		return sql.selectList(namespace + ".list");
	}

// Board__List [Paging] //	
	@Override
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception {
		
	    HashMap data = new HashMap();
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
		
		return sql.selectList(namespace + ".listPage", data);
	}
	
// BOARD_PAGING [All Count] //	
	@Override
	public int count() throws Exception {
		return sql.selectOne(namespace + ".count");
	}

// BOARD_WRITE //
	@Override
	public void write(BoardVO vo) throws Exception{
		sql.insert(namespace + ".write", vo);
	}

// BOARD__VIEW //	
	@Override
	public BoardVO view(int bno) throws Exception {
		return sql.selectOne(namespace + ".view", bno);
	}
	
// BOARD_MODIFY //	
	@Override
	public void modify(BoardVO vo) throws Exception {
		sql.update(namespace + ".modify", vo);
	}

// BOARD_DELETE //
	@Override
	public void delete(int bno) throws Exception {
		sql.delete(namespace+".delete", bno);
	}

	
}

















