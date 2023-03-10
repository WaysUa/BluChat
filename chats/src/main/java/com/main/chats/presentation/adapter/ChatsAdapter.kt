package com.main.chats.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.main.chats.R
import com.main.chats.data.entities.Chat
import com.main.chats.databinding.ItemChatBinding

class ChatsAdapter : RecyclerView.Adapter<ChatsAdapter.ChatsViewHolder>() {
    private val chats = mutableListOf<Chat>()

    class ChatsViewHolder(view: View): ViewHolder(view) {
        private val binding by lazy { ItemChatBinding.bind(view) }

        fun bind(chat: Chat) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return ChatsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatsViewHolder, position: Int) {
        holder.bind(chats[position])
    }

    override fun getItemCount() = chats.size
}