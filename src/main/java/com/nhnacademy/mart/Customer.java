package com.nhnacademy.mart;

public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;
    // 고객 장바구니
    private Basket basket;
    private int Money = 20_000;


    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {

        for (BuyList.Item item : buyList.getItems()) {

            pick(item, foodStand);

        }
    }

    private void pick(BuyList.Item item, FoodStand foodStand) {
        for (int i = 0; i < item.getAmount(); i++) {
            basket.add(foodStand.getFood(item.getName()));
            foodStand.Fooddel(item.getName());
        }
    }


    // TODO payTox 메서드 구현


    public int getMoney() {
        return Money;
    }


    public void payTox(Counter counter) {
        int total = 0;
        total = counter.total(basket);
        if (total > Money) {
            throw new IllegalArgumentException("가진 금액 부족합니다.");
        } else {
            Money = counter.pay(Money, total);

        }
    }

}
