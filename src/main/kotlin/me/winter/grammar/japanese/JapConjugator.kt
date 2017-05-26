package me.winter.grammar.japanese

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
object JapConjugator {
    fun conjugateDesu(negative: Boolean, tense: Tense, politeness: PolitenessLevel) : String {
        if(politeness == PolitenessLevel.DIRECT)
        {
            when(tense)
            {
                Tense.PRESENT -> return if(!negative) "だ" else "じゃない"
                Tense.PAST -> return if(!negative) "だった" else "じゃなかった"
            }
        }

        when(tense)
        {
            Tense.PRESENT -> return if(!negative) "です" else "ではありません"
            Tense.PAST -> return if(!negative) "でした" else "ではありませんでした"
        }

        //throw UnsupportedOperationException("Operation not fully supported for tense " + tense.name + " negative: " + negative)
    }
}