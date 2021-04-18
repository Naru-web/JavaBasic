package content;

public class DurationEvent extends Event {
    public MyDate begin;
    public MyDate end;
    
 
    
    public DurationEvent(String title, MyDate begin, MyDate end) {
        super(title);
        this.begin = begin;
        this.end = end;
    }
 public boolean isRelevant (MyDate date) {
        return begin.compareTo(date) <= 0 && end.compareTo(date) >=0;
    }
    
 public String toString() {
        
        return title +",  " + begin.toString() + "~" + end.toString();
    }
@Override
public MyDate getRepResentativeDate() {
    return begin;
}
}
