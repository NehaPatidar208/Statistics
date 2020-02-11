import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Standard_Dev {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
System.out.println("Enter length of array");
        int n=s.nextInt();
        int ar[]=new int[n];
        float sum=0;
System.out.println("Enter elements in array");
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
            sum=sum+(float)ar[i];
        }
        float mean=(float)(sum/n);
        double tm=0;
        for(int i=0;i<n;i++){
            tm=tm+((double)(ar[i]-mean)*(double)(ar[i]-mean));
        }
        tm=tm/(double)n;
        tm=Math.sqrt( tm);
        System.out.println(tm);
        
    }
}

