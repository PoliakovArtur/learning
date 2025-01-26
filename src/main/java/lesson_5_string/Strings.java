package lesson_5_string;

public class Strings {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println(s1 == s2);
        s3 = s3.intern();
        System.out.println(s1 == s3);

        //UTF-8 UTF-16 UTF-32

        System.out.println("\uD83D\uDE04");

        System.out.println(s3.length()); //длина строки
        System.out.println("".isEmpty()); // пустая ли строка
        System.out.println(" \r  \n \t".isBlank()); // состоит ли она из пробельных символов

        String s5 = "\tab\rc\"\\"; //экранирование символов

        System.lineSeparator(); //перенос строки в зависимости от ос

        System.out.println(s5);

        System.out.println("abcb".indexOf('b', 2));
        System.out.println("abcdb".lastIndexOf('b'));
        System.out.println("abcdd".startsWith("abc"));
        System.out.println("\t sd  adfasda ".strip());
        System.out.println("sdfa".substring(1, 4)); //включая начальный индекс, не включая последний
        System.out.println("safsd".charAt(1));
        System.out.println("asfds".codePointAt(2));
        System.out.println("ASF".toLowerCase());


        String s6 = "a";

        long before = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s6 = s6 + i;
        }
        //   System.out.println(s6);
        long after = System.currentTimeMillis();

        System.out.println("time " + (after - before));

        StringBuilder stringBuilder = new StringBuilder(10000);

        before = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        after = System.currentTimeMillis();

        System.out.println("time " + (after - before));

    }

    /*

        1. Перевернуть строку

            public String reverse(String str) {

            }

        2. Определить, является ли строка палиндромом

            public boolean isPalindrome(String str) {

            }

        3. Roman to Integer

            public int isValid(String str) {

            }


        4. Определить валидность скобочной последовательности

        примеры
        {[()]} - true
        {(() - false
        ([{])} - false

        public boolean isValidBracketSequence(String bracketSequence) {

        }

     */
}