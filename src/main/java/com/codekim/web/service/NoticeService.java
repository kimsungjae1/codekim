package com.codekim.web.service;

import java.util.List;

import com.codekim.web.entity.Notice;

public interface NoticeService {

	List<Notice> getList();

	Notice get(String string);

}
