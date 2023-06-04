package romainNumerals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumerals {
	
	public static final Map<String, Integer> romanSymbols = new HashMap<>() {{
		put("I", 1);
		put("V", 5);
		put("X", 10);
		put("L", 50);
		put("C", 100);
		put("D", 500);
		put("M", 1000);
	}};
	
	public static void main(String[] args) {
		
		try {
			System.out.println(romanNumerals("MCMXCIV"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static int romanNumerals(String str) throws Exception {
		if (str.isBlank() || !isRomanNumerals(str)) {
			throw new Exception(str + " is not a roman numeral. Please try again!");
		} else {
			List<Integer> list = new ArrayList<>();
			if (isDisturbingNumber(str)) {
				int before;
				int after;
				for (int i = 0; i < str.length() - 1; i++) {
					before = romanSymbols.get(String.valueOf(str.charAt(i)));
					after = romanSymbols.get(String.valueOf(str.charAt(i + 1)));
					if (before < after) {
						list.add(after - before);
						i++;
						if (i == str.length() - 2) list.add(romanSymbols.get(String.valueOf(str.charAt(i + 1))));
					} else {
						list.add(before);
						if (i == str.length() - 2) list.add(romanSymbols.get(String.valueOf(str.charAt(i + 1))));
					}
				}
			} else {
				if (str.length() == 1) return romanSymbols.get(str);
				else {
					for (int i = 0; i < str.length(); i++) {
						list.add(romanSymbols.get(String.valueOf(str.charAt(i))));
					}
				}
			}
			
			return list.stream().mapToInt(Integer::intValue).sum();
		}
	}
	
	private static boolean isRomanNumerals(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (! romanSymbols.containsKey(String.valueOf(str.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isDisturbingNumber(String str) {
		if (str.length() == 1) return false;
		for (int i = 0; i < str.length() - 1; i++) {
			if (romanSymbols.get(String.valueOf(str.charAt(i))) < romanSymbols.get(String.valueOf(str.charAt(i + 1)))) {
				return true;
			}
		}
		return false;
	}

}
