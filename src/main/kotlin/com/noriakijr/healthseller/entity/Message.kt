package com.noriakijr.healthseller.entity

import javax.persistence.*

@Entity
data class Message(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
                   val title: String,
                   val description: String)