package corporate.hard.robots.WalletAPI.Repository

import corporate.hard.robots.WalletAPI.Model.WalletItem
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface WalletItemRepository : CrudRepository<WalletItem, String> {

    @Query("select * from wallet_item")
    fun getAll(): List<WalletItem>

    @Query("select * from wallet_item where wallet_id = :id")
    fun getById(@Param("wallet_id") wallet_id : String): WalletItem
}