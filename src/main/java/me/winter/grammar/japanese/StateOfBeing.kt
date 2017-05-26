package me.winter.grammar.japanese

/**
 * Undocumented :(
 * <p>
 * Created by Alexander Winter on 2017-05-26.
 */
class StateOfBeing(private val state: Any, private val positive: Boolean, private val tense: Tense) : Information {

    override fun toString(): String {
        return state.toString() + "です"
    }
}