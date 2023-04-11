package com.dede.blurhash_android

import com.bumptech.glide.RequestBuilder


fun <TranscodeType> RequestBuilder<TranscodeType>.blurHash(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
): RequestBuilder<TranscodeType> {
    val drawable = BlurHashDrawable(blurHash, width, height)
    return placeholder(drawable)
        .error(drawable)
        .fallback(drawable)
}


fun <TranscodeType> RequestBuilder<TranscodeType>.placeholder(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
) = placeholder(BlurHashDrawable(blurHash, width, height))


fun <TranscodeType> RequestBuilder<TranscodeType>.error(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
) = error(BlurHashDrawable(blurHash, width, height))


fun <TranscodeType> RequestBuilder<TranscodeType>.fallback(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
) = fallback(BlurHashDrawable(blurHash, width, height))
