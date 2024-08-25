public class Array {
    private  int[] items;
    private  int count;

//    constructor
    public Array(int length) {
        items = new int[length];
    }

//    print method
    public void print() {
        for(int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

//    insert method
    public void insert(int num) {
        items[count++] = num;

        if(items.length == count) {
//            create a new array (twice the size)
            int[] newItems = new int[count * 2];

//            copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

//            set items to this new array
            items = newItems;
        }
    }

//    remove method
    public void removeAt(int index) {
//        validate the index
        if(index < 0 || index > count)
            throw new IllegalArgumentException();

//        shift the items to the left to fill the hole
        for (int i = index; i < count; i++)
            items[i] = items[i+1];
        count--;
    }

}
