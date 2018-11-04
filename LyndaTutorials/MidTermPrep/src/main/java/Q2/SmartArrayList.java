package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmartArrayList {
    private static final int INIT_CAPACITY = 2;
    private int size=0;  // no of element stored
    private String[] data = new String[INIT_CAPACITY]; // where the element stored

    // recommended answers mostly use size instead of data.length
    public SmartArrayList() {

    }

    public void add(int index, String s) {
        // check 0<= index <= size
        // when index == size, append to the end
        // TODO: IMPLEMENT THE METHOD
        if(index >= 0 && index <= size)
        {
            if(size == data.length)
            {
                // doubling array
                String tmp [] = data;
                data = new String [data.length*2];
                for(int i = 0; i < tmp.length; i++)
                {
                    data[i] = tmp[i];
                }
                // shift stuff
                for(int i = data.length-1 ; i > index; i--)
                {
                    data[i] = data[i-1];
                }
                data[index] = s;
                size++;
            }

            else{
                // shift stuff right
                for(int i = data.length-1 ; i > index; i--)
                {
                    data[i] = data[i-1];
                }
                // change data at index
                data[index] = s;
                size++;
            }
        }
    }

    public void add(String s) { // add to the end
        // TODO: IMPLEMENT THE METHOD
        if(data[data.length-1] == null)
        {
//            data[size] = s;
//            size++;
            add(size, s);
        }

    }

    public String get(int index) {
        // TODO: IMPLEMENT THE METHOD
        if(index <= data.length-1 && index >= 0)
        {
            return data[index];
        }
        else
        {
            return null;
        }
    }

    public void set(int index, String s){
        // TODO: IMPLEMENT THE METHOD
        if(index <= size-1 && index >= 0)
        {
            data[index] = s;
        }
    }

    public void remove(int index) {
        // TODO: IMPLEMENT THE METHOD

        for(int i = 0; i < size-1; i++)
        {
            data[index+i] = data[index+i+1];
        }
        size-=1; // minus 2 from resulting print out (not sure why it works yet)
    }

    @Override
    public String toString(){
        // TODO: IMPLEMENT THE METHOD
        String [] output = Arrays.copyOfRange(data, 0 ,size);

        return Arrays.toString(output);

    }


}
