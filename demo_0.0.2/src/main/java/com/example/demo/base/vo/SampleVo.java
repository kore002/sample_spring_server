package com.example.demo.base.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;
@Data
public class SampleVo {
	private String EMPNO	    ;
	private String ENAME     ;
	private String JOB     ;
	private String MGR        ;
	private Date HIREDATE   ;
	private String SAL    ;
	private String COMM	 ;

}
