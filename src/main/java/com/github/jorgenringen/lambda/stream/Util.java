package com.github.jorgenringen.lambda.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Util {

    public static List<String> mapToUppercase(List<String> input) {
        return input.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static List<String> removeElementsWithMoreThanFourCharacters(List<String> input) {
        return input.stream().filter(s -> s.length() <= 3).collect(Collectors.toList());
    }

    public static List<String> sortStrings(List<String> input) {
        return input.stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> sortIntegers(List<String> input) {
        return input.stream().mapToInt(Integer::parseInt).sorted().boxed().collect(Collectors.toList());
    }

    public static List<Integer> sortIntegersDescending(List<String> input) {
        return input.stream().mapToInt(Integer::parseInt).boxed().sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(i -> i).sum();
    }

    public static List<String> flattenToSingleCollection(List<List<String>> input) {
        return input.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
    }

    public static String separateNamesByComma(List<Person> input) {
        throw new NotImplementedException();
    }

    public static String findNameOfOldestPerson(List<Person> input) {
        throw new NotImplementedException();
    }

    public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
        throw new NotImplementedException();
    }

    public static IntSummaryStatistics getSummaryStatisticsForAge(List<Person> input) {
        throw new NotImplementedException();
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {
        throw new NotImplementedException();
    }

    public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
        throw new NotImplementedException();
    }
}
