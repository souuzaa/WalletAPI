package corporate.hard.robots.WalletAPI.Model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("WALLET_ITEM")
data class WalletItem (@Id val id: String?, val wallet_id: String, val stock: String)