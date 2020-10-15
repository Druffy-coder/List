package Withlist;

public class List {
    class item {
        private int value;
        private item next;


        public item(int value) {
            this.value = value;
            this.next = null;
        }


        public boolean hasNext() {
            if (this.next != null) {
                return true;
            } else {
                return false;
            }
        }

        public int getValue() { return value; }


        public item getNext() {
            return next;
        }

        public void setNext(item next) {
            this.next = next;
        }

        public String toString() {
            return Long.toString(this.value);
        }
    }

    private item begin;
    private long counter;

    public List() {
        this.begin = null;
        this.counter = 0;
    }


    public void add(int value) {
        item item = new item(value);
        if (this.begin == null)
            this.begin = item;
        else {
            end().setNext(item);
        }
        this.counter++;
    }

    public item end() {
        if (this.begin == null)
            return null;
        item iter = this.begin;
        while (iter.hasNext()) {
            iter = iter.getNext();
        }
        return iter;
    }

    public String toString() {
        String result = "[";
        if (this.begin == null)
            return null;
        else {
            item iter = this.begin;
            while (iter.hasNext()) {
                result += iter.toString() + ", ";
                iter = iter.getNext();
            }
            result += iter.toString();
        }
        result += "]";
        return result;
    }

    public void swap(int firstPos, int secondPos) {
        if (firstPos > secondPos) {
            int a;
            a = firstPos;
            firstPos = secondPos;
            secondPos = a;
        }
        item predFirst = indexAt(firstPos - 1);
        item predSecond = indexAt(secondPos - 1);
        item first = indexAt(firstPos);
        item second = indexAt(secondPos);
        item postFirst = indexAt(firstPos + 1);
        item postSecond = indexAt(secondPos + 1);
        if ((firstPos >= 0) && (firstPos <= counter - 1) && (secondPos >= 0) && (secondPos <= counter - 1) && (firstPos != secondPos)) {
            if (predFirst == null) {
                if (secondPos - firstPos == 1) {
                    this.begin = second;
                    second.setNext(first);
                    first.setNext(postSecond);
                } else {
                    this.begin = second;
                    second.setNext(postFirst);
                    predSecond.setNext(first);
                    first.setNext(postSecond);
                }
            } else {
                if (secondPos - firstPos == 1) {
                    predFirst.setNext(second);
                    second.setNext(first);
                    first.setNext(postSecond);
                } else {
                    predFirst.setNext(second);
                    second.setNext(postFirst);
                    predSecond.setNext(first);
                    first.setNext(postSecond);
                }
            }
        }
    }



    public item indexAt(int index) {

        if ((index <= this.counter - 1 ) && (index >=0)) {
            item iter = this.begin;
            for (int i=0; i <index; ++i)
                iter = iter.getNext();
            return iter;
        }
        return null;

    }


    public void sort() {
        int min = 2147483647;
        int minPos = 0;
        item iter;
        for (int i = 0; i < this.counter; ++i) {
            iter = indexAt(i);
            for (int j = i; j < this.counter; ++j) {
                if(iter != null ) {
                    int get = iter.getValue();
                    if (get <= min) {
                        minPos = j;
                        min = get;
                    }
                    iter = iter.getNext();

                }
            }
            swap(i, minPos);
            min = 2147483647;

        }
    }

}