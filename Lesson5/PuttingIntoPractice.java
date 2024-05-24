package Aston.Lesson5;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // 1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей)
//        List<Transaction> collect = transactions.stream()
//                .filter(transaction -> transaction.getYear() == 2011)
//                .sorted(Comparator.comparing(Transaction::getValue))
//                .collect(Collectors.toList());
//        System.out.println(collect);


        // 2. Вывести список неповторяющихся городов, в которых работают трейдеры
//        List<String> collect = transactions.stream()
//                .map(transaction -> transaction.getTrader().getCity())
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(collect);


        // 3. Найти всех трейдеров из Кембриджа и отсортировать их по именам
//        List<Trader> cambridge = transactions.stream()
//                .map(Transaction::getTrader)
//                .filter(trader -> trader.getCity().equals("Cambridge"))
//                .distinct()
//                .sorted(Comparator.comparing(Trader::getName))
//                .toList();
//        System.out.println(cambridge);


        // 4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке
//        Optional<String> reduce = transactions.stream()
//                .map(transaction -> transaction.getTrader().getName())
//                .distinct()
//                .sorted()
//                .reduce((n1, n2) -> n1 + n2);
//        System.out.println(reduce);


        // 5. Выяснить, существует ли хоть один трейдер из Милана
//        boolean milan = transactions.stream()
//                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
//        System.out.println(milan);


        // 6. Вывести суммы всех транзакций трейдеров из Кембриджа
//        List<Integer> collect = transactions.stream()
//                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
//                .map(t -> t.getValue())
//                .collect(Collectors.toList());
//        System.out.println(collect);

        // 7. Какова максимальная сумма среди всех транзакций?
//        Optional<Integer> reduce = transactions.stream()
//                .map(Transaction::getValue)
//                .reduce(Integer::max);
//        System.out.println(reduce);


        // 8. Найти транзакцию с минимальной суммой
//        Optional<Integer> reduce = transactions.stream()
//                .map(Transaction::getValue)
//                .reduce(Integer::min);
//        System.out.println(reduce);


    }
}
