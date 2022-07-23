package com.tohidul.shapes;

public class Shapes {
    public void printFilledSquare(){
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
    }
    public void printUnFilledSquare(){
        System.out.println("* * * * * *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("* * * * * *");
    }

    public void printTriangle(){
        System.out.println("* * * * *");
        System.out.println(" *     *");
        System.out.println("  *   *");
        System.out.println("   * *");
        System.out.println("    * ");
    }

    public void printTriangleOne(){
        for(int i = 1; i<=9; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleTwo(){
        for(int i = 1; i<=9; i++){
            for(int j = 9; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleThree(){
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printTriangleFour(){
        for(int i = 9; i>=1; i--){
            for(int j = 1; j<=9; j++){
                if(j<=i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }

    public void printSquare(){
        for(int i=1; i<=9; i++){
            for(int j=1;j<=9;j++){
                if(i==1 || j==1 || i==9 || j==9){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void printZInverse(){
        for(int i=1; i<=9;i++){
            for(int j=1; j<=9; j++){
                if(i==j || i==1 || i==9){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printZ(){
        for(int i= 1; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(i==1 || i==9 || i+j==9){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void printX(){
        for(int i= 1; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(i==1 || i==9 || i+j==9 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void printSquareX(){
        for(int i= 1; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(i==1 || i==9 || i+j==9 || i==j || j==1 || j==9){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printTimeTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        }
    }
}
