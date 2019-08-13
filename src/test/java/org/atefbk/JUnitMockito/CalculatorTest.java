package org.atefbk.JUnitMockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class CalculatorTest {
	
	Calculator c = null;
	
	@Mock
	CalculatorService service;
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	@Before
	public void setUp() {
		/**
		 * Première façon sans les annotations @Mock & @Rule
		 */
//		service = Mockito.mock(CalculatorService.class);
		c = null;
		c = null;
		c = new Calculator(service);
		c = null;
	}
	
	@Test
	public void testAdd() {
		
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(21, c.calculate(2, 3, 4));
		verify(service).add(2, 3);
	}
}
