package com.moody.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest 
{
	
	@Test
	/*Method to check if 
	 * sentance contains word sad
	 */
	public void sadCheck()  {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is sad message");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD",mood);
		} catch (MoodAnalyserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*Method to check if 
	 * sentance contains word happy
	 */
	@Test
	public void happyCheck() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
		String mood;
		try 
		{
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY",mood);
		} 
		catch (MoodAnalyserException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenMoodNullShouldHandleException()  
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try 
		{
			moodAnalyser.analyseMood(null);	
		} catch (MoodAnalyserException e) 
		{
			Assert.assertEquals("Please enter non empty message", e.getMessage());
		}
	}
}
