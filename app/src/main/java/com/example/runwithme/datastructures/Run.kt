package com.example.runwithme.datastructures

import java.util.*

val listOfRuns = mutableListOf<Run>()


class Run(
    val createdBy: User,
    var title: String,
    var description: String = "",
    pace: Int,
    miles: Int,
    var startTime: Date,
    var broadcastCategory: BroadcastCategory
) {
    private val members = mutableMapOf<User, UserRunStatus>()
    private val joinRequests = mutableSetOf<User>()
    private val chatMessages = Stack<ChatMessage>()

    var pace = pace
        private set
    var miles = miles
        private set

    // Invoked when a user Requests to Join a publicly broadcast run.
    private fun requestToJoin(user: User) = joinRequests.add(user)

    // Invoked when a user of a group creates a new chat message.
    private fun addChatMessage(chatMessage: ChatMessage) = chatMessages.push(chatMessage)

}