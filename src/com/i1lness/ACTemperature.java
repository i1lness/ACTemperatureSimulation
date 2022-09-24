package com.i1lness;

import java.util.Random;

public class ACTemperature {
  private static final double TEMPERATURE_DEFAULT = 24; // 온도 기본값

  public double temperature; // 현재 온도 선언
  public double targetTemperature;

  public ACTemperature() {
    temperature = TEMPERATURE_DEFAULT; // 현재 온도 Default 설정
    setRandomTemperature();
  }

  public void printTemperature() {
    System.out.println("------------(SYSTEM)-------------");
    System.out.println(":: SYSTEM ::  현재 온도: " + temperature + "°C");
  }

  public void setRandomTemperature() {
    Random r = new Random(); // 랜덤 객체 생성
    temperature += r.nextDouble(10); // 0~10 사이의 온도를 현재온도에 더함
    printTemperature(); // 현재 온도 프린트
  }

  /**
   * @param targetTemperature - 목표 온도 설정
   */
  public void turnOnAC(double targetTemperature) {
    Random r = new Random(); // 랜덤 객체 생성
    this.targetTemperature = targetTemperature; // 목표 온도 설정
    while (targetTemperature < temperature) { // 현재 온도가 24도보다 낮을 동안
      Double i = r.nextDouble() * 3; // 내려갈 온도 랜덤 생성
      temperature -= i; // 온도 낮춤
      printTemperature(); // 현재 온도 프린트
      System.out.println(":: SYSTEM ::  내려간 온도: " + i); // 추가 정도 프린트
    }
    System.out.println("------------(SYSTEM)-------------");
    System.out.println(":: SYSTEM ::  현재 온도가 목표 온도인 " + targetTemperature + "°C 에 도달하였습니다");
    System.out.println(":: SYSTEM ::  가동을 중지합니다");
  }
}
