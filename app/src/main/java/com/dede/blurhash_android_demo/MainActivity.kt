package com.dede.blurhash_android_demo

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.bumptech.glide.Glide
import com.dede.blurhash_android.BlurHashDrawable
import com.dede.blurhash_android.blurHash
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    companion object {
        private const val BLUR_HASH = "LVPO*{9docS\$}Nn4R.oy\$]\${n\$bI"

        private val NULL_DATA: String? = null
    }

    private lateinit var imageView: ImageView
    private lateinit var ivGlide: ImageView
    private lateinit var ivCoil: ImageView
    private lateinit var ivPicasso: ImageView
    private lateinit var icFresco: SimpleDraweeView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)

        setContentView(R.layout.activity_main)
        imageView = findViewById<ImageView>(R.id.iv_blur_hash)
        ivGlide = findViewById<ImageView>(R.id.iv_glide)
        ivCoil = findViewById<ImageView>(R.id.iv_coil)
        ivPicasso = findViewById<ImageView>(R.id.iv_picasso)
        icFresco = findViewById<SimpleDraweeView>(R.id.iv_fresco)

        imageView.setImageDrawable(BlurHashDrawable(BLUR_HASH))
        glide()
        coil()
        picasso()
        fresco()
    }

    private fun glide() {
        Glide.with(this)
            .load(NULL_DATA)
            .blurHash(BLUR_HASH)
            .into(ivGlide)
    }

    private fun coil() {
        ivCoil.load(NULL_DATA) {
            blurHash(BLUR_HASH)
        }
    }

    private fun fresco() {
        icFresco.hierarchy.apply {
            blurHash(BLUR_HASH)
        }
        icFresco.setImageURI(NULL_DATA)
    }

    private fun picasso() {
        Picasso.get()
            .load(NULL_DATA)
            .blurHash(BLUR_HASH)
            .into(ivPicasso)
    }
}