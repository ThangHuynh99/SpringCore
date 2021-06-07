package com.spring.service;

import org.springframework.stereotype.Service;

@Service(value="hihi")
public class Hiihi implements Hahaa{

	@Override
	public void hello() {
		System.out.println("This is Hiihi class");
	}

	@Override
	public String print() {
		return "This is Hiihi class";
	}

}
