package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(u -> Objects.equals(u.get("gender"), "male"))
                .sorted(Comparator.comparing(u -> LocalDate.parse(u.get("birthday"))))
                .map(u -> u.get("name"))
                .collect(Collectors.toList());
    }
}
// END
