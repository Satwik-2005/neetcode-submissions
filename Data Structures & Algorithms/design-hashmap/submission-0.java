class Pair {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {

    private List<Pair> list;

    public MyHashMap() {
        list = new LinkedList<>();
    }
    
    public void put(int key, int value) {
        for(Pair pair : list) 
            if(pair.key == key)
                pair.value = value;

        list.add(new Pair(key, value));
    }
    
    public int get(int key) {
        for(Pair pair : list)
            if(pair.key == key)
                return pair.value;

        return -1;
    }
    
    public void remove(int key) {
        list.removeIf(pair -> pair.key == key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */