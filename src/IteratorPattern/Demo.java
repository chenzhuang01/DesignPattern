package IteratorPattern;

import IteratorPattern.container.impl.NameRepository;
import IteratorPattern.iterator.Iterator;

/**
 * @author cz
 * @Date 2024/1/8 14:07
 */
public class Demo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
