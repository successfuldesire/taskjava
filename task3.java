import java.lang.Object;
import java.util.IntSummaryStatistics;
import java.util.Arrays;

public class task3 {
    List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
IntSummaryStatistics stats = primes.stream()
                                     .mapToInt((x) -> x)
                                     .summaryStatistics();
System.out.println(stats);
}
