package a1_10;

public class A7 {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println(reverse(123));
		System.out.println(reverse(-123));

		System.out.println(reverse(120));
		System.out.println(reverse(0));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(reverse(-2147483648));

	}

	public static int reverse(int x) {
		long a, n = 0;
		long c;
		String b = "";
		c = x;
		if (c < 0) {
			n = 1;
			c = c * -1;
		}
		if (x == 0) {
			return 0;
		}
//		System.out.println(c);
//		System.out.println(n);
		while (c != 0) {
			a = c % 10;
			c = c / 10;
			b += a;
		}
//		System.out.println(b);
		c = new Long(b);

		if (n == 1) {
			c = -c;
		}
		if (c > Integer.MAX_VALUE || c < Integer.MIN_VALUE) {
			return 0;
		}
		int d = new Integer(b);
		if (n == 1) {
			d = -d;
		}

		return d;
	}
	//评论区某大佬
	class Solution {
	    public int reverse(int x) {
	        long temp = 0;
	       
	        while(x != 0){
	            int pop = x % 10;
	            temp = temp * 10 + pop;
	            
	            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
	                return 0;
	            }
	            x /= 10;
	        }
	        return (int)temp;
	    }
	}
}
