package racingcar.view;

import java.util.Scanner;

public class InputView {
    public static Integer inputNumberOfCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputRacingCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public static Integer inputTimes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇 회 인가요?");
        return Integer.parseInt(scanner.nextLine());
    }
}