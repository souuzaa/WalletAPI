package corporate.hard.robots.WalletAPI.Service

import corporate.hard.robots.WalletAPI.Model.WalletItem
import corporate.hard.robots.WalletAPI.Repository.WalletItemRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

internal class WalletItemServiceTest{

    val walletItemRepository = mock(WalletItemRepository::class.java)
    val walletItemService = WalletItemService(walletItemRepository)

    @Test
    fun testGetAll() {

        val walletItem = WalletItem("123", "123", stock = "WIN")
        `when`(walletItemRepository.getAll()).thenReturn(listOf(walletItem))
        val expected = walletItemService.getAll()

        assertEquals(listOf(walletItem), expected)
    }

    @Test
    fun testGetById() {
        val walletItem = WalletItem("123", "123", stock = "WIN")
        `when`(walletItemRepository.getById("1")).thenReturn(walletItem)
        val expected = walletItemService.getById("1")

        assertEquals(walletItem, expected)
    }

    @Test
    fun testPost() {
        val walletItem = WalletItem("123", "123", stock = "WIN")
        walletItemService.post(walletItem)
        verify(walletItemRepository).save(walletItem)
    }

    @Test
    fun testPut() {
        val walletItem = WalletItem("123", "123", stock = "WIN")
        walletItemService.put(walletItem)
        verify(walletItemRepository).delete(walletItem)
    }
}