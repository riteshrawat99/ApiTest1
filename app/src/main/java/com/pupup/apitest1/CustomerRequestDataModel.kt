package com.pupup.apitest1

data class CustomerRequestDataModel(
    val contact: String,
    val email: String,
    val fail_existing: String,
    val gstin: String,
    val name: String,
    val notes: NotesX
)