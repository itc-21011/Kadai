package jp.ac.it_college.std.s21011.kadai.poke

data class PokemonJson (
    val pokemon: List<Pokemon>
)

data class Pokemon(
    val id: Int,
    val name: String
)