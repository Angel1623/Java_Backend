package project.shopownermodule;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ShopOwnerService {

    private ShopOwnerRepository repository;

    public ShopOwnerService(ShopOwnerRepository repository) {
        this.repository = repository;
    }

    public List<ShopOwner> getAllShopOwners() {
        return repository.findAll();
    }

    public ShopOwner getShopOwnerById(Integer id) {
        return repository.findById(id)
                .orElse(null);
    }

    public ShopOwner saveShopOwner(ShopOwner shopOwner) {
        return repository.save(shopOwner);
    }

    public void deleteShopOwner(Integer id) {
        repository.deleteById(id);
    }
}