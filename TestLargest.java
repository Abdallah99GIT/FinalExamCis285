import static org.junit.Assert.*;
import org.junit.Test;

public class TestLargest  {
	private Largest temp1;

	public void testPositive(){
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        temp1 = new Largest();
        int maxValue = temp1.largest(arr);
	/** add tests to check for this unit test **/
    }

public void testNegative(){
        /** add tests to check for this unit test **/ }
