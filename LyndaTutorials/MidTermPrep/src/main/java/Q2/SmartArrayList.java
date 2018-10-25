package Q2;

import java.util.Arrays;

public class SmartArrayList {
    private static final int INIT_CAPACITY = 2;
    private int size=0;  // no of element stored
    private String[] data = new String[INIT_CAPACITY]; // where the element stored


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
            data[size] = s;
            size++;
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
        if(index <= data.length-1 && index >= 0)
        {
            size++;
            data[index] = s;
        }
    }

    public void remove(int index) {
        // TODO: IMPLEMENT THE METHOD
        for(int i = 0; i < data.length-1 -index; i++)
        {
            data[index] = data[index+1];
        }
        size--;
    }

    @Override
    public String toString(){
        // TODO: IMPLEMENT THE METHOD
        return Arrays.toString(data);

    }


}
