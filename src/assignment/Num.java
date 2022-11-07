package assignment;

public class Num {

	public static void main(String[] args) {
		String s1="asdf345dfg234";
		char[] s2 = s1.toCharArray();
		int sum=0;
		for(int i=0; i<s1.length();i++) {
			if(s2[i]>='0'&&s2[i]<='9') {
			sum =sum+(s2[i]-48);
			}
		}
		System.out.println(sum);
	}

}
