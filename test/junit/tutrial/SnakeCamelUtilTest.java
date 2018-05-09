package junit.tutrial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelUtilTest {

	@Test
	public void スネークケースの文字列abcをキャメルケースの文字列に変換した時Abcになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
		}
	@Test
	public void スネークケースの文字列AbcDefをキャメルケースの文字列に変換した時abc_defになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = scu.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
		}

}
