package me.winter.grammar.test.japanese

import me.winter.grammar.japanese.*
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
class TestStateOfBeing
{
    @Test
    fun neutralPresentTest()
    {
        val sentence = StateOfBeing(
                            Adjective("元気", AdjectiveType.NA),
                            negative = false,
                            tense = Tense.PRESENT,
                            politeness = PolitenessLevel.NEUTRAL)

        assertEquals("元気です", sentence.toString())
    }

    @Test
    fun neutralPresentNegativeTest()
    {
        val sentence = StateOfBeing(
                Adjective("元気", AdjectiveType.NA),
                negative = true,
                tense = Tense.PRESENT,
                politeness = PolitenessLevel.NEUTRAL)

        assertEquals("元気ではありません", sentence.toString())
    }

    @Test
    fun neutralPastTest()
    {
        val sentence = StateOfBeing(
                Adjective("元気", AdjectiveType.NA),
                negative = false,
                tense = Tense.PAST,
                politeness = PolitenessLevel.NEUTRAL)

        assertEquals("元気でした", sentence.toString())
    }

    @Test
    fun neutralPastNegativeTest()
    {
        val sentence = StateOfBeing(
                Adjective("元気", AdjectiveType.NA),
                negative = true,
                tense = Tense.PAST,
                politeness = PolitenessLevel.NEUTRAL)

        assertEquals("元気ではありませんでした", sentence.toString())
    }

    @Test
    fun directPresentTest()
    {
        val sentence = StateOfBeing(
                Adjective("元気", AdjectiveType.NA),
                negative = false,
                tense = Tense.PRESENT,
                politeness = PolitenessLevel.DIRECT)

        assertEquals("元気だ", sentence.toString())
    }

    @Test
    fun directPresentNegativeTest()
    {
        val sentence = StateOfBeing(
                Adjective("元気", AdjectiveType.NA),
                negative = true,
                tense = Tense.PRESENT,
                politeness = PolitenessLevel.DIRECT)

        assertEquals("元気じゃない", sentence.toString())
    }

    @Test
    fun directPastTest()
    {
        val sentence = StateOfBeing(
                Adjective("元気", AdjectiveType.NA),
                negative = false,
                tense = Tense.PAST,
                politeness = PolitenessLevel.DIRECT)

        assertEquals("元気だった", sentence.toString())
    }

    @Test
    fun directPastNegativeTest()
    {
        val sentence = StateOfBeing(
                Adjective("元気", AdjectiveType.NA),
                negative = true,
                tense = Tense.PAST,
                politeness = PolitenessLevel.DIRECT)

        assertEquals("元気じゃなかった", sentence.toString())
    }
}