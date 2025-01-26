package lesson_4_object.tasks.decorator;

/*
    Имеется интерфейс StringDecorator и его одна имплементация TrimStringDecorator.

    Реализовать несколько имплементаций данного интерфейса, которые будут навешивать дополнительную функциональность
    на другой StringDecorator, передаваемый через конструктор, при этом делегируя вызов другому декоратору.
    Нужно реализовать следующие декораторы:
     1. Оборачивает строку в круглые скобки
     2. Оборачивает строку в квадратные скобки
     3. Оборачивает строку в фигурные скобки
     4. Оборачивает строку в угловые скобки

    Например:
        StringDecorator decorator = new SquareBracketDecorator(new RoundBracketDecorator(new AngleBracketDecorator(new TrimStringDecorator())));

        System.out.println(decorator.decorate("  abc   ")); // результат [(<abc>)]

    такой подход позволяет динамически добавлять нужную функциональность в зависимости от условий
 */


public interface StringDecorator {

    String decorate(String str);
}

class TrimStringDecorator implements StringDecorator {

    @Override
    public String decorate(String str) {
        return str.trim();
    }
}