package Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import Test.eq;

class test2Test {

	@Test
	public void testing(){
		eq k = new eq();
		float A=k.Result(100,9,42);
		float B = k.Result2(100,9);
		if(A!=378.0 & B!=9.0)Assert.fail();
		}

}
