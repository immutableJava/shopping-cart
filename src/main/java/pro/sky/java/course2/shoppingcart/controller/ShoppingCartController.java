package pro.sky.java.course2.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.shoppingcart.service.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public void addId(@RequestParam List<Integer> ids) {
        shoppingCartService.addGoods(ids);
    }

    @GetMapping("/get")
    public List<Integer> getGoods() {
        return shoppingCartService.getGoods();

    }
}
