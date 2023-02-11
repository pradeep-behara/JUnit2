package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestSort {
	int[] arr = {12,43,21,73};
	DailyTasks dailyTasks = new DailyTasks();
	
	@Test
	public void testSortValue() {
		System.out.println("Inside test sort");
		int[] output = {12,21,43,73};
		assertArrayEquals(output,dailyTasks.sortValues(arr));
	}
}
