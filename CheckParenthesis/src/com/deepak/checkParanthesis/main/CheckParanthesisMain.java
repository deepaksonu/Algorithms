package com.deepak.checkParanthesis.main;

import com.deepak.checkParanthesis.service.CheckParenthesisService;

public class CheckParanthesisMain {

	public static void main(String[] args){
		CheckParenthesisService cp = new CheckParenthesisService("(){fs)d(f{}{})dfsdf({[<{sdfsd}asfsfsd>]})}");
		System.out.println(cp.isParenthesisValid());
	}
}
