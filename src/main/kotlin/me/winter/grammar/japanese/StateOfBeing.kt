package me.winter.grammar.japanese

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
class StateOfBeing(
        val obj: Object,
        val negative: Boolean = false,
        val tense: Tense = Tense.PRESENT,
        val politeness: PolitenessLevel = PolitenessLevel.NEUTRAL) : Information {

    override fun toString(): String {
        return obj.toString() + JapConjugator.conjugateDesu(negative, tense, politeness)
    }

    override fun containsQuestionWord(): Boolean {
        return obj.containsQuestionWord()
    }
}