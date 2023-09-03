package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {


    private final ArrayList<Item> items = new ArrayList<Item>();


    public ArrayList<Item> getItems() {
        return items;
    }

    // TODO add 메서드 생성
    public void add(String[] byitem) {
        String name = null;
        int amount = 0;
        for (int i = 0; i < byitem.length; i++) {
            if (i % 2 == 0) {
                name = byitem[i];
            } else if (i % 2 != 0) {
                amount = Integer.parseInt(byitem[i]);
                items.add(new Item(name, amount));
            }
        }
    }


    public static class Item {
        public String getName() {
            return name;
        }

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        private final String name;

        public int getAmount() {
            return amount;
        }

        private final int amount;


    }
}
