package sample;

public class UpDownTransformer extends TextTransformer {

	@Override
	public String transform(String text) {
		char[] ch = text.toCharArray();

		for (int i = 1; i <= ch.length; i++) {
			if (i % 2 != 0) {
				ch[i - 1] = Character.toUpperCase(ch[i - 1]);
			}
		}
		return new String(ch);
	}
}
