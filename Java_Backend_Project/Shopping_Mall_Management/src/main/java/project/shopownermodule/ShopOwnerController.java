package project.shopownermodule;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopOwnerController {

    private ShopOwnerService service;

    public ShopOwnerController(ShopOwnerService service) {
        this.service = service;
    }

    @GetMapping("/shopowners")
    public List<ShopOwner> getAllShopOwners() {
        return service.getAllShopOwners();
    }

    @GetMapping("/shopowners/{id}")
    public ShopOwner getShopOwnerById(@PathVariable Integer id) {
        return service.getShopOwnerById(id);
    }

    @PostMapping("/shopowners")
    public ShopOwner createShopOwner(@RequestBody ShopOwner shopOwner) {
        return service.saveShopOwner(shopOwner);
    }

    @PutMapping("/shopowners/{id}")
    public ShopOwner updateShopOwner(
            @PathVariable Integer id,
            @RequestBody ShopOwner shopOwner) {

        shopOwner.setId(id);

        return service.saveShopOwner(shopOwner);
    }

    @DeleteMapping("/shopowners/{id}")
    public void deleteShopOwner(@PathVariable Integer id) {
        service.deleteShopOwner(id);
    }
}