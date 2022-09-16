package practice.book;

import java.util.Scanner;

//공통(common) 모듈. 어디서든 접근하여 사용 가능
public class ScannerUtil {
	//static : 메모리에 미리 업로드
	private static Scanner scanner = new Scanner(System.in);
	
	//접근제한자 : 어디서든 접근하여 사용 가능
	//ScannerUtil.scanner();
	public static Scanner scanner() {
		return scanner;
	}
}
