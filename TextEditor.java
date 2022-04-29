package text.com;

public class TextEditor {
 private SpellChecker spl;
	/*
	 * public TextEditor(SpellChecker spl) { System.out.println("inside TE");
	 * this.spl=spl; } public void textSpellCheck() { spl.spellCheck(); }
	 */

public SpellChecker getSpl() {
	return spl;
}

public void setSpl(SpellChecker spl) {
	this.spl = spl;
}
public void textSpellCheck() {
	spl.spellCheck(); 
	}
}
