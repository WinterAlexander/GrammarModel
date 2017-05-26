package me.winter.grammar.test.japanese

import me.winter.grammar.japanese.Noun
import me.winter.grammar.japanese.PolitenessLevel
import me.winter.grammar.japanese.SubjectJunctionType
import me.winter.grammar.japanese.SubjectListing
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
class TestSubjectListing
{
    @Test
    fun andTest()
    {
        val listing = SubjectListing(SubjectJunctionType.AND, Noun("犬"), Noun("猫"))

        assertEquals("犬と猫", listing.toString())

        val listing2 = SubjectListing(SubjectJunctionType.AND, Noun("山田"), Noun("田中"), Noun("ボブ"), Noun("フランス"))

        assertEquals("山田と田中とボブとフランス", listing2.toString())
    }

    @Test
    fun orTest()
    {
        val listing = SubjectListing(SubjectJunctionType.OR, Noun("犬"), Noun("猫"))

        assertEquals("犬か猫", listing.toString())

        val listing2 = SubjectListing(SubjectJunctionType.OR, Noun("山田"), Noun("田中"), Noun("ボブ"), Noun("フランス"))

        assertEquals("山田か田中かボブかフランス", listing2.toString())
    }

    @Test
    fun vagueAndNeutralTest()
    {
        val listing = SubjectListing(SubjectJunctionType.VAGUE_AND, PolitenessLevel.NEUTRAL, Noun("犬"), Noun("猫"))

        assertEquals("犬や猫", listing.toString())

        val listing2 = SubjectListing(SubjectJunctionType.VAGUE_AND, PolitenessLevel.NEUTRAL, Noun("山田"), Noun("田中"), Noun("ボブ"), Noun("フランス"))

        assertEquals("山田や田中やボブやフランス", listing2.toString())
    }

    @Test
    fun vagueAndDirectTest()
    {
        val listing = SubjectListing(SubjectJunctionType.VAGUE_AND, PolitenessLevel.DIRECT, Noun("犬"), Noun("猫"))

        assertEquals("犬とか猫", listing.toString())

        val listing2 = SubjectListing(SubjectJunctionType.VAGUE_AND, PolitenessLevel.DIRECT, Noun("山田"), Noun("田中"), Noun("ボブ"), Noun("フランス"))

        assertEquals("山田とか田中とかボブとかフランス", listing2.toString())
    }
}