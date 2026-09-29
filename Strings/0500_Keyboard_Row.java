import java.util.*;

class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String lower = word.toLowerCase();
            int row = -1;
            for (int r = 0; r < rows.length; r++)
                if (rows[r].indexOf(lower.charAt(0)) >= 0) { row = r; break; }
            boolean valid = true;
            for (char c : lower.toCharArray())
                if (rows[row].indexOf(c) < 0) { valid = false; break; }
            if (valid) result.add(word);
        }
        return result.toArray(new String[0]);
    }
}