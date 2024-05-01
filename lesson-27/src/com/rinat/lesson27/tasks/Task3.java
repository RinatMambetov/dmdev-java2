package com.rinat.lesson27.tasks;

/**
 * 3. Написать программу, выполняющую поиск в строке всех тегов
 * абзацев, в т.ч. тех, у которых есть параметры, например <p id
 * ="p1">, и замену их на простые теги абзацев <p>.
 */
public class Task3 {
    public static void main(String[] args) {
        String input = "test1 <p>test2</p> test3 <p id=\"one\">test4</p> test5 <p>test6 <p id=\"two\">test7</p>";
        String regex = "(<p .+?>)(.+?</p>)"; //question mark for lazy quantification

        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}
