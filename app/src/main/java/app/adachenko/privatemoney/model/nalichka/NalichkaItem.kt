package app.adachenko.privatemoney.model.nalichka

data class NalichkaItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)