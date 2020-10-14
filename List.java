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



    }

}