package me.winter.grammar.test.japanese

import me.winter.grammar.japanese.*
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Undocumented :(
 *
 * Created by Alexander Winter on 2017-05-26.
 */
class TestTopic
{
	@Test
	fun initiativeTopicTest()
	{
		val topic = TopicDeclaration(Noun("山田さん"), TopicDeclarationType.INITIATIVE)

		assertEquals("山田さんは", topic.toString())
	}

	@Test
	fun additiveTopicTest()
	{
		val topic = TopicDeclaration(Noun("山田さん"), TopicDeclarationType.ADDITIVE)

		assertEquals("山田さんも", topic.toString())
	}
}
