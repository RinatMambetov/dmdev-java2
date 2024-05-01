package com.rinat.chapter5_6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Chapter5_6Runner {
    public static void main(String[] args) {
        Trader ivan = new Trader("Ivan", "Moscow");
        Trader sasha = new Trader("Sasha", "Sochi");
        Trader vasya = new Trader("Vasya", "Moscow");
        Trader masha = new Trader("Masha", "Moscow");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(vasya, 2011, 300),
                new Transaction(ivan, 2012, 1000),
                new Transaction(ivan, 2011, 400),
                new Transaction(sasha, 2012, 710),
                new Transaction(sasha, 2012, 700),
                new Transaction(masha, 2012, 950)
        );

        List<Transaction> task1 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .toList();
        System.out.println(task1);

        List<String> task2 = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .toList();
        System.out.println(task2);

        List<Trader> task3 = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Moscow"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .toList();
        System.out.println(task3);

        String task4 = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted(String::compareTo)
                .distinct()
                .collect(Collectors.joining());
        System.out.println(task4);

        Optional<Trader> task5 = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Sochi"))
                .findAny();
        task5.ifPresentOrElse(System.out::println, () -> System.out.println("not trader"));

        int task6 = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Moscow"))
                .map(Transaction::getValue)
                .reduce(0, Integer::sum);
        System.out.println(task6);

        Optional<Integer> task7 = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo);
        task7.ifPresentOrElse(System.out::println, () -> System.out.println("not max"));

        Optional<Transaction> task8 = transactions.stream()
                .min(comparing(Transaction::getValue));
        task8.ifPresentOrElse(System.out::println, () -> System.out.println("not transaction"));

    }
}
