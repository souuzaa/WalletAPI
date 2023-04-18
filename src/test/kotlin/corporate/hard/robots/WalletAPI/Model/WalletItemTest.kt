package corporate.hard.robots.WalletAPI.Model

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WalletItemTest{

    @Test
    fun `Test Wallet constructor`() {
        val wallet_item = WalletItem(id = "123", wallet_id = "123", stock = "WIN")

        assertNotNull(wallet_item)
        assertEquals("123", wallet_item.id)
        assertEquals("123", wallet_item.wallet_id)
        assertEquals("WIN", wallet_item.stock)
    }

    @Test
    fun `Test Wallet Item equals`() {
        val wallet_item1 = WalletItem(id = "123", wallet_id = "123", stock = "WIN")
        val wallet_item2 = WalletItem(id = "123", wallet_id = "123", stock = "WIN")

        assertEquals(wallet_item1, wallet_item2)
    }

    @Test
    fun `Test Wallet Item hashCode`() {
        val wallet_item1 = WalletItem(id = "123", wallet_id = "123", stock = "WIN")
        val wallet_item2 = WalletItem(id = "123", wallet_id = "123", stock = "WIN")

        assertEquals(wallet_item1.hashCode(), wallet_item2.hashCode())
    }

    @Test
    fun `Test Wallet Item toString`() {
        val wallet_item = WalletItem(id = "123", wallet_id = "123", stock = "WIN")

        assertEquals("WalletItem(id=123, wallet_id=123, stock=WIN)", wallet_item.toString())
    }

    @Test
    fun testId() {
        val wallet_item = WalletItem(id = "123", wallet_id = "123", stock = "WIN")
        assertEquals("123", wallet_item.id)
    }

    @Test
    fun testWalletId() {
        val wallet_item = WalletItem(id = "123", wallet_id = "123", stock = "WIN")
        assertEquals("123", wallet_item.wallet_id)
    }

    @Test
    fun testStock() {
        val wallet_item = WalletItem(id = "123", wallet_id = "123", stock = "WIN")
        assertEquals("WIN", wallet_item.stock)
    }
}