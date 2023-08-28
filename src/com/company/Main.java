package com.company;
import java.util.Scanner;

public class Main {

    public static int onee=0;

    public static int twoo=0;
    //int input;
   // public int l;

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        base b=new base();
        b.b();
        int[] selected =new int[9];
        int[] one=new int[5];
        int[] two=new int[5];
        for(int la=0;la<9;la++){

            System.out.println("type a digit");
            for(int a=0;a<9;a++){
                System.out.print(" "+a+" ");
            }
            System.out.println(":");
            Userpart u=new Userpart();
            if(la%2==0){
            u.one();}
            else{
                u.two();
            }

            int input=sc.nextInt();
            while(input>9){
                System.out.println("number is invalid");
                input=sc.nextInt();
            }
            for(int v=0;v<9;v++){
                while(input==selected[v]){
                    System.out.println("number is already selected");
                    input=sc.nextInt();
                }}
                    selected[la] = input;
            if(la%2==0){
                one[onee]=input;
            onee++;}
            else{
                two[twoo]=input;
                twoo++;
            }

            design d=new design();
            d.d(input,la,selected,one,two);
       Result r=new Result();
        if(r.r(one,two)==4){
           break;
        }
        }
}

}
