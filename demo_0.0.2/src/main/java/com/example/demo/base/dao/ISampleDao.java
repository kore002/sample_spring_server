package com.example.demo.base.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.base.vo.SampleVo;

@Mapper
public interface ISampleDao {
	public List<SampleVo> listDao();
}
