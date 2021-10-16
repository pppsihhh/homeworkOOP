package sample;

public class InverseTransformer extends TextTransformer {

	@Override
	public String transform(String text) {
		char[] ch = text.toCharArray();
		for (int i = 0, j = ch.length - 1; i < ch.length / 2; i++, j--) {
			char buf = ch[i];
			ch[i] = ch[j];
			ch[j] = buf;
		}
		return new String(ch);
	}
}
