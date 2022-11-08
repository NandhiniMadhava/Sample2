package functioncalls;

public class CheckVowel {

	public String vowel(String word) {		
		String lower = word.toLowerCase();
		if(word.contains("a") || word.contains("e") || word.contains("i")|| word.contains("o") || word.contains("") ) {
			return "Contains vowel";
		}
		else {
			return "Does not contains vowel";
		}
	}
	public int checkCount (String word) {
		int count=0;
		for(int i=0; i<word.length();i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'  ) {
			count = count+1;
		} }
		return count;
	}
}
