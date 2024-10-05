import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class L_432 {
    private Map<String, Integer> keyCount;
    private TreeMap<Integer, Set<String>> countKeys;

    public AllOne() {
        keyCount = new HashMap<>();
        countKeys = new TreeMap<>();
    }

    public void inc(String key) {
        int count = keyCount.getOrDefault(key, 0);

        if (count > 0) {
            Set<String> oldSet = countKeys.get(count);
            oldSet.remove(key);
            if (oldSet.isEmpty()) {
                countKeys.remove(count);
            }
        }

        count++;
        keyCount.put(key, count);
        countKeys.computeIfAbsent(count, k -> new HashSet<>()).add(key);
    }

    public void dec(String key) {
        if (!keyCount.containsKey(key)) {
            return; // Key doesn't exist
        }

        int count = keyCount.get(key);
        Set<String> oldSet = countKeys.get(count);
        oldSet.remove(key);
        if (oldSet.isEmpty()) {
            countKeys.remove(count);
        }

        if (count == 1) {
            keyCount.remove(key);
        } else {
            count--;
            keyCount.put(key, count);
            countKeys.computeIfAbsent(count, k -> new HashSet<>()).add(key);
        }
    }

    public String getMaxKey() {
        if (countKeys.isEmpty()) {
            return "";
        }
        return countKeys.lastEntry().getValue().iterator().next();
    }

    public String getMinKey() {
        if (countKeys.isEmpty()) {
            return "";
        }
        return countKeys.firstEntry().getValue().iterator().next();
    }
}
