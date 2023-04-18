package corporate.hard.robots.WalletAPI.Service

import corporate.hard.robots.WalletAPI.Model.WalletItem
import corporate.hard.robots.WalletAPI.Repository.WalletItemRepository
import org.springframework.stereotype.Service

@Service
class WalletItemService(val db: WalletItemRepository) {
    fun getAll(): List<WalletItem> = db.getAll()

    fun getById(wallet_id: String): WalletItem = db.getById(wallet_id)

    fun post(message: WalletItem){
        db.save(message)
    }

    fun put(message: WalletItem){
        db.delete(message)
    }
}