package content;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Scheduler {
    // 입력된 이벤트를 저장(이벤트 3개, 각각 다른 객체를 만들어서 저장)
    // 하지만 일관성이 있는 이벤트, 객체지향 프로그래밍 스타일이 아님 , 상속관계를 이용하자

    // 이벤트 타입의 배열을 만듬, Event배열은 events 참조 변수를 통해 이벤트를 상속 받은
    // 객체들을 다룰수 있음(Polymophism), 제네릭 프로그래밍의 일종
//    private int capacity = 10;
    public ArrayList<Event> events = new ArrayList<>();
//    Event[] events = new Event[capacity];
//    public int n = 0;
    private Scanner scanner = new Scanner(System.in);

    // 목록 메서드(processCommand())
    public void processCommand() {

        while (true) {
            System.out.print("$ ");
            String command = scanner.next();
            // 이벤트 추가 , 목록 , 보기, 종료

            if (command.equals("addevent")) {

                String type = scanner.next();

                if (type.equalsIgnoreCase("oneday")) {
                    handleAddOneDayEvent();
                } else if (type.equalsIgnoreCase("duration")) {
                    handleAddDurationEvent();
                } else if (type.equalsIgnoreCase("deadline")) {
                    handleAddDeadlineEvent();
                }

            } else if (command.equals("list")) {
                // 출력
                handleList();

            } else if (command.equals("show")) {
                handleShow();

            } else if (command.equals("exit")) {
                System.out.println("Scheduler Exit.");
                break;
            }else if (command.equals("sort")) {
                
                Collections.sort(events);

            }
        }
        scanner.close();
    }

    private void handleShow() {
        //날짜 입력
        String dateString = scanner.next();
        MyDate theDate = parseDateString(dateString);
        for(int i=0; i<events.size(); i++) {
            //test if events[i] is relevant to the date, then print it;
           if( events.get(i).isRelevant(theDate)) {
               System.out.println(events.get(i).toString());
            }
        }
    }   

    private void handleList() {
//        for (int i = 0; i < events.size(); i++) 
            // dynamic binding
        for( Event ev : events)
            System.out.println("    " + events.toString());
        

    }

    private void handleAddDeadlineEvent() {
        System.out.print("  until:  ");
        String deadlineString = scanner.next();
        System.out.print("  title:  ");
        String title = scanner.next();

        MyDate date = parseDateString(deadlineString);
        DeadlinedEvent deadlineEvent = new DeadlinedEvent(title, date);
        addEvent(deadlineEvent);

    }


    

    private void handleAddDurationEvent() {
       
        System.out.print("  begin:  ");
        String begin = scanner.next();
        System.out.print("  end:  ");
        String end = scanner.next();
        System.out.print("  title:  ");
        String title = scanner.next();
        
        MyDate date = parseDateString(begin);
        MyDate endDate = parseDateString(end);
        DurationEvent durationEvent = new DurationEvent(title, date, endDate);
        addEvent(durationEvent);

    }

  
    private void handleAddOneDayEvent() {
        System.out.print("  when:  ");
        String dateString = scanner.next();
        System.out.print("  title:  ");
        String titleString = scanner.next();

        // 날짜 쪼개서 저장받기
        // Tokenizing - split() -정규 표현식 참고 \\s+ <<- 공백 잡아주는 친구
        // OneDayEvent oneDayEvent = new OneDayEvent(titleString, null)

        MyDate date = parseDateString(dateString);
        OneDayEvent oneDayEvent = new OneDayEvent(titleString, date);
        addEvent(oneDayEvent);

    }

    private MyDate parseDateString(String dateString) {
        String[] tokens = dateString.split("/");
        // tokens[0] = "2017" 이라는 문자열 정수값으로 바꿔줘야함(date는 int타입)

        int year = Integer.parseInt(tokens[0]);
        int month = Integer.parseInt(tokens[1]);
        int day = Integer.parseInt(tokens[2]);

        MyDate d = new MyDate(year, month, day);

        return d;
    }

    public void addEvent(Event ev) {
//        if (n >= capacity) {
//            reallocate();
//        }
        events.add(ev);
    }

//    private void reallocate() {
//        Event[] tmp = new Event[capacity * 2];
//        for (int i = 0; i < n; i++) {
//            tmp[i] = events.get(i);
//        }
//        events = tmp;
//        capacity *= 2;
//        // TODO Auto-generated method stub
//
//    }

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        scheduler.processCommand();
    }
}
