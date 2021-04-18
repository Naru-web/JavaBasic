package content;

public abstract class Event implements Comparable{
    public String title;
    
    
    public Event (String title) {
        this.title = title;
    }

    public abstract boolean isRelevant(MyDate theDate);
    public abstract MyDate getRepResentativeDate();
    
    public int compareTo(Object other) {
        MyDate mine = getRepResentativeDate();
        MyDate yours = ((Event)other).getRepResentativeDate();
        return mine.compareTo(yours);
    }
}
