package com.skilldistillery.smoochyzoo.controllers;

import org.springframework.stereotype.Controller;

import src.main.java.com.skilldistillery.smoochyzoo.data.UserDAO;

@Controller
public class UserController
{

	private UserDAO userDAO;

	private UserController(UserDAO dao)
	{
		this.userDAO = dao;
	}
}
