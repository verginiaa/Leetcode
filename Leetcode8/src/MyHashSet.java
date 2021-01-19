import java.util.ArrayList;

public class MyHashSet {
    ArrayList<Integer>arrayList;
    public MyHashSet() {
        arrayList=new ArrayList<>();
    }

    public void add(int key) {
        if(!arrayList.contains(key))
            arrayList.add(key);
    }

    public void remove(int key) {
        if(arrayList.contains(key)){
            arrayList.remove(arrayList.indexOf(key));
        }

    }
    public boolean contains(int key) {
        if(arrayList.contains(key))
            return true;
        return false;
    }
}
