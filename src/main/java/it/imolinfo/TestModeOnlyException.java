package it.imolinfo;

/**
 *  Classe di eccezione che verrà lanciata
 */
public class TestModeOnlyException extends RuntimeException {
	public TestModeOnlyException(String s) {
		super(s);
	}
}
