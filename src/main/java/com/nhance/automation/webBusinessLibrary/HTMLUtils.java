package com.nhance.automation.webBusinessLibrary;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.parser.ParserDelegator;

import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.EnvironmentVariablesForWeb;

import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;

public class HTMLUtils {
	
	
	public static List<String> extractText(Reader reader) throws IOException {
	    final ArrayList<String> list = new ArrayList<String>();

	    ParserDelegator parserDelegator = new ParserDelegator();
	    ParserCallback parserCallback = new ParserCallback() {
	      public void handleText(final char[] data, final int pos) {
	        list.add(new String(data));
	      }
	      public void handleStartTag(Tag tag, MutableAttributeSet attribute, int pos) { }
	      public void handleEndTag(Tag t, final int pos) {  }
	      public void handleSimpleTag(Tag t, MutableAttributeSet a, final int pos) { }
	      public void handleComment(final char[] data, final int pos) { }
	      public void handleError(final java.lang.String errMsg, final int pos) { }
	    };
	    parserDelegator.parse(reader, parserCallback, true);
	    return list;
	  }

	  public final static void main(String[] args) throws Exception{
	    FileReader reader = new FileReader((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.HTMLPAGE_OTP_CONTENT_IN_EMAIL_PATH));
	    List<String> lines = HTMLUtils.extractText(reader);
	    for(int i=0;i<lines.size();i++)
	    {
	    	System.out.println(lines.get(i));
	    	if(lines.get(i).contains("reset is: "))
	    	{
	    		System.out.println("The line contains : "+lines.get(i));
	    		String CodeLineContains=lines.get(i).replaceAll("reset is: ", "").trim();
	    		System.out.println("The OTP Code is : "+ CodeLineContains.trim());
	    		break;
	    	}
	    	else
	    	{
	    		
	    	}
	    }
	   /* for (String line : lines) {
	      System.out.println(line);
	    }*/
	  }

}
