package newProject;

public class LetterCountingTest {

	public static void main(String[] args) {

		String letter = "aaaabbbbcccddd";
		char[] a = letter.toCharArray();

		System.out.println("length of char:" + a.length);
		int k = 0;
		int index =0;
	
		for(int counter=0; counter<=a.length;counter++){			
			k = countAndPrint(a, k, index);	
			if(k==a.length){
				break;
			}			
		}
	}

	private static int countAndPrint(char[] a, int k, int index) {
		char b;
		int i;
		int j;
		b = a[k];
		i = 0;
		for (j = index; j < a.length; j++) {
			if (b == a[j]) {
				i += 1;
			}
		}
		System.out.print(b + "" + i);	
		k = k + i;		
		return(k);		
	}

}
