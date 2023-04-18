package corporate.hard.robots.WalletAPI.Controller

import corporate.hard.robots.WalletAPI.Model.Wallet
import corporate.hard.robots.WalletAPI.Service.WalletService
import org.springframework.web.bind.annotation.*

@RestController
class WalletController(val service: WalletService) {

    @GetMapping("/")
    fun index(): List<Wallet> = service.getAll();

    @GetMapping("/wallet/{id}")
    fun getById(@PathVariable id: String) = service.getById(id);

    @PostMapping("/")
    fun post(@RequestBody message: Wallet){
        service.save(message)
    }
}