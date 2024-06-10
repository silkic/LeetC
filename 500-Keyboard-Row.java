public class Solution {
  public static String[] findWords(String[] words) {
    List<String> matchingWords = new ArrayList<>();
    String firstRow = \qwertyuiop\;
    String secondRow = \asdfghjkl\;
    String thirdRow = \zxcvbnm\;

    for (String word : words) {
      boolean onFirstRow = true, onSecondRow = true, onThirdRow = true;
      for (char ch : word.toLowerCase().toCharArray()) {
        if (!firstRow.contains(String.valueOf(ch))) {
          onFirstRow = false;
        }
        if (!secondRow.contains(String.valueOf(ch))) {
          onSecondRow = false;
        }
        if (!thirdRow.contains(String.valueOf(ch))) {
          onThirdRow = false;
        }

        // Early exit if the character disqualifies the word from all rows
        if (!onFirstRow && !onSecondRow && !onThirdRow) {
          break;
        }
      }

      // Add the word to the result if it belongs to a single row
      if (onFirstRow || onSecondRow || onThirdRow) {
        matchingWords.add(word);
      }
    }

    return matchingWords.toArray(new String[matchingWords.size()]);
  }
}
