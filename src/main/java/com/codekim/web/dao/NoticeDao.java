package com.codekim.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.codekim.web.entity.Notice;

@Mapper
public interface NoticeDao {

	@Select("select * from notice")
	List<Notice> getList();

	Notice get(String id);

}
