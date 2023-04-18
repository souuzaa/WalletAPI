package corporate.hard.robots.WalletAPI.Service

import corporate.hard.robots.WalletAPI.Model.Wallet
import corporate.hard.robots.WalletAPI.Repository.WalletRepository
import org.springframework.stereotype.Service

@Service
class WalletService(val db: WalletRepository) {
    fun getAll(): List<Wallet> = db.getAll()

    fun getById(id: String): Wallet = db.getById(id)

    fun save(message: Wallet){
        db.save(message)
    }
}