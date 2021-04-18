package content;

public class MyDate {
    //년,월,일 저장 변수
    int year;
    int month;
    int day;
    
    
    
    public MyDate( int y, int m, int d) {
        
        year = y;
        month = m;
        day = d;
                
    }
    public int compareTo(MyDate otherDate) {
        if(year < otherDate.year || year == otherDate.year &&
           month < otherDate.month|| year == otherDate.year && 
           month == otherDate.month && day < otherDate.day) {
            return -1;
        }else if(year > otherDate.year || year == otherDate.year &&
                month > otherDate.month|| year == otherDate.year && 
                month == otherDate.month && day > otherDate.day) {
            return 1;
        }else {
            return 0;
        }
    }
    
    public String toString() {
        
        return year+"/"+month+"/"+day;
    }

}
