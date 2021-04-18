package shape;

import java.util.Scanner;

public class ShapeApplication {
    
    private int capacity = 10;
    //저장배열
    private Shape[] shapes = new Shape [capacity];
    //저장된 도형의 개수
    private int n = 0;
    private Scanner scanner = new Scanner(System.in);
    
    public void processCommand() {
        
        while(true) {
            System.out.print("$ ");
            String command = scanner.next();
            if(command.equals("add")) {
                hadleAdd();
            }else if(command.equals("show") || command.equals("showdetail")) {
                handleShow(command.equals("showdetail"));
            }else if(command.equals("sort")) {
                bubbleSort(shapes, n);
            }else if(command.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
        }
        scanner.close();
    }
    
    
    
private void bubbleSort(MyComparable [] data, int size) {
    //클래스 맴버에 의존 하지 않고 배열과 배열에 저장된 데이터로 정렬 처리
        for(int i=size-1; i>=0; i-- ) {
            for(int j=0; j<i; j++) {
                if(data[j].compareTo(data[j+1]) > 0) {
                    MyComparable temp = data[j];
                    data[j] =data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
    
        
    



//    private void bubbleSort() {
//        for(int i=n-1; i>=0; i-- ) {
//            for(int j=0; j<i; j++) {
//                if(shapes[j].computeArea() > shapes[j+1].computeArea()) {
//                    Shape temp = shapes[j];
//                    shapes[j] =shapes[j+1];
//                    shapes[j+1] = temp;
//                }
//            }
//        }
//    }



   


    private void handleShow(boolean detailed) {
        for(int i=0; i<n ; i++) {
            System.out.println((i+1)+ ", " + shapes[i].toString());
            if(detailed) {
                System.out.println("    The area is " + shapes[i].computeArea()); 
                System.out.println("    The area is " + shapes[i].computePerimeter()); 
            }
        }
    }



    private void hadleAdd() {
        String type = scanner.next();
        
        switch(type) {
        
        case "R":
            addShape(new Rectangle(scanner.nextInt(),scanner.nextInt()));
            break;
        case "C":
            addShape(new Circle(scanner.nextInt()));
        case "T":
           
            
        }
    }



    private void addShape(Shape shape) {
        
        shapes[n++] = shape;
    }



    public static void main(String[] args) {
        ShapeApplication app = new ShapeApplication();
        app.processCommand();
        
    }
}
