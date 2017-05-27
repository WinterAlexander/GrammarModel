package me.winter.grammar.japanese

import me.winter.grammar.Sentence

/**
 * Undocumented :(
 *
 *
 * Created by Alexander Winter on 2017-05-26.
 */
class JapSentence(val topic: TopicDeclaration?,
                  val info: Information) : Sentence
{
    override fun toString(): String
    {
        val sb = StringBuilder()

        if(topic != null)
            sb.append(topic.toString())

        sb.append(info.toString())

        return sb.toString()
    }

    override fun isValid(): Boolean {
        return topic == null || !topic.subject.containsQuestionWord()
    }

    override fun getErrors(): List<String> {
        throw UnsupportedOperationException("not implemented")
    }
}
