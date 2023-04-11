package com.dede.blurhash_android

import com.squareup.picasso.RequestCreator


fun RequestCreator.blurHash(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
): RequestCreator {
    val drawable = BlurHashDrawable(blurHash, width, height)
    return placeholder(drawable)
        .error(drawable)
}

fun RequestCreator.placeholder(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
) = placeholder(BlurHashDrawable(blurHash, width, height))


fun RequestCreator.error(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
) = error(BlurHashDrawable(blurHash, width, height))
