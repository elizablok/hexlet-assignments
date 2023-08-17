package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Objects;

// BEGIN
class App {
    public static <T extends Map<String, String>> List<T> findWhere(List<T> books, Map<String, String> where) {
        List<T> res = new ArrayList<>();
        for (T book: books) {
            var sameYear = !where.containsKey("year") || Objects.equals(where.get("year"), book.get("year"));
            var sameAuthor = !where.containsKey("author") || Objects.equals(where.get("author"), book.get("author"));
            var sameTitle = !where.containsKey("title") || Objects.equals(where.get("title"), book.get("title"));
            if (sameYear && sameAuthor && sameTitle) {
                res.add(book);
            }
        }
        return res;
    }
}
//END
