package it.imolinfo;

import org.junit.Test;

/**
 * Classi di test
 */
public class AppTest {
	@Test(expected = TestModeOnlyException.class)
	public void testMainDisabled() throws Exception {
		System.setProperty("test.mode.enabled", "false");
		App.main();
	}

	@Test
	public void testMainEnabled() throws Exception {
		System.setProperty("test.mode.enabled", "true");
		App.main();
	}
}
