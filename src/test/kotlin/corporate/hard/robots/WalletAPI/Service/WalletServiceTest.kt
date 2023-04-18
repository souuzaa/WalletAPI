package corporate.hard.robots.WalletAPI.Service

import corporate.hard.robots.WalletAPI.Model.Wallet
import corporate.hard.robots.WalletAPI.Repository.WalletRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

internal class WalletServiceTest{

    val walletRepository = mock(WalletRepository::class.java)
    val walletService = WalletService(walletRepository)

    @Test
    fun `getAll should return list of wallets`() {
        val wallets = listOf(
            Wallet("123", "John Doe")
        )
        `when`(walletRepository.getAll()).thenReturn(wallets)
        assertEquals(wallets, walletService.getAll())
    }

    @Test
    fun `getById should return wallet with given id`() {
        val wallet = Wallet("123", "John Doe")
        `when`(walletRepository.getById("123")).thenReturn(wallet)
        assertEquals(wallet, walletService.getById("123"))
    }

    @Test
    fun `post should post wallet`() {
        val wallet = Wallet("123", "John Doe")
        `when`(walletRepository.save(wallet)).thenReturn(wallet)
        assertDoesNotThrow { walletService.save(wallet) }
    }
}