package kyu7.ListFiltering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = list.stream().filter(s -> s instanceof Integer).toList();
        return result;
    }
}
