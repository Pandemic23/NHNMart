package com.nhnacademy.mart;

public class NhnMart {
    public Counter getCounter() {
        return counter;
    }

    private final Counter counter = new Counter();

    public FoodStand getFoodStand() {
        return foodStand;
    }

    private final FoodStand foodStand = new FoodStand();

    public void prepareMart() {
        fillFoodStand();
    }

    // 음식 세팅
    private void fillFoodStand() {
//
        for (int i = 0; i < 2; i++) {
            foodStand.add(new Food("양파", 1_000));
        }
        for (int i = 0; i < 5; i++) {
            foodStand.add(new Food("계란", 5_000));
        }
        for (int i = 0; i < 10; i++) {
            foodStand.add(new Food("파", 500));
        }
        for (int i = 0; i < 20; i++) {
            foodStand.add(new Food("사과", 2_000));
        }
        System.out.println("진열완료");

    }

    public Basket provideBasket() {
        return new Basket();
    }


}
