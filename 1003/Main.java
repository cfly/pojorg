package org.caofei.poj.p1003;


public class Main {
	public static void main(String args[]) throws Exception {
		double[] v = new double[300];
		v[0] = -1;
		System.out.println(calcV(v, 30));
	}

	private static double calcV(double[] v, int i) {
		if (v[i] != -1) {
			return v[i] = (double)1/(i+1) + calcV(v, i - 1);
		} else {
			return 0;
		}
	}

}
