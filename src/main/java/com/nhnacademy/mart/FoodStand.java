package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {

    public Food getFood(String name) {
        for (Food food : foods) {
            if (name.equals(food.getName())) {
                return food;
            }
        }
        return null;  //예외 처리
    }


    public ArrayList<Food> getFoods() {
        return foods;
    }

    private final ArrayList<Food> foods = new ArrayList<>();

    // TODO add 메서드 구현
    public void add(Food food) {
        foods.add(food);
    }

    // TODO 장바구니에 담은 Food 삭제 구현
    public void Fooddel(String name) {
        int j = 0;
        boolean found = false;
        for (Food food : foods) {
            if (food.getName().equals(name)) {
                foods.remove(j);
                found = true;
                break;
            } else if (foods.isEmpty()) {
                throw new IllegalArgumentException("진열대가 비었습니다.");
            }

            j++;


        }
        if (!found) {
            throw new IllegalArgumentException("없는 상품입니다");
        }




    }


}




