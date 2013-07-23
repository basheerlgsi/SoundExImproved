
public class SoundEx {
	public String encode(String word) {
		return zeroPadTo3Digits(head(word) + encodedDigits(tail(word)));
	}

	private String encodedDigits(String word) {
		if(word.isEmpty())
			return "";
		if(word.charAt(0)== 'b')
			return "1";
		return "2";
	}

	private String tail(String word) {
		return word.substring(1);
	}

	private String head(String word) {
		return word.substring(0,1);
	}

	private String zeroPadTo3Digits(final String word) {
		String zeroPaededWord;
		zeroPaededWord = word;
		zeroPaededWord += "000";
		return zeroPaededWord.substring(0,4);
	}
}
