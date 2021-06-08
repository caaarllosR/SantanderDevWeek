package com.example.santanderdevweek.data

data class Cartao(val numeroCartao: String) {
    val finalCartao = numeroCartao.substring(12,16)
}
