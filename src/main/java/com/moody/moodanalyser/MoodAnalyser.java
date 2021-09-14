package com.moody.moodanalyser;

public class MoodAnalyser 
{
	String message;
	
	public MoodAnalyser()
	{
		this.message = null;
	}
	
	public MoodAnalyser (String message)
	{
		this.message = message;
	}

	public String analyseMood(String message) throws MoodAnalyserException  
	{
		this.message = message;
		return analyseMood();
	}

	
	public String analyseMood() throws MoodAnalyserException 
	{
		try 
		{
			if(message.length()==0)
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter non empty message");
			if(message.contains(("sad")))
			{
				return "SAD";
			}
			else 
			{
				return "HAPPY";
			}
		}
		catch(NullPointerException e)
		{
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter non empty message");
		}
	}
}