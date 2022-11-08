package com.example.cursorshopsrest.rest;

import com.example.cursorshopsrest.services.ShopService;
import com.example.cursorshopsrest.shops.Shop;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ShopController {
    private ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hi";
    }

    @GetMapping("/shops")
    public Map<String, Shop> getShops() {
        return shopService.getAllShops();
    }

    @GetMapping("/shops/{shopId}")
    public Shop getShop(@PathVariable String shopId) {
        System.out.println("getting shop with id " + shopId);
        return shopService.getShop(shopId);
    }

    @PostMapping(value = "/shops", produces = MediaType.APPLICATION_JSON_VALUE)
    public Shop addShops(@RequestBody Shop shop) {
        return shopService.createShop(shop);
    }

    @DeleteMapping("/shops/{shopId}")
    public void deleteShop(@PathVariable String shopId) {
        System.out.println("deleting shop with id " + shopId);
        shopService.deleteShop(shopId);
    }

    @PatchMapping(value = "/shops/{shopId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Shop changeShop(@PathVariable String shopId, @RequestBody Shop shop) {
        System.out.println("updating shop with id " + shopId);
        return shopService.updateShop(shopId, shop);
    }

}
