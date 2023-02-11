package com.wipro.test;
import org.junit.Test;
import com.wipro.task.DailyTasks;
import static org.junit.Assert.assertEquals;

public class TestStringConcat {
	String s1 = "Great";
	String s2 = "Day";
	DailyTasks dailyTasks = new DailyTasks();
	
	@Test
	public void testConcatValue() {
		System.out.println("Inside test concat");
		String output = "Great Day";
		assertEquals(output,dailyTasks.doStringConcat(s1,s2));
	}
}
