package com.rinat.lesson19.hw2.task1;

public class WordDemo {
    public static void main(String[] args) {
        String text = "Fruit and vegetables contain the vitamins and minerals " +
                "we need to stay healthy. But five is actually a fictional number " +
                "thought up by an American nutritionist. She looked at what the average " +
                "person ate and doubled it. According to more recent research, the right " +
                "number is actually eight. The research shows that people who have eight " +
                "pieces of fruit and vegetables a day are much less likely to suffer " +
                "from heart disease than those who eat three.";
        System.out.println(WordUtil.getWords(text));
    }
}
