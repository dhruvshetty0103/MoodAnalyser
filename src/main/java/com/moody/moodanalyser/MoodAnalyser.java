package com.moody.moodanalyser;

public class MoodAnalyser 
{
	String message;
	
	public MoodAnalyser()
	{
		this.message = null;
	}
	
	public MoodAnalyser(String message)
	{
		this.message = message;
	}

	public String analyseMood() 
	{
		
			if(message.contains(("sad")))
			{
				return "SAD";
			}
			else 
			{
				return "HAPPY";
			}
		
	}
}