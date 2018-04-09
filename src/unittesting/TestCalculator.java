package unittesting;
import org.junit.Assert;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = cal.addition(10, 8);
		Assert.assertEquals(result, 18);
		System.out.println(result);
	}
}
