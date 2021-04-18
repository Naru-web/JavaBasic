package linkedList_Term;

import java.util.Scanner;

public class MyPolynomialApp {
    private Polynomial [] polys = new Polynomial [100];
    int n = 0;
    private Scanner scanner = new Scanner(System.in);
    
    public MyPolynomialApp() {
        
    }
    
    
    private void processCommand() {
        
        while(true) {
            System.out.print("$ ");
            String Command = scanner.next();
            if (Command.equals("create")) {
                handleCreate();
            }else if(Command.equals("add")) {
                handleAdd();
            }else if(Command.equals("calc")) {
                handleCalc();
            }else if(Command.equals("print")) {
                handlePrint();
            }else if(Command.equals("exit")) {
                System.out.println("시스템 종료");
                break;
                
            }
        }
        scanner.close();
        
    }
    
    private void handlePrint() {
        char name = scanner.next().charAt(0);
        int index = find(name);
        if(index < 0) {
            System.out.printf("No serach polynomial.");
            return;
        }
        System.out.println(polys[index].toString());
    }


    private void handleCalc() {
        char name = scanner.next().charAt(0);
        int x = scanner.nextInt();
        
        int index = find(name);
        if(index < 0) {
            System.out.printf("No serach polynomial.");
            return;
        }
        System.out.println(polys[index].calc(x));
    }


    private void handleAdd() {
        char name = scanner.next().charAt(0);
        int coef = scanner.nextInt();
        int expo = scanner.nextInt();
        int index = find(name);
        if(index < 0) {
            System.out.printf("No serach polynomial.");
            return;
        }
        polys[index].addTerm(coef, expo);
    }


    private int find(char name) {
       for(int i = 0; i<n; i++) {
           if(polys[i].name == name) {
               return i;
           }
           
       }
       return -1;
    }


    private void handleCreate() {
        char name = scanner.next().charAt(0);
        Polynomial p = new Polynomial(name);
        
        polys[n++] = p;
    }


    public static void main(String[] args) {
        MyPolynomialApp app = new MyPolynomialApp();
        app.processCommand();
    }

}
