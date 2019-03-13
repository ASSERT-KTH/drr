package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import util.ReadInputs;

public class ReadInputsTest {
	
	@Test
	public void readsucc() {
		List<String> input = ReadInputs.readLine("./examples/chart1jgenprog_delta0.txt");
		assertEquals(2,input.size());
	}
	
	@Test
	public void readFail() {
		try {
		ReadInputs.readLine("./non_exist");
		}catch(Exception ex) {
			assertTrue(ex instanceof RuntimeException);
	        assertTrue(ex.getMessage().contains("Errors in reading file:"));
		}
	}
	
	@Test
	public void readOraclesucc() {
		List<String> input = ReadInputs.readLine("./examples/chart1jgenprog_oracle.txt");
		assertEquals(1,input.size());
	}

}
