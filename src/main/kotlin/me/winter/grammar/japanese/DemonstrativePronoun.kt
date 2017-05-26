package me.winter.grammar.japanese

/**
 * Undocumented :(
 * <p>
 * Created by Alexander Winter on 2017-05-26.
 */
class DemonstrativePronoun(private val dem: Demonstrative, private val type: DemonstrativePronounType) : Pronoun {

    override fun toString(): String {
        return dem.toString() + type.toString()
    }

    override fun containsQuestionWord(): Boolean {
        return dem.question
    }
}