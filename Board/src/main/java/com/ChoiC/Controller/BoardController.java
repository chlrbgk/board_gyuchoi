package com.ChoiC.Controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ChoiC.Domain.BoardVO;
import com.ChoiC.Service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	private BoardService service;
	
// //Board_List // //	
	@RequestMapping(value = "/list", method = RequestMethod.GET) 
		public void BoardListGET(Model model) throws Exception{
			
			List<BoardVO> list = null;
			list = service.list();
			
			model.addAttribute("list", list);
			
		 }

// // Board_Write // //
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void BoardWriteGET() throws Exception{
		
	}
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String BoardWritePOST(BoardVO vo) throws Exception{
		
		service.write(vo);	
		return "redirect:/board/list";
	
	}
	
// // Board_View // //
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void BoardViewGET(@RequestParam("bno") int bno, Model model) throws Exception{
		BoardVO vo = service.view(bno);
		model.addAttribute("view", vo);
	}
	
// // Board_Update // //
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void BoardModifyGET(@RequestParam("bno") int bno, Model model) throws Exception{
		BoardVO vo = service.view(bno);
		model.addAttribute("view", vo);	
	}
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String BoardModifyPOST(BoardVO vo) throws Exception{
		service.modify(vo);
		return "redirect:/board/view?bno="+vo.getBno();
	}
	
// // Board_DELETE // //
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String BoardDeletePOST(@RequestParam("bno") int bno) throws Exception{
		service.delete(bno); 
		return "redirect:/board/list";
	}
	
}














