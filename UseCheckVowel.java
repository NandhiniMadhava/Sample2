package functioncalls;

public class UseCheckVowel {
	public static void main(String[] args) {
		String word = "onesoft";
		CheckVowel v = new CheckVowel();
		System.out.println(word +" "+ v.vowel(word));
		System.out.println(word+" has "+v.checkCount(word)+ " vowels");
	}}
