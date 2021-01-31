package com.thekingsident.happybirthdayhannah

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.thekingsident.happybirthdayhannah.adapter.ItemAdapter
import com.thekingsident.happybirthdayhannah.adapter.LoveDeclarationAdapter
import com.thekingsident.happybirthdayhannah.data.Datasource
import com.thekingsident.happybirthdayhannah.data.LoveDeclarationData

var mMediaPlayer: MediaPlayer? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadLome()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val myLoveMessage = LoveDeclarationData().loadMessage()
        val loveRecycler = findViewById<RecyclerView>(R.id.love_declaration_recycler_view)

        loveRecycler.adapter = LoveDeclarationAdapter(this, myLoveMessage)
        loveRecycler.setHasFixedSize(true)

        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)


        //Media Player controls
        val playMusic = findViewById<FloatingActionButton>(R.id.play_music)
        playMusic.setOnClickListener { playSound() }

        val pauseMusic = findViewById<FloatingActionButton>(R.id.pause_music)
        pauseMusic.setOnClickListener { pauseSound() }


    }

    fun playSound() {
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.take_me_home)
            mMediaPlayer!!.isLooping = true
            mMediaPlayer!!.start()
        } else mMediaPlayer!!.start()
    }

    // 2. Pause playback
    private fun pauseSound() {
        if (mMediaPlayer != null && mMediaPlayer!!.isPlaying) mMediaPlayer!!.pause()
    }

    // 3. {optional} Stops playback
    fun stopSound(view: View) {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.stop()
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    // 4. Closes the MediaPlayer when the app is closed
    override fun onStop() {
        super.onStop()
        if (mMediaPlayer != null) {
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

}

