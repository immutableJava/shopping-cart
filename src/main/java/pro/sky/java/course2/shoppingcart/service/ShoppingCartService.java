package pro.sky.java.course2.shoppingcart.service;

import java.util.List;


public interface ShoppingCartService {

    void addGoods(List<Integer> ids);

    List<Integer> getGoods();
}
