package corporate.hard.robots.WalletAPI.Repository

import corporate.hard.robots.WalletAPI.Model.Wallet
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface WalletRepository : CrudRepository<Wallet, String> {

    @Query("select * from wallet")
    fun getAll(): List<Wallet>

    @Query("select * from wallet where id = :id")
    fun getById(@Param("id") id : String): Wallet
}