package com.qd05.req;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Member {


		@RequestMapping("/temp")
		public @ResponseBody String root() throws Exception{
			return "Print OK"; 
		}
		
		@RequestMapping("/")
		public String mtdIndex() {
			return "index"; //jsp 파일명이자 view 명칭
			
		}
		
		@RequestMapping("/send")
		public String mtdSend() {
			return "mem/login"; //jsp 파일명이자 view 명칭
			
		}
		@RequestMapping("/receive")
		public String mtdReceive(
				@RequestParam("userEmail") String userEmail,
				@RequestParam("userPw") String userPw,
				@RequestParam(defaultValue="0", name="chkBox" ) String chkBox,
				Model model
				) {
				System.out.println(chkBox);
				model.addAttribute("userEmail", userEmail);
				model.addAttribute("userPw", userPw);
				model.addAttribute("chkBox", chkBox);
				
			
			return "mem/loginProc"; //jsp 파일명이자 view 명칭
			
		}
	
}
