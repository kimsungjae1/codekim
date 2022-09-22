package com.codekim.web.controller.admin;

import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codekim.web.entity.Notice;
import com.codekim.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	private NoticeService service;
	
	
	@RequestMapping("list")
	public String list() {
		
		List<Notice> list = service.getList();
		
		return "admin.board.notice.list";
	   
   }
	@RequestMapping("detail")
	public String detail() {
		Notice notice = service.get("id");
	   return "admin.board.notice.detail";
	   
   }
	@RequestMapping("reg")
	public String reg() {
	   return "admin.board.notice.reg";
	   
   }
}
