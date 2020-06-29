public class SelectionSortData {
    private int[] numbers;
    public int orderedIndex = -1; // 从0到orderedIndex是有序的
    public int currenIndex = -1;  //当前正在寻找的值
    public int currentMinIndex = -1; //最小值

    public SelectionSortData(int N , int randomBound){
        this.numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = (int)((Math.random())*randomBound+1);
        }
    }

    public int arrayLength(){return numbers.length;}

    public int get(int index){
        if(index<0 || index>numbers.length){
            throw new IndexOutOfBoundsException("Invalid index to acces Sort data");
        }
        return numbers[index];
    }
    public void swap(int i ,int j){
        int midNum ;
        midNum = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = midNum;
    }


}
