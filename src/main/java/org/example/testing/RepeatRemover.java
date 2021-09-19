package org.example.testing;

public class RepeatRemover {

  public String remove(String original) {
    return removeRepeats(original);
  }

  public static String staticRemove(String original) {
    return removeRepeats(original);
  }

  private static String removeRepeats(String original) {
    char[] chars = new char[original.length()];
    chars[0] = original.charAt(0);

    int j = 1;

    for (int i = 0; i < original.length() - 1; i++) {
      char first = original.charAt(i);
      char second = original.charAt(i + 1);

      if (first != second) {
        chars[j] = second;
        j++;
      }

    }

    return new String(chars, 0, j);
  }
}

