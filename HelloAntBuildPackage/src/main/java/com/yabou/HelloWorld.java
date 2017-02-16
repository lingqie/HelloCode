package com.yabou;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.stat.descriptive.rank.Min;

public class HelloWorld {
	public static void main(String[] args) {
		double[] values = new double[] { 0.33, 1.33,0.27333, 0.3, 0.501, 

                0.444, 0.44, 0.34496, 0.33,0.3, 0.292, 0.667 }; 
		Min min=new Min();
		double evaluate = min.evaluate(values);
		String s=StringUtils.upperCase("Hello World");
		System.out.println(s+evaluate);
	}
}
