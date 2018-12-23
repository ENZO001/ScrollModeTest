package com.ctbc.pcms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ctbc.pcms.model.dao.CommonFlowService;

@Controller
public class FM001S03 {

	@Autowired
	private CommonFlowService commonFlowService;
	
	@RequestMapping(value = "/")
	public void intoPiece() {
//		commonFlowService.insertFlowMain();
		commonFlowService.getFlowMain();
	}

}
