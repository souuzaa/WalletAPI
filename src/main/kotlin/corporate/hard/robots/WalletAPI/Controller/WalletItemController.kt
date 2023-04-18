package corporate.hard.robots.WalletAPI.Controller

import corporate.hard.robots.WalletAPI.Model.WalletItem
import corporate.hard.robots.WalletAPI.Service.WalletItemService
import org.springframework.web.bind.annotation.*

@RestController
class WalletItemController(val service: WalletItemService) {

    @GetMapping("/item/")
    fun index(): List<WalletItem> = service.getAll();

    @GetMapping("/item/{id}")
    fun getById(@PathVariable wallet_id: String) = service.getById(wallet_id);

    @PostMapping("/item/")
    fun post(@RequestBody message: WalletItem) {
        service.post(message)
    }
}