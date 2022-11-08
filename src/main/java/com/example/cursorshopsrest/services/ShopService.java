package com.example.cursorshopsrest.services;

import com.example.cursorshopsrest.shops.Shop;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ShopService {
    private Map<String, Shop> shopsCollection = new HashMap<>();
    Long id = 1L;

    public Shop createShop(Shop shop) {
        String shopId = id.toString();
        shop.setId(shopId);
        shopsCollection.put(shopId, shop);
        id++;
        return shopsCollection.get(shopId);
    }

    public void deleteShop(String id) {
        shopsCollection.remove(id);
    }

    public Map<String, Shop> getAllShops() {

        return shopsCollection;
    }

    public Shop getShop(String id) {
        return shopsCollection.get(id);
    }

    public Shop updateShop(String id, Shop updShop) {
        shopsCollection.put(id, updShop);
        updShop.setId(id);
        return shopsCollection.get(id);

    }

}
