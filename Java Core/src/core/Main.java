package core;

public class Main {

	public static void main(String[] args) {
		String q = "summer";
		String w = new String("summer23");
		System.out.println(q.compareTo(w));
		System.out.println(CompareTo(q, w));
	}

	static int CompareTo(String s1, String s2) {
		int x, l1, l2, min;
		if (s1.equals(s2)) {
			return 0;
		}
		l1 = s1.length();
		l2 = s2.length();
		if (l1 > l2) {
			min = l2;
		} else {
			min = l1;
		}
		for (x = 1; x <= min; x++) {
			if (s1.charAt(x - 1) != s2.charAt(x - 1)) {
				return s1.charAt(x - 1) - s2.charAt(x - 1);
			}
		}
		
		return l1 - l2;
	}

}
