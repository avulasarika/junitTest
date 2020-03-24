package com.epam.tddjunitdemo;

public class Checkfirst2chars {

	public String removeA(String string) {
		String result = " ";
		int stringlength = string.length();
	    char firstchar = string.charAt(0);
	    char secondchar = string.charAt(1);
	    String remainingchars = string.substring(2,stringlength);
	    if(firstchar == 'A' && secondchar == 'B' || firstchar == 'B' && secondchar == 'A' )
	    {
	     result = "B";
	    }
	    if(firstchar == 'A' && secondchar == 'A' )
	    {
	     result = " ";
	    }
	    if(firstchar == 'B' && secondchar == 'B' )
	    {
	     result = "BB";
	    }
	    
		return result + remainingchars;
	}

} 