package client_side;

import java.util.ArrayList;
import java.util.Scanner;

public class Lexer {
	//singleton.
	private static class LexerHolder{
		public static final Lexer lexer= new Lexer();
	}
	
	private Lexer() {}
	
	public Lexer getInstance()
	{
		return LexerHolder.lexer;
	}
	
	//TODO: use a regex to break expression tokens properly.
	//breaks the code into tokens, line by line.
	private String[] lexer(String code)
	{
		ArrayList<String> tokens=new ArrayList<String>();
		Scanner s=new Scanner(code);
		while(s.hasNext()) tokens.add(s.next());
		s.close();
		String temp[]=tokens.toArray(new String[tokens.size()]);
		return temp;
	}

	
}
