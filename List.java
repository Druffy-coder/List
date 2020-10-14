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



    }

}