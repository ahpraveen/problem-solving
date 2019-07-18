package newProject;

import java.util.HashMap;
import java.util.Map;

public class CharMappingTest {

	public static void main(String[] args) {

		String sample = "Abcde";
		char[] letter = charMap(sample);
		System.out.println(letter);

	}

	private static char[] charMap(String sample) {
		char[] letter = sample.toCharArray();
		
		Map<Character, Character> map = new HashMap<>();
		map.put('a', '4');
		map.put('e', '3');
		map.put('i', '1');
		map.put('o', '0');
		map.put('s', '5');
		map.put('t', '7');

		for (int i = 0; i < letter.length; i++) {
			System.out.println(letter[i]);

			switch (letter[i]){
			case 'a' | 'A':
				letter[i] = map.get('a');	
				break;
			case 'e' | 'E':
				letter[i] = map.get('e');
				break;
				
			case 'i' | 'I':
				letter[i] = map.get('i');
				break;
				
			case 'o' | 'O':
				letter[i] = map.get('o');
				break;
				
			case 's' | 'S':
				letter[i] = map.get('s');
				break;

			case 't' | 'T':
				letter[i] = map.get('t');
				break;
				
			default:
				continue;

			}

		}
		return letter;
	}

}
