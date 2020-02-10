import java.io.*;
import java.util.*;

public class Quartiles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s=new Scanner(System.in);
	System.out.println("Enter length of array");
    int n=s.nextInt();
	System.out.println("Enter elements for array");
    int ar[]=new int[n];
    int i,m,q1,q2,q3;
    for(i=0;i<n;i++){
        ar[i]=s.nextInt();
    }       
    Arrays.sort(ar);
    int g=n/2;
    if(n%2!=0){
        q2=ar[g];
        int r= (g)/2;
        if((g)%2!=0){
            q1=ar[r];
            q3=ar[r+g+1];

        }else{
            q1=(ar[r]+ar[r-1])/2;
            q3=(ar[r+g]+ar[r+g+1])/2;

        }
    }else{
        q2=(ar[g]+ar[g-1])/2;
        int l=g/2;
        if(g%2!=0){
            q1=ar[l];
            q3=ar[g+l];
        }else{
            q1=(ar[l]+ar[l-1])/2;
            q3=(ar[g+l]+ar[g+l-1])/2;
        }
    }
    System.out.println("Q1 = "q1+"\nQ2 = "+q2+"\n Q3 = "+q3);
    
}
}

