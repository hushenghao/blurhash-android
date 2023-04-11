package com.dede.blurhash_android

import coil.request.ImageRequest
import com.dede.blurhash_android.BlurHashDrawable.Companion.SIZE_UNDEFINED


fun ImageRequest.Builder.blurHash(
    blurHash: String?,
    width: Int = SIZE_UNDEFINED,
    height: Int = SIZE_UNDEFINED,
): ImageRequest.Builder {
    val drawable = BlurHashDrawable(blurHash, width, height)
    placeholder(drawable)
    error(drawable)
    fallback(drawable)
    return this
}

fun ImageRequest.Builder.placeholder(
    blurHash: String?,
    width: Int = SIZE_UNDEFINED,
    height: Int = SIZE_UNDEFINED,
) = placeholder(BlurHashDrawable(blurHash, width, height))

fun ImageRequest.Builder.error(
    blurHash: String?,
    width: Int = SIZE_UNDEFINED,
    height: Int = SIZE_UNDEFINED,
) = error(BlurHashDrawable(blurHash, width, height))


fun ImageRequest.Builder.fallback(
    blurHash: String?,
    width: Int = SIZE_UNDEFINED,
    height: Int = SIZE_UNDEFINED,
) = fallback(BlurHashDrawable(blurHash, width, height))
