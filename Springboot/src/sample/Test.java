package sample;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testConcat() {
		SampleController myConcat = new SampleController();
        String result = myConcat.concat("sri", "mukh");
        assertEquals("srimukh", result);

	}


}
