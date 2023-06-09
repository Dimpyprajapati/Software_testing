package Junit_framework;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import basic.Addition;

@RunWith(Parameterized.class)
public class J_003_ParameterizedTest {
		
		int a;
		int b;
		int res;
		
	public J_003_ParameterizedTest(int a, int b, int res) {
			super();
			this.a = a;
			this.b = b;
			this.res = res;
		}
		
	@Test
	public void Testadditiion() {
		Addition aa = new Addition();
		int actual = aa.add(a, b);
		int excepted = res;
		assertEquals(excepted, actual);
		}
	
	@Parameters
	public static List<Object[]> getData() {
		Object obj[][]= new Object[3][3];
		obj[0][0] = 10;
		obj[0][1] = 10;
		obj[0][2] = 20;
		
		obj[1][0] = 40;
		obj[1][1] = 60;
		obj[1][2] = 100;
		
		obj[2][0] = 10;
		obj[2][1] = 450;
		obj[2][2] = 460;
		
		return Arrays.asList(obj);
	}
}
