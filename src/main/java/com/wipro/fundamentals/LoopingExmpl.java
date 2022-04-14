package com.wipro.fundamentals;
import java.util.Scanner;

public class LoopingExmpl {
    public static void main(String acl[]) {
    	int sum=0,mul=1;
    	// Print 1-10
    	for(int i=1;i<=10;i++)
    		System.out.print(i+" ");
    	// Print sum of 10 numbers
    	for(int i=1;i<=10;i++) {
    		sum=sum+i;
    		mul=mul*i;
    	}
    		System.out.println("Sum is "+sum+" Product is "+mul);
    		
    		System.out.println("======================================");
    		
    		
    	int num=50,evensum=0,oddsum=0;
    	while(num<=100) {
    		if(num%2 == 0) {
    			
    			evensum=evensum+num;
    			num++;
    		}	
    		else {
    			oddsum=oddsum+num;
    			num++;
    		}
    	}
    	System.out.println("Evensum "+evensum+" Odd sum "+oddsum);
    	
    	System.out.println("======================================");
    	
    	
    	System.out.println("Enter the number to find factorial");
    	Scanner sc=new Scanner(System.in);
    	int numb=sc.nextInt();
    	int fac=1,fac1=1;
    	for(int i=numb;i>0;i--) {
    		fac1*=i;
    	}
    	while(numb>0) {
    		fac=fac*numb;
    		numb--;
    	}
    	
    	System.out.println("Factorial is "+fac+" "+fac1);
    	System.out.println("=================================");
    	
    	System.out.println("Enter the number for sum and product of digits ");
    	int n=sc.nextInt();
    	int temp=0,p=1,s=0,rev=0;
    	while(n>0) {
    		temp=n%10;
    		p=p*temp;
    		s=s+temp;
    		rev=rev*10+temp;
    		n/=10;	
    	}
    	System.out.println("Product of digit is "+p+" Sum of digits is "+s+" Reverse of the given number is "+rev);
    	System.out.println("=======================================");
    	
    	System.out.println("Enter the number to check for Armstrong ");
    	int number=sc.nextInt();
    	int temp1=0,temp2=number;
    	
    	int cb=1,amb=0;
    	while(temp2>0) {
    		temp1=temp2%10;
    		cb=temp1*temp1*temp1;
    		amb=cb+amb;
    		temp2/=10;
    	}
    	if(amb==number) {
    		System.out.println(number+" is Armstrong");
    	}
    	else
    		System.out.println(number+" is not Armstrong");
    	System.out.println("===================================");
        
    	
        System.out.println("Enter the number to check for palindrome");
        int pal=sc.nextInt();
        int temp4=pal,temp5=0,reverse=0;
        while(temp4>0) {
        	temp5=temp4%10;
        	reverse=reverse*10+temp5;
        	temp4/=10;
        }
        if(reverse==pal)
        	System.out.println(pal+" is palindrome");
        else
        	System.out.println(pal+ "  is not palindrome");
        
    }
    
    
}
