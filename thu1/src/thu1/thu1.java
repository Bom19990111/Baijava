package thu1;

import java.util.Scanner;

public class thu1 {
	public static void main (String agrs[]) {
		 int n,a,b,c;
		 System.out.println("nhap n");
		 Scanner tam=new Scanner (System.in);
		 n=tam.nextInt();
		 System.out.println("nhap a");
		 a=tam.nextInt();
		 System.out.println("nhap b");
		 b=tam.nextInt();
		 System.out.println("nhap c");
		 c=tam.nextInt();
		 System.out.printf(" tong cac so chan la:%d",tongchan(n));
		 System.out.println("  ");
		 System.out.println("   ");
		 System.out.printf(" tong cac so le la:%d",tongle(n));
		 System.out.println("   ");
		 System.out.println("   ");
		 bangcuuchuong();
		 System.out.println("   ");
		 System.out.println("   ");
		 System.out.printf("tong tu 1 den n la:%d ", tinhtongtu1denn(n));
		 System.out.println("   ");
		 System.out.println("   ");
		 System.out.printf(" tong giai thua:%d",giaithua(n));
		 System.out.println("   ");
		 System.out.println("   ");
		 timuoc (n);
		 System.out.println("   ");
		 System.out.println("   ");
		 sohoanhao(n);
		 System.out.println("   ");
		 System.out.println("   ");
		 System.out.printf("so lon nhat la:%d",somax(a,b,c));
		 System.out.println("   ");
		 System.out.println("   ");
		 tamgiac(a,b,c);
		}
	 //bai1
	 public static int tongchan (int n) {
		 int i=1,S=0;
		 while (i<=n) { if (i%2==0) S=S+i;i++;};
		 	return (S);}
	//bai2
	 public static int tongle (int n) {
		 int i=1,s=0;
		 while (i<=n) {
			 if (i%2!=0) s=s+i; i++;};
		 	return (s); }
	 //bai3
	public static void bangcuuchuong () {
		 int i=2,j=1,s;
		 for (i=2;i<10;i++) {
			 for (j=1;j<=10;j++) {
				 s=i*j;
				 System.out.println(i + "x" + j + "=" + s);}}
		 }
	//bai4
	public static int tinhtongtu1denn (int n) {
		int i,s=0;
		for (i=1;i<=n;i++) s=s+i; 
		 return (s);
		}
	//bai4
	public static int giaithua (int n) {
		int i,s=0,gt=1;
		for (i=1;i<=n;i++) {
			gt=gt*i;
			s=s+gt;}
		return (s);}
	//bai5
	public static void timuoc (int n) {
		int i;
		for (i=1;i<=n;i++) {
			if (n%i==0) System.out.printf("uoc cua n la:%d",i);}
		}
	//bai6
	public static void sohoanhao(int n) {
		for ( int i=1;i<=n;i++) {
			int tong=0;
			for ( int j=1;j<i; j++) 
				if (i%j==0)
					tong=tong+j;
			if (i==tong) 
				System.out.printf("so hoan hao la:%d",i);}
		}
	//bai7
	public static int somax (int a, int b, int c) {
		int max=a;
		if (max<b) 		max=b;
		if (max<c) 		max=c;
		return (max);
	}
	//bai8
	public static void tamgiac (int a, int b, int c) {
			if (a==b && b==c && c==a) System.out.println("Tam giac deu");
			else if (a==b || b==c || c==a) System.out.println("Tam giac can");
			else if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) System.out.println("Tam giac vuong");	
			else System.out.println("day la tam giac thuong");}
	}
			
		






		

		 
		
		
			 
		 
	 


}
