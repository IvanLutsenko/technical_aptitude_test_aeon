package ru.awac.technical_aptitude_test.Model

data class ResponseModel(
    var token: String? = null,
    var desc: String? = null,
    var amount: String? = null,
    var currency: String? = null,
    var created:  Long? = null
)
