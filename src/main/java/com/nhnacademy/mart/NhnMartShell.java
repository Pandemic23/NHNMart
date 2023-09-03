package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        Counter counter = new Counter();
        Basket basket = new Basket();
        mart.prepareMart();
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.");
        BuyList buyList = inputBuyListFromShell();


        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong

        Customer YoungWook = new Customer(buyList);


        // 장바구니를 챙긴다.
        YoungWook.bring(mart.provideBasket());

        // 식품을 담는다.
        YoungWook.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        YoungWook.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기


        BuyList buyList = new BuyList();
        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        String a = sc.nextLine();


        buyList.add(a.split(" "));

        return buyList;
    }


}

