package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = 2*n+2;
		int x = y-1;
		int yp = y/2;
		int xp = yp-1;
		
		for(int i = 1;i<=xp;i++) {
			//p1
			for(int j=1;j<=yp;j++) {
				if((i==1 && j==1) || (i==1 && j==y)||(i==x && j==1)||(i==x && j==y)){
					System.out.print("+");
				}else if(i==1 || i==x) {
					System.out.print("-");
				}else if(j==1 || j==y) {
					System.out.print("|");
				}else if(i==(y/2) && j==2) {
					//System.out.print(i+":"+j);
					System.out.print("<");
				}else if(i==y/2 && j==y-1) {
					System.out.print(">");
				}else if(i==(y/2) && ((y/2)%2)==0 && (y/2)!=2) {
					System.out.print("=");
				}else if(i==(y/2) && ((y/2)%2)!=0 && (y/2)==2) {
					System.out.print("-");
				}else {
					System.out.print(" ");
				}
			}
			//p2
			for(int j=yp+1;j<=y;j++) {
				if((i==1 && j==1) || (i==1 && j==y)||(i==x && j==1)||(i==x && j==y)){
					System.out.print("+");
				}else if(i==1 || i==x) {
					System.out.print("-");
				}else if(j==1 || j==y) {
					System.out.print("|");
				}else if(i==(y/2) && j==2) {
					//System.out.print(i+":"+j);
					System.out.print("<");
				}else if(i==y/2 && j==y-1) {
					System.out.print(">");
				}else if(i==(y/2) && ((y/2)%2)==0 && (y/2)!=2) {
					System.out.print("=");
				}else if(i==(y/2) && ((y/2)%2)!=0 && (y/2)==2) {
					System.out.print("-");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
			//p3
			for(int j=1;j<=yp;j++) {
				if((i==1 && j==1) || (i==1 && j==y)||(i==x && j==1)||(i==x && j==y)){
					System.out.print("+");
				}else if(i==1 || i==x) {
					System.out.print("-");
				}else if(j==1 || j==y) {
					System.out.print("|");
				}else if(i==(y/2) && j==2) {
					//System.out.print(i+":"+j);
					System.out.print("<");
				}else if(i==y/2 && j==y-1) {
					System.out.print(">");
				}else if(i==(y/2) && ((y/2)%2)==0 && (y/2)!=2) {
					System.out.print("=");
				}else if(i==(y/2) && ((y/2)%2)!=0 && (y/2)==2) {
					System.out.print("-");
				}else {
					System.out.print(" ");
				}
			}
			//p4
			for(int j=yp+1;j<=y;j++) {
				if((i==1 && j==1) || (i==1 && j==y)||(i==x && j==1)||(i==x && j==y)){
					System.out.print("+");
				}else if(i==1 || i==x) {
					System.out.print("-");
				}else if(j==1 || j==y) {
					System.out.print("|");
				}else if(i==(y/2) && j==2) {
					//System.out.print(i+":"+j);
					System.out.print("<");
				}else if(i==y/2 && j==y-1) {
					System.out.print(">");
				}else if(i==(y/2) && ((y/2)%2)==0 && (y/2)!=2) {
					System.out.print("=");
				}else if(i==(y/2) && ((y/2)%2)!=0 && (y/2)==2) {
					System.out.print("-");
				}else {
					System.out.print(" ");
				}
			}
		}
		
	}

}
