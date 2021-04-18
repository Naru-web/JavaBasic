package content;


//날짜는 oneday,duration,priod 다 중복, 따로 클래스를 작성

public class OneDayEvent extends Event {
    
    public MyDate date;
    
    public OneDayEvent(String title, MyDate date) {
        super(title);
        this.date  = date;
        
    }
    public boolean isRelevant (MyDate date) {
        return this.date.compareTo(date) == 0;
        
    }
    
    public String toString() {
        //toString 문자열과 오버라이딩 -> 출력문
        return title +",  " + date.toString();
    }
    @Override
    public MyDate getRepResentativeDate() {
        return date;
    }
}
