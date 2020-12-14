package homework;

import java.util.Scanner;

public class homework {
	public static void main(String agrs[]) {
		int n,a,b;
		System.out.println("nhap n");
		Scanner tam = new Scanner(System.in);
		n = tam.nextInt();
		System.out.printf("tong tu 1 den n la: %d \n", tinhtongtu1denn(n) ); 
		System.out.println("-----------------------");
		a = tam.nextInt();
		System.out.printf("tong cac so chan tu 1 den n la: %d \n", tinhtongchan(a));
		b = tam.nextInt();
		System.out.printf("tich cac so tu 1 den n la: %d ", tinhtongtich(b));
	}

	public static int tinhtongtu1denn(int n) {
		int i, s = 0;
		for (i = 1; i <= n; ++i) {
			s = s + i;
		}
		return (s);
	}
	public static int tinhtongchan(int a) {
		int i, s = 0;
		for (i = 1; i <= a; ++i) {
			if (i%2==0) {
				System.out.print("Các số chẵn là: " +i+ "\n");
				s +=i;
			}
		}
		return (s);
	}
	public static int tinhtongtich(int b) {
		int i, s = 1;
		for (i = 1; i <= b; ++i) {
				s *=i;
			}
		return (s);
	}
}
