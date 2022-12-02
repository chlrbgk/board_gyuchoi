package com.GameC.Service;

import java.util.List;

import com.GameC.Domain.GameVO;

public interface GameService {

// List //
	public List<GameVO> list() throws Exception;
	
// Save //
	public void save(GameVO vo) throws Exception;
	
}
