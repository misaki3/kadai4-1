package junit.tutrial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelUtilTest {

	@Test
	public void スネークケースの文字列abcをキャメルケースの文字列に変換した時Abcになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
		}
	@Test
	public void スネークケースの文字列abc_defをキャメルケースの文字列に変換した時AbcDefになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
		}
	@Test
	public void スネークケースの文字列abc_def_ghをキャメルケースの文字列に変換した時AbcDefGhになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = scu.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
		}
	@Test
	public void スネークケースの文字列abc__def__ghをキャメルケースの文字列に変換した時AbcDefGhになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = scu.snakeToCamelcase("abc__def__gh");
		assertThat(actual, is(expected));
		}
	@Test
	public void スネークケースの文字列_abc_def__をキャメルケースの文字列に変換した時AbcDefになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
		}
	
	
	@Test
	public void スネークケースの文字列Abcをキャメルケースの文字列に変換した時abcになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
		}
	@Test
	public void スネークケースの文字列AbcDefをキャメルケースの文字列に変換した時abc_defになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = scu.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
		}
	@Test
	public void スネークケースの文字列AbcDefGhをキャメルケースの文字列に変換した時abc_def_ghになる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = scu.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
		}
	
	
	@Test
	public void capitalizeで空文字を空文字に() {//間違え
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "　";
		String actual = scu.capitalize("　");
		assertThat(actual, is(expected));
		}
	@Test
	public void capitalizeでaをAに() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "A";
		String actual = scu.capitalize("a");
		assertThat(actual, is(expected));
		}
	@Test
	public void capitalizeでxyzをXyzに() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = scu.capitalize("xyz");
		assertThat(actual, is(expected));
		}
	
	
	@Test
	public void uncapitalizeで空文字を空文字に() {//間違え
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "　";
		String actual = scu.uncapitalize("　");
		assertThat(actual, is(expected));
		}
	@Test
	public void uncapitalizeでAをaに() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "a";
		String actual = scu.uncapitalize("A");
		assertThat(actual, is(expected));
		}
	@Test
	public void uncapitalizeでXyzをxyzに() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = scu.uncapitalize("Xyz");
		assertThat(actual, is(expected));
		}
}