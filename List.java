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



    }

}