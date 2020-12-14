package thu;

import java.util.Scanner;

public class thu {
//	public static void main(String[] args) {
//		int n = 0, s = 0;
//		System.out.println("vui lòng nhập n: ");
//		Scanner tam = new Scanner(System.in);
//		n = tam.nextInt();
//		for (int i = 0; i <= n; i++) {
//			if (i % 2 == 0) {
//				System.out.print("Các số chẵn là: " + i + "\n");
//			} s=s+i;
//		} 
//		System.out.print("Tổng các số chẵn là: " + s);
//		int n, i = 1, s = 0;
//		System.out.println("nhap n");
//		Scanner tam = new Scanner(System.in);
//		n = tam.nextInt();
//		while (i <= n) {
//			if (i % 2 == 0)
//				s = s + i;
//			i = i + 1;
//		}
//		System.out.printf("tong chan la: %d", s);
	public static void main(String agrs[]) {
		Scanner tam = new Scanner(System.in);
		int a[] = new int[100];
		System.out.println("nhap so mang muon nhap:");
		int n = tam.nextInt();
		System.out.println("---------");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d]= ", i);
			a[i] = tam.nextInt();
		}
		System.out.println("---------");
		int tong = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > 0)
				tong = tong + a[i];
		}
		System.out.printf("tong cac phan tu dÆ°Æ¡ng lÃ : %d ", tong);
		System.out.println("");
		System.out.println("----------");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.printf("cac phan tu le la:%d ", a[i]);
				System.out.println(" ");
			}
		}
		System.out.println("----------");
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max)
				max = a[i];
		}
		
	}
}

