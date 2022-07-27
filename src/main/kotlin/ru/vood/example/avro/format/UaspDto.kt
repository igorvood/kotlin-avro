package ru.vood.example.avro.format

import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class UaspDto(val id: String,
                   val dataString: Map<String, String>,
                   val dataDecimal: Map<String, BigDecimal>,
                   )
