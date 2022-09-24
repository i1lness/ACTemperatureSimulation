package com.i1lness;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    ACTemperature AC = new ACTemperature();

    while (true) {
      System.out.println("------------(SYSTEM)-------------");
      System.out.println(":: SYSTEM ::  에어컨 정지는 (0) 을 입력하세요");
      System.out.println(":: SYSTEM ::  에어컨 가동은 (1) 을 입력하세요");

      int a = s.nextInt();

      if (a == 0) {
        System.out.println("------------(SYSTEM)-------------");
        System.out.println(":: SYSTEM ::  에어컨의 전원을 끕니다");
        break;
      } else if (a == 1) {
        System.out.println("------------(SYSTEM)-------------");
        System.out.println(":: SYSTEM ::  에어컨을 가동합니다");
        System.out.println(":: SYSTEM ::  에어컨의 목표 온도를 설정해주세요");
        int targetTemperature = s.nextInt();
        System.out.println(":: SYSTEM ::  에어컨의 목표 온도가 " + targetTemperature + "°C로 설정이 되었습니다");
        AC.turnOnAC(targetTemperature);
        break;
      } else {
        System.out.println("------------(SYSTEM)-------------");
        System.out.println(":: SYSTEM ::  (0) 또는 (1) 을 입력해주세요");
      }
    }
    s.close();
  }
}
