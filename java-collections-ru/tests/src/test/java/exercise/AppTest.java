package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actual = App.take(list, 2);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(actual).isEqualTo(expected);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> actual2 = App.take(list2, 8);
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        assertThat(actual2).isEqualTo(expected2);

        List<Integer> list3 = new ArrayList<>();
        List<Integer> actual3 = App.take(list3, 3);
        List<Integer> expected3 = new ArrayList<>();
        assertThat(actual3).isEqualTo(expected3);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(3, 4, 5));
        List<Integer> actual4 = App.take(list4, 0);
        List<Integer> expected4 = new ArrayList<>();
        assertThat(actual4).isEqualTo(expected4);
        // END
    }
}
