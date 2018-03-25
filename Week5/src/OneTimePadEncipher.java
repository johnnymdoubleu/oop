public class OneTimePadEncipher {

    public static int charToInt(char l) {
    	int c = Character.toLowerCase(l) - 'a';
    	return c;
      // Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
    }

    public static char intToChar(int i) {
    	return (char) (i + (int) 'a'); 
      // Should convert an integer to a character, for example 0 -> 'a', b -> '1'
      // it should always return lower case char
    }

    public static boolean isAlpha(char c) {
    	int i = charToInt(c);
    	if (i >= 0 && i < 26) {
    		return true;
    	}
    	return false;
      // You do not need to implement this method, but you may find it useful.
    }

    public static String encipher(String original, String onetimepad) {
      original = original.toUpperCase();
      onetimepad = onetimepad.toUpperCase();
      char[] array = new char[original.length()];
      for (int i = 0; i < original.length(); i++) {
    	  if (isAlpha(original.charAt(i))) {
    		  array[i] = intToChar((charToInt(original.charAt(i)) + (charToInt(onetimepad.charAt(i)))) % 26);
    	  }
    	  else {
    		  array[i] = original.charAt(i);
    	  }
      }
      return String.valueOf(array);
    }
    public static void main(String[] args) {
      String ciphertext = encipher("HELLO EVERYBODY", "MYSECRETKETMYSECRETKEY");
      System.out.print(ciphertext);
    }
}