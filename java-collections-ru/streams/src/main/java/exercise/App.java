package exercise;

import java.util.List;

// BEGIN
class App {
    private static final List<String> FREE_DOMAINS = List.of("gmail.com", "yandex.ru", "hotmail.com");
    public static long getCountOfFreeEmails(List<String> list) {
        return list.stream()
                .map(i -> i.split("@")[1])
                .filter(FREE_DOMAINS::contains)
                .count();
    }
}
// END
