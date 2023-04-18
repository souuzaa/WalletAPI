package corporate.hard.robots.WalletAPI.Model

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WalletTest{

    @Test
    fun `Test Wallet constructor`() {
        val wallet = Wallet(id = "123", name = "My Wallet")

        assertNotNull(wallet)
        assertEquals("123", wallet.id)
        assertEquals("My Wallet", wallet.name)
    }

    @Test
    fun `Test Wallet equals`() {
        val wallet1 = Wallet(id = "123", name = "My Wallet")
        val wallet2 = Wallet(id = "123", name = "My Wallet")

        assertEquals(wallet1, wallet2)
    }

    @Test
    fun `Test Wallet hashCode`() {
        val wallet1 = Wallet(id = "123", name = "My Wallet")
        val wallet2 = Wallet(id = "123", name = "My Wallet")

        assertEquals(wallet1.hashCode(), wallet2.hashCode())
    }

    @Test
    fun `Test Wallet toString`() {
        val wallet = Wallet(id = "123", name = "My Wallet")

        assertEquals("Wallet(id=123, name=My Wallet)", wallet.toString())
    }

    @Test
    fun testId() {
        val wallet = Wallet(id = "123", name = "My Wallet")
        assertEquals("123", wallet.id)
    }

    @Test
    fun testName() {
        val wallet = Wallet(id = "123", name = "My Wallet")
        assertEquals("My Wallet", wallet.name)
    }
}