package com.GameC.Controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.GameC.Domain.GameVO;
import com.GameC.Service.GameService;

@Controller
@RequestMapping("/GBoard/*")
public class GameController {

	@Inject
	private GameService service;

// List //	
	@RequestMapping(value = "/list", method = RequestMethod.GET )
	public void listGET(Model model) throws Exception{
		List<GameVO> list = service.list();
		model.addAttribute("list", list);
	}

// Insert //
	@RequestMapping(value = "/boardInsert", method = RequestMethod.GET)
	public void insertGET() throws Exception{
		
	}
	@RequestMapping(value="/saveBoard", method = RequestMethod.POST)
	public String insertPOST(GameVO vo) throws Exception{
		service.save(vo);
		return "redirect:/GBoard/list";
	}
	
	
}












