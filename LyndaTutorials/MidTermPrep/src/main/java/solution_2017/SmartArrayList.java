/**
 * Created by ngaiman_cheung on 21/9/17.
 */
package solution_2017;

public class SmartArrayList {
    private static final int INIT_CAPACITY = 2;
    private int size=0;
    private String[] data = new String[INIT_CAPACITY];


    public SmartArrayList() {

    }

    public void add(int index, String s) {
        // assume index <= size
        // when index == size, append to the end

        if ((index < 0) || (index > size))
            return;

        // check capacity
        checkCapacity();

        for (int i = size-1; i >= index; i--) {
            data[i+1] = data[i];
        }

        data[index] = s;

        size++;

    }

    public void add(String s) {
        add(size, s);
    }

    public String get(int index) {
        if ((index<0) || (index>=size))
            return null;

        return data[index];

    }

    // set is like override
    public void set(int index, String s){
        if ((index<0) || (index>=size))
            return;
        data[index] = s;
    }

    public void remove(int index) {
        if ((index<0) || (index>=size))
            return;

        for (int j=index; j< size -1; j++) // shift everything after index left
            data[j] = data[j+1];

        data[size-1] = null; // set original last value to null
        size--;

    }

    @Override
    public String toString(){
        String s = "[";
        for (int k =0; k<size-1; k++) {
            s += data[k] +",";
        }
        s+=data[size-1]+"]";
        return s;
    }


    private void checkCapacity() {
        if (size >= data.length) {
            String[] newData = new String[2 * data.length];
            for (int k=0; k< data.length; k++) {
                newData[k] = this.data[k];

            }
            this.data = newData;

        }

    }

}
