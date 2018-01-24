/**
 * 
 */
package com.deepak.checkParanthesis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author deepak
 *
 */
public class CheckParenthesisService {

	private String inputString;
	
	Map<Character, Character> parenthesisMap = new HashMap<Character, Character>();
	List<Character> parenthesisList = new ArrayList<Character>();
	
	public CheckParenthesisService(String inputString) {
		this.inputString = inputString;
		
		this.parenthesisList.add('(');
		this.parenthesisList.add(')');
		this.parenthesisList.add('{');
		this.parenthesisList.add('}');
		this.parenthesisList.add('[');
		this.parenthesisList.add(']');
		this.parenthesisList.add('<');
		this.parenthesisList.add('>');
		
		this.parenthesisMap.put(')', '(');
		this.parenthesisMap.put('}', '{');
		this.parenthesisMap.put(']', '[');
		this.parenthesisMap.put('>', '<');
	}

	public boolean isParenthesisValid(){
		
		Stack<Character> st = new Stack<Character>();
		st.add('$');
		for (int i = 0; i < this.inputString.length(); i++) {
			
			if(parenthesisMap.containsValue(this.inputString.charAt(i))){
				st.push(this.inputString.charAt(i));
			}
			
			if(parenthesisMap.containsKey(this.inputString.charAt(i))){
				if(!st.pop().equals(this.parenthesisMap.get(this.inputString.charAt(i)))){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public String getInputString() {
		return inputString;
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	
	
}
