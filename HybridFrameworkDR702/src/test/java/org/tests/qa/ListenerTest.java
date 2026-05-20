package org.tests.qa;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ListenerTest {
	@Test
	public void TC001() {
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void TC002() {
		Assert.assertEquals(false, true);
	}

}
