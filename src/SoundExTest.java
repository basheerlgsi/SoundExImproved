
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SoundExTest {

	SoundEx soundEx;
	
	@Before
	public void setUp() throws Exception {
		soundEx = new SoundEx();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void retainsSoleLetterOfTheSingleLetterWord() throws Exception {
		assertEquals("A000", soundEx.encode("A"));
		assertThat(soundEx.encode("B"), equalTo("B000"));
	}
	
	@Test
	public void replaceConsonantWithAppropriateDigit() throws Exception {
		assertEquals("A100", soundEx.encode("Ab"));
		assertEquals("A200", soundEx.encode("Ac"));
	}
}
