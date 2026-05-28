public class AnagramGroups {
    public static String toStringg(int freq[]) {
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            key.append(freq[i]);
            key.append('#');
        }
        return key.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];
            int freq[] = new int[26];
            for (int j = 0; j < temp.length(); j++) {
                freq[temp.charAt(j) - 'a']++;
            }
            String key = toStringg(freq);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(temp);
        }
        return new ArrayList<>(map.values());
    }
}

/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
