package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishMessageservice;

public class WishAppController extends AbstractController {

	private WishMessageservice service;
	
	public WishAppController(WishMessageservice service) {
		
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		String mesg=null;
		mesg=service.wishmessage();
		
		return new ModelAndView("home","wmsg",mesg);
	}

}
