package com.example.uklkasircafe

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Meja (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_meja") var id_meja: Int?,
    @ColumnInfo(name = "nomor_meja") var nomor_meja: String
)