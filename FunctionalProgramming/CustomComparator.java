package FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toList());

        Comparator<Integer> comparator = ((first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;

            } else if ((first % 2 == 0 && second % 2 == 0)
                    || (first % 2 != 0 && second % 2 != 0)) {
                if (first <= second) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return 0;
        });

        numbers.sort(comparator);
        numbers.forEach(n -> System.out.print(n + " "));
    }
}
