package com.nhnacademy.mart;

public class Counter {

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)


    public int total(Basket basket) {
        int total = 0;
        for (Food food : basket.getFoods()) {
            total += food.getPrice();

        }
        System.out.println("총 가격은 " +total+"원 입니다.");

        return total;
    }

    public int pay(int money,int total) {
         money -=total;
        System.out.println("고객님 결제 후 잔액 :"+money);
        return money;

    }
}
