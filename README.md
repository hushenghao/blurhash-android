# Blurhash-Android

Kotlin extensions of Blurhash for ImageView, Added support for third-party libraries (Glide Coil Picasso and Fresco).

To find out more about Blurhash, see https://github.com/woltapp/blurhash.

## Usage

```kotlin
// Example hash
private const val BLUR_HASH = "LVPO*{9docS\$}Nn4R.oy\$]\${n\$bI"
// Simulate network failure
private val nullData: String? = null
```

### BlurHashDrawable
```kotlin
imageView.setImageDrawable(BlurHashDrawable(BLUR_HASH))
```

### Glide
```kotlin
Glide.with(ivGlide).load(nullData).blurHash(BLUR_HASH).into(ivGlide)
```

### Coil
```kotlin
ivCoil.load(nullData) {
    blurHash(BLUR_HASH)
}
```

### Picasso
```kotlin
Picasso.get().load(nullData).blurHash(BLUR_HASH).into(ivPicasso)
```

### Fresco
```kotlin
icFresco.hierarchy.blurHash(BLUR_HASH)
icFresco.setImageURI(nullData)
```

## Other
You can also see nice examples and try it out yourself at [blurha.sh](https://blurha.sh/)!