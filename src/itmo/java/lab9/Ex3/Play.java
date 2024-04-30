package itmo.java.lab9.Ex3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Play {
    public static Set<Integer> printScore(String nameUser, Map<User, Integer> score) {
        Set<Integer> result = new HashSet<>();
        for (Map.Entry<User, Integer> pair : score.entrySet()) {
            User user = pair.getKey();
            if (user.getName().equals(nameUser)) {
                result.add(pair.getValue());
            }
        }
        return result;
    }
}