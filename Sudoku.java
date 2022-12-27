package Sudoku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku extends Thread{

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        int[][] sudoku = new int [9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
               sudoku[i][j] = scan.nextInt();
               System.out.println(i + " " + j);
            }
       }
      
      Thread rows = new Thread() {
        public void run(){
            for(int i = 0; i < 9; i++){
                int sum = 0;
                System.out.print("Thread " + Thread.currentThread().getId()
                        + ", " + "Row " + (i + 1) + ", ");
                for(int j = 0; j < 9; j++){
                    sum = sum + sudoku[i][j];
                }
                if(sum == 45){
                       System.out.println("Valid");
                    }
                else
                    System.out.println("Invalid");
            }
        }
      };
      rows.start();
     
      Thread columns = new Thread() {
        public void run(){
            for(int i = 0; i < 9; i++){
                int sum = 0;
                for(int j = 0; j < 9; j++){
                    sum = sum + sudoku[j][i];
                }
                if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Column " + (i + 1) + ", Valid");
                }
                else
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Column " + (i + 1) + ", Invalid");
            }
            
        }
      };
      columns.start();
      
      Thread subGrid1 = new Thread() {
        public void run(){
            int sum = 0;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    sum = sum + sudoku[i][j];
                }
            }
            if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R123 - C123, Valid");
            }
            else
                System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R123 - C123, Invalid");
        }
      };
      subGrid1.start();
      
      Thread subGrid2 = new Thread() {
        public void run(){
            int sum = 0;
            for(int i = 0; i < 3; i++){
                for(int j = 3; j < 6; j++){
                    sum = sum + sudoku[j][i];
                }
            }
            if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R123 - C456, Valid");
            }
            else
                System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R123 - C456, Invalid");
        }
      };
      subGrid2.start();
      
      Thread subGrid3 = new Thread() {
        public void run(){
            int sum = 0;
            for(int i = 0; i < 3; i++){
                for(int j = 6; j < 9; j++){
                    sum = sum + sudoku[i][j];
                }
            }
            if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R123 - C789, Valid");
            }
            else
                System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R123 - C789, Invalid");
        }
      };
      subGrid3.start();
      
      Thread subGrid4 = new Thread() {
        public void run(){
            int sum = 0;
            for(int i = 3; i < 6; i++){
                for(int j = 0; j < 3; j++){
                    sum = sum + sudoku[i][j];
                }
            }
            if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R456 - C123, Valid");
            }
            else
                System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R456 - C123, Invalid");
        }
      };
      subGrid4.start();
      
      Thread subGrid5 = new Thread() {
        public void run(){
            int sum = 0;
            for(int i = 6; i < 9; i++){
                for(int j = 0; j < 3; j++){
                    sum = sum + sudoku[i][j];
                }
            }
            if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R789 - C123, Valid");
            }
            else
                System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R789 - C123, Invalid");
        }
      };
      subGrid5.start();
      
      Thread subGrid6 = new Thread() {
        public void run(){
            int sum = 0;
            for(int i = 3; i < 6; i++){
                for(int j = 3; j < 6; j++){
                    sum = sum + sudoku[i][j];
                }
            }
            if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R456 - C456, Valid");
            }
            else
                System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R456 - C456, Invalid");
        }
      };
      subGrid6.start();
      
      Thread subGrid7 = new Thread() {
        public void run(){
            int sum = 0;
            for(int i = 3; i < 6; i++){
                for(int j = 6; j < 9; j++){
                    sum = sum + sudoku[i][j];
                }
            }
            if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R456 - C789, Valid");
            }
            else
                System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R456 - C789, Invalid");
        }
      };
      subGrid7.start();
      
      Thread subGrid8 = new Thread() {
        public void run(){
            int sum = 0;
            for(int i = 6; i < 9; i++){
                for(int j = 3; j < 6; j++){
                    sum = sum + sudoku[i][j];
                }
            }
            if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R789 - C456, Valid");
            }
            else
                System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R789 - C456, Invalid");
        }
      };
      subGrid8.start();
      
      Thread subGrid9 = new Thread() {
        public void run(){
            int sum = 0;
            for(int i = 6; i < 9; i++){
                for(int j = 6; j < 9; j++){
                    sum = sum + sudoku[i][j];
                }
            }
            if(sum == 45){
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R789 - C789, Valid");
            }
            else
                System.out.println("Thread " + Thread.currentThread().getId()
                            + ", " + "Subgrid R789 - C789, Invalid");
        }
      };
      subGrid9.start();
    }
}
