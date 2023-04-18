package corporate.hard.robots.WalletAPI.Model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("WALLET")
data class Wallet (@Id val id: String?, val name: String)