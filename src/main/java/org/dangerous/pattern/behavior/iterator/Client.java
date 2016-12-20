package org.dangerous.pattern.behavior.iterator;

/**
 * Created by Administrator on 2016/12/20.
 */
public class Client {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
