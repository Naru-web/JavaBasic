package content;

public class Test {

    public int a=1;
    public int b=1;
    public double x;
    
    public String toString() {
        
        return a+ ", " + x;
    }
    public boolean equals(Object other) {
        Test other2 = (Test)other;
        return a == other2.a && x == other2.x;
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        Test test1 = new Test();
        System.out.println(test.toString());
        // = content.Test@182decdb(클래스이름@hashCode)가 출력
        System.out.println(test.equals(test1));
        
        Object [] array = new Object [100];
        int a = 100;
        Integer age = new Integer(100);
        array[0] = age;
        
        int b = age.intValue();
    }
}
