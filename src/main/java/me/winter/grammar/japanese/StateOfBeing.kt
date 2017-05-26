package me.winter.grammar.japanese

/**
 * Undocumented :(
 * <p>
 * Created by Alexander Winter on 2017-05-26.
 */
class StateOfBeing(
        private val state: Object,
        private val positive: Boolean,
        private val tense: Tense,
        private val politeness: PolitenessLevel) : Information {

    override fun toString(): String {
        return state.toString() + JapConjugator.conjugateDesu(positive, tense, politeness)
    }

    override fun containsQuestionWord(): Boolean {
        return state.containsQuestionWord()
    }
}