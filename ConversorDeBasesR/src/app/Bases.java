package app;

public class Bases {
	char[] let = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	/*
	 * public String cambioBase(int n, int b) { if (n == 0) { return ""; } else
	 * { return cambioBase(n / b, b) + " " + (n % b); }
	 * 
	 * }
	 */
	public String cambioBase(int Digito, int Base) {
		int Resultado = Digito % Base;
		if (Digito < 1) {
			return "";//+let[resu];
		} else {
			return cambioBase(Digito / Base, Base) + " " + let[Resultado];
		}

	}

	/*
	 * public void cambioBase(int n, int b) { if (n < b) { if (n == 10)
	 * System.out.print("A"); if (n == 11) System.out.print("B"); if (n == 12)
	 * System.out.print("C"); if (n == 13) System.out.print("D"); if (n == 14)
	 * System.out.print("E"); if (n == 15) System.out.print("F"); if (n < 10)
	 * System.out.print(n); } else { cambioBase(n / b); System.out.print(n % b);
	 * }
	 * 
	 * }
	 */
	/*
	 * public static String Hexa(int s) { String result = ""; int remainder = s
	 * % 16;
	 * 
	 * if (s == 0) { return ""; } else { switch (remainder) { case 10: result =
	 * "A"; break; case 11: result = "B"; break; case 12: result = "C"; break;
	 * case 13: result = "D"; break; case 14: result = "E"; break; case 15:
	 * result = "F"; break; default: result = remainder + result; break; }
	 * return Hexa((s / 16)) + result; } }
	 */
}
