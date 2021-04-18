package list_generic;
//T라는 클래스가 있다
public class MyArrayList<T> {
    //변수, 저장방식 생각
    private static final int INIT_CAPACITY =10;
    private T [] theData;
    private int size;
    private int capacity = INIT_CAPACITY;
    
    public MyArrayList(){
        //new 로 생성 할땐 이미 데이터 타입이 정해져 있어야함 T로 쓸 수 없음
        theData = (T [])new Object [INIT_CAPACITY];
        size = 0;
    }
    
    public void add(int index, T anEntry) {
        if(index <0 || index > size) {
         throw new ArrayIndexOutOfBoundsException(index);   
        }
        if(size >= capacity) {
            reallocate();
        }
        for(int i=size-1; i>=index; i--) {
            theData[i+1] = theData[i];
            theData[index] = anEntry;
            size++;
        }
        
    }
    
    private void reallocate() {
      
            
        T[] temp = (T[])new Object [capacity *2];
        for(int i=0 ; i<size; i++) {
        temp[i] = theData[i];
        }
        theData = temp;
        capacity *=2;
        
        
    }

    public void add(T enEntry) {
        add(size, enEntry);
    }
    
    public int size() {
        return size;
    }
    public int indexOf(T anEntry) {
        for(int i=0; i <size; i++) {
            if( theData[i].equals(anEntry) )
            return i;
        }
        return -1;
    }
    public T get (int index) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        
        return theData[index];
    }
    public T set(int index, T newValue) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        T oldvalue = theData[index];
        theData[index] = newValue;
        return oldvalue; //지워진 값 리턴
    }
    public T remove (int index) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index); 
        }
        T oldData = theData[index];
        for(int i= index+1; i < size-1; i++) {
            theData[i] = theData[i+1];
        }
        size--;
        return oldData;
        
    }
    
    public static void main(String[] args) {
        MyArrayList<String> test = new MyArrayList<>();
        
        try {
        test.add(1, "Hello");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("-------------------");
        }finally {
            System.out.println(":(");
        }
        
    }
    
}
