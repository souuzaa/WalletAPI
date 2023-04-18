package corporate.hard.robots.WalletAPI.Controller

import corporate.hard.robots.WalletAPI.Model.Wallet
import corporate.hard.robots.WalletAPI.Service.WalletService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

internal class WalletControllerTest{
    private lateinit var service: WalletService
    private lateinit var controller: WalletController

    @BeforeEach
    fun init() {
        service = mock(WalletService::class.java)
        controller = WalletController(service)
    }

    @Test
    fun `index should return list of wallets`() {

        val wallets = listOf(
            Wallet("1", "wallet1"),
            Wallet("1", "wallet2")
        )
        `when`(service.getAll()).thenReturn(wallets)
        val result = controller.index()
        assertEquals(wallets, result)
    }

    @Test
    fun `getById should return wallet by id`() {

        val wallet = Wallet("1", "wallet1")

        `when`(service.getById("1")).thenReturn(wallet)

        val result = controller.getById("1")
        assertEquals(wallet, result)
    }

    @Test
    fun `post should post wallet`() {
        val wallet = Wallet("123", "wallet1")
        `when`(service.getById("123")).thenReturn(wallet)
        controller.post(wallet)
        assertEquals(wallet, service.getById("123"))
    }
}