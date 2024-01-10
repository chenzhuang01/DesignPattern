package IteratorPattern.container.impl;

import IteratorPattern.container.Container;
import IteratorPattern.iterator.Iterator;

/**
 * @author cz
 * @Date 2024/1/8 14:09
 */
public class NameRepository implements Container {
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length ? true : false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
