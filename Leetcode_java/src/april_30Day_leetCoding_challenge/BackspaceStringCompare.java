package april_30Day_leetCoding_challenge;

public class BackspaceStringCompare {

	public static void main(String[] args) {

		String s = "xywrrmp";
		String t = "xywrrmu#p";

		BackspaceStringCompare obj = new BackspaceStringCompare();

		System.out.println(obj.backspaceCompare(s, t));

	}

	public boolean backspaceCompare(String S, String T) {

		char[] arr1 = new char[S.length() + 1];
		char[] arr2 = new char[T.length() + 1];

		int pointer = 0;

		int i = 0;
		while (S.charAt(i) == '#')
			i++;

		for (; i < S.length(); i++) {
			if (S.charAt(i) != '#')
				arr1[pointer++] = S.charAt(i);
			else if (S.charAt(i) == '#' && pointer > 0)
				arr1[--pointer] = '\0';
		}

		arr1[pointer] = '\0';

		pointer = 0;
		i = 0;

		while (T.charAt(i) == '#')
			i++;

		for (; i < T.length(); i++) {
			if (T.charAt(i) != '#')
				arr2[pointer++] = T.charAt(i);
			else if (T.charAt(i) == '#' && pointer > 0)
				arr2[--pointer] = '\0';
		}

		arr2[pointer] = '\0';

		if (String.valueOf(arr1).trim().equals(String.valueOf(arr2).trim()))
			return true;
		else
			return false;

	}

}
