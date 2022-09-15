package com.example.demo.base.controller;



import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.service.ISampleService;
import com.example.demo.base.vo.SampleVo;


@RestController
public class SampleController {
	@Autowired
	ISampleService ISampleService;
	
	@GetMapping("/api/info")
	public String projectTnfo() {
		return "Sample Project.";
	}
	@GetMapping("/api/list")
    public List<SampleVo> list(HttpServletRequest httpServletRequest,
            Model model)
    {
    	List<SampleVo> list1 = ISampleService.list();
        return list1;       
    }
	  @GetMapping("/api/hello")    
	  public String hello(){        
		  return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";    
	  }
}
