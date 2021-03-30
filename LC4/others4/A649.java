package others4;

public class A649 {
	class Solution {
		public String predictPartyVictory(String senate) {
			StringBuffer stringBuffer = new StringBuffer(senate);
			while (true) {
				for (int i = 0; i < stringBuffer.length(); i++) {
					System.out.println(stringBuffer.toString());
					if (stringBuffer.indexOf("R") == -1)
						return "Dire";
					if (stringBuffer.indexOf("D") == -1)
						return "Radiant";
					if (stringBuffer.charAt(i) == 'R') {
						if (stringBuffer.indexOf("D", i) == -1) {
							if (stringBuffer.indexOf("D") < i)
								i--;
							stringBuffer.deleteCharAt(stringBuffer.indexOf("D"));
						} else {
							stringBuffer.deleteCharAt(stringBuffer.indexOf("D", i));
						}
					} else {
						if (stringBuffer.indexOf("R", i) == -1) {
							if (stringBuffer.indexOf("R") < i)
								i--;
							stringBuffer.deleteCharAt(stringBuffer.indexOf("R"));
						} else {
							stringBuffer.deleteCharAt(stringBuffer.indexOf("R", i));
						}
					}
				}

			}
		}
	}
}
