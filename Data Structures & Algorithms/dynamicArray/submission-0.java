class DynamicArray {

    private int[] nums;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.nums = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return nums[i];
    }

    public void set(int i, int n) {
        nums[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity) {
            resize();
        }
        nums[size++] = n;
    }

    public int popback() {
        return size > 0 ? nums[--size] : -1;
    }

    public void resize() {
        capacity *= 2;
        int[] newNums = new int[capacity];
        for(int i=0;i<size;i++) {
            newNums[i] = nums[i];
        }
        nums = newNums;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
