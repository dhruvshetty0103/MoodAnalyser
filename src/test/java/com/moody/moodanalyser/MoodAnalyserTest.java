package com.moody.moodanalyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest 
{
	
	@Test
	/*Method to check if 
	 * sentence contains word sad
	 */
	public void sadCheck() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is sad message");
		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood,CoreMatchers.is("SAD"));
	}
	
	/*Method to check if 
	 * sentence contains word happy
	 */
	@Test
	public void happyCheck() 
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
	}
	
}
