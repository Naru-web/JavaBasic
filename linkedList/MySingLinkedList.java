package linkedList;
public class MySingLinkedList<T> {
    
    //첫번째 노드의 주소값
    public Node<T> head;
    public int size = 0;
    
    public MySingLinkedList() {
        head = null;
        size = 0;
    }
    
    //삽입
    public void add(int index, T item) {
        if( index <0 || index > size) {
           throw new ArrayIndexOutOfBoundsException(index);
        }
        if(index ==0) {
            addFirst(item);
        }else {
        Node<T> q = getNode( index -1);
        addAfter(q, item);
        }
    }
    public void addFirst(T item) {
        //T: 타입 파라미터
        Node<T> newNode = new Node<T>(item); //ok 클래스 객체
        newNode.next = head;
        head = newNode;
        size++;
        //만약 배열에 아무것도 없다면? head: null size: 0 
        
        
//          Node<T> [] arr = new Node<T>[100]; //Not ok 배열은 안됨
//          T t = new T(); //Not ok;
//          T[] array = new T [100];
    }
    public void addAfter(Node<T> before, T item) {
        Node <T> temp = new Node<T>(item);
        temp.next = before.next;
        before.next = temp;
        size++;
    }
    
    //삭제
    public  T remove( int index ) {
        if( index <0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
         }
        if(index == 0) {
            return removeFirst();
        }
        
        Node<T> Prev = getNode(index -1);
        return removeAfter(Prev);
    }
    
    public T remove (T item) {
        Node<T> p = head, q = null;
        while( p != null && !p.data.equals(item)) {
            q=p;
            p=p.next;
        }
        
        if ( p == null) {
            return null;
        }
        if (q == null) {
            return removeFirst();
        }else {
            return removeAfter(q);
        }
        
        
    }
    //검색
    public int indexOf( T item) {
        
        Node<T> p = head;
        int index = 0;
        while(p != null) {
            if(p.data.equals(item)) {
                return index;
            }
            p = p.next;
            index++;
        }
        return -1;
      
    }

    public T removeFirst() {
        if(head == null) {
            return null;
        }else {
            T temp = head.data;
            head = head.next;
            
            return temp;
        }
    }
    public T removeAfter(Node<T> before){
        if( before.next == null) {
            return null;
        }
        T temp = before.next.data;
        before.next = before.next.next;
        size--;
        return temp;
        
    }
    public Node<T> getNode(int index){
        if(index <0 || index >= size) {
            return null;
        }
        Node<T> p = head;
        for(int i = 0; i<index; i++) {
            p = p.next;
        }
        return p;
    }
    public T get(int index){
       return getNode(index).data;
    }
    
    public static void main(String[] args) {
        MySingLinkedList<String> list = new MySingLinkedList<>();
        list.addFirst("Monday");
        list.addFirst("Sunday");
        list.add(2, "Saturday");
        list.add(2, "Friday");
        list.remove("Friday");
        list.add(2, "Tuesday");
        int index = list.indexOf("Saturday");
        String str = list.get(2); 
        list.remove(2);
        int pos = list.indexOf("Monday");
        System.out.println(index);
        System.out.println(str);
        System.out.println(pos);
        System.out.println(list.size);
  }



}
