package com.GameC.Dao;

import java.util.List;

import com.GameC.Domain.GameVO;

public interface GameDAO {
	
// List //	
	public List<GameVO> list() throws Exception;

// Save //
	public void  save(GameVO vo) throws Exception;
	
}
