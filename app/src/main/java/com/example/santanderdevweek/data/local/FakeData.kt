package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Conta
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Cartao

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Carlos")
        val cartao = Cartao("1234567891230045")
        return Conta(
            "445655-4",
            "6552-4",
            "R$ 7.000,00",
            "R$ 15.000,00",
            cliente,
            cartao
        )

    }
}