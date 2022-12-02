package com.GameC.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.GameC.Dao.GameDAO;
import com.GameC.Domain.GameVO;

@Service
public class GameServiceImpl implements GameService{

	@Inject
	GameDAO dao;

// List //
	@Override
	public List<GameVO> list() throws Exception {
		return dao.list();
	}

	@Override
	public void save(GameVO vo) throws Exception {
		 dao.save(vo);
	}
	
	
	
}











