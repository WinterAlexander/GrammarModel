package me.winter.grammar.japanese

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
object JapConjugator {
    fun conjugateDesu(positive: Boolean, tense: Tense, politeness: PolitenessLevel) : String {
        if(politeness == PolitenessLevel.DIRECT)
        {
            when(tense)
            {
                Tense.PRESENT -> return if(positive) "だ" else "じゃない"
                Tense.PAST -> return if(positive) "だった" else "じゃなかった"
            }
        }

        when(tense)
        {
            Tense.PRESENT -> return if(positive) "です" else "ではありません"
            Tense.PAST -> return if(positive) "でした" else "ではありませんでした"
        }

        //throw UnsupportedOperationException("Operation not fully supported for tense " + tense.name + " positive: " + positive)
    }
}