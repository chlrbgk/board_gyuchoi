package com.GameC.Dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.GameC.Domain.GameVO;

@Repository
public class GameDAOImpl implements GameDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.GameC.mappers.game";
	
// List //	
	@Override
	public List<GameVO> list() throws Exception {
		return sql.selectList(namespace + ".list");
	}

	@Override
	public void save(GameVO vo) throws Exception {
			sql.insert(namespace + ".boardInsert", vo);
	}


	
}













