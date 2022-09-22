package com.codekim.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codekim.web.dao.NoticeDao;
import com.codekim.web.entity.Notice;

public class NoticeServiceImp implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> getList() {
		
		List<Notice> list = noticeDao.getList();
		
		return list;
	}

	@Override
	public Notice get(String id) {
	
		Notice notice = noticeDao.get(id);
		return notice;
	}

}
