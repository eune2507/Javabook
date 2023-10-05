package java4.p64;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("게임을 시작하려면 Y 를 입력하세요.");
		for (;;) {
			String str = sc.next();
			if (str.equals("Y")|str.equals("y")) {
				System.out.println("\nGame Start!");
				break;
			} else {
			}
		}

		int quiz[] = new int[3];
		Random random = new Random();

		for (int i = 0; i < 3; i++) {
			quiz[i] = random.nextInt(9) + 1;
			for (int j = 0; j < i; j++) {
				if (quiz[i] == quiz[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
//정답숨김처리 	System.out.print(quiz[i]+" ");
		}
		// Ball 계산을 위해 정렬
		int quizBinary[] = Arrays.copyOf(quiz, quiz.length);
		Arrays.sort(quizBinary);

		System.out.println("\n1 부터 9 까지 숫자 중 중복 없이 3가지를 입력하세요.");
		System.out.println("예시 : 1 2 3 (공백포함)\n");

		int answer[] = new int[3];
		int strike = 0;
		int ball = 0;
		for (;;) {
			System.out.print("입력된 숫자 : ");
			answer[0] = sc.nextInt();
			answer[1] = sc.nextInt();
			answer[2] = sc.nextInt();
			if (answer[0] == answer[1] | answer[0] == answer[2] | answer[1] == answer[2]) {
				System.out.println("중복된 숫자가 있습니다. 다시 입력해주세요.");
				continue;
			}
			for (int i = 0; i < quiz.length; i++) {
				if (quiz[i] == answer[i]) {
					strike++;
//					System.out.println("strike "+strike);
					continue;
				} else if (Arrays.binarySearch(quizBinary, answer[i]) >= 0) {
					ball++;
//					System.out.println("ball "+ball);
					continue;
				} else {
//					System.out.println("fail ");
				}
			}
			System.out.println("SCORE : Strike " + strike + " | " + "Ball " + ball + "\n");

			if (strike == 3) {
				sc.close();
				break;
			} else {
				strike = 0;
				ball = 0;
			}

		}

		System.out.println("\nGame Clear");
		System.out.println("ദ്ദി❁´◡`❁)");
		System.out.println("\n정답 : " + quiz[0] + " " + quiz[1] + " " + quiz[2]);

	}

}
