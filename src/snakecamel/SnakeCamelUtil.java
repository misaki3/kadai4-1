package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_",-1);//_で単語を分ける
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length ; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {//もし大文字なら
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	public static String capitalize(String s) {
		if(s.length()==0)return "";
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);//大文字に
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	public static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);//小文字に
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
