
class IntegerArray
{
    private Integer[] a;
    public IntegerArray(int size)
    {
        a= new Integer[size];
    }
    public void setElement(int index, Integer element)
    {
        if(index>=0 && index<a.length)
            a[index] = element;
        else
            throw new RuntimeException("Array Index out of bound");
    }
    public Integer getElement(int index){
        if(index>=0 && index<a.length)
            return a[index];
        else
            throw new RuntimeException("Array Index out of bound");
    }
    class IntegerArrayIterator
    {
        private int index= -1;
        public boolean hasNext()
        {
            return index<a.length-1;
        }
        public Integer next()
        {
            if(index==a.length)
                throw new RuntimeException("array index out pf bound");
            return a[++index];
        }

    }
}
public class Assign1_24Aug {

    public static void main(String[] args) {
        IntegerArray itarr= new IntegerArray(10);
        for(int i=0;i<10;i++)
        {
            itarr.setElement(i,(i+1)*2);
        }
        IntegerArray.IntegerArrayIterator itr = itarr.new IntegerArrayIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
