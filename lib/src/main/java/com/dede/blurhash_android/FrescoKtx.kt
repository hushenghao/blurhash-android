package com.dede.blurhash_android

import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder

fun GenericDraweeHierarchyBuilder.blurHash(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
): GenericDraweeHierarchyBuilder {
    val drawable = BlurHashDrawable(blurHash, width, height)
    placeholderImage = drawable
    failureImage = drawable
    return this
}

fun GenericDraweeHierarchyBuilder.placeholder(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
) = setPlaceholderImage(BlurHashDrawable(blurHash, width, height))


fun GenericDraweeHierarchyBuilder.error(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
) = setFailureImage(BlurHashDrawable(blurHash, width, height))

fun GenericDraweeHierarchy.blurHash(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
): GenericDraweeHierarchy {
    val drawable = BlurHashDrawable(blurHash, width, height)
    setPlaceholderImage(drawable)
    setFailureImage(drawable)
    return this
}

fun GenericDraweeHierarchy.placeholder(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
) = setPlaceholderImage(BlurHashDrawable(blurHash, width, height))


fun GenericDraweeHierarchy.error(
    blurHash: String?,
    width: Int = BlurHashDrawable.SIZE_UNDEFINED,
    height: Int = BlurHashDrawable.SIZE_UNDEFINED,
) = setFailureImage(BlurHashDrawable(blurHash, width, height))