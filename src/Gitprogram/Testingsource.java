package Gitprogram;

public class Testingsource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="alakhkumar";
		String s="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(s.indexOf(ch)<0) {
				s=s+ch;
			}
			
		}System.out.println(s);

	}

}
