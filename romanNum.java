package bigO;

import java.util.Iterator;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class romanNum {
	public static void main(String[] args) {

		String set = "III";
		System.out.println(romanToInt(set));
	}

	public static int romanToInt(String s) {

		int num1 = 0;
		int num2 = 0;
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char rmword = s.charAt(i);

			switch (rmword) {
			case 'I':
				num1 = 1;
				break;
			case 'V':
				num1 = 5;
				break;
			case 'X':
				num1 = 10;
				break;
			case 'L':
				num1 = 50;
				break;
			case 'C':
				num1 = 100;
				break;
			case 'D':
				num1 = 500;
				break;
			case 'M':
				num1 = 1000;
				break;
			}

			if (i == 0) {
				num2 = num1;
				continue;
			}
			if (num2 >= num1) {
				sum += num2;
			} else {
				sum -= num2;
			}
			num2 = num1;
			if (i +1 == s.length()) {
				sum += num1;
			}
		}
		return sum;
	}
}

//O(n)