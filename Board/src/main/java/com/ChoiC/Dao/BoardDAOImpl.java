package com.ChoiC.Dao;

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
	
	
	
	
}
