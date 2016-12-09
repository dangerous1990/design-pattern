package org.dangerous.pattern.build.factory.Simple;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Fruit apple = FruitFactory.getFruit(Apple.class);
        Fruit orange = FruitFactory.getFruit(Orange.class);

        System.out.println(apple.name());
        System.out.println(orange.name());

    }
}
