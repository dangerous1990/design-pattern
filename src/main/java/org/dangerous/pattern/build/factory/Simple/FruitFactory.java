package org.dangerous.pattern.build.factory.Simple;

/**
 * Created by Administrator on 2016/12/9.
 */
public class FruitFactory {

    public  static <T> T getFruit(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }


}
