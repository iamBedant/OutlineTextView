package com.iambedant.text

import android.content.Context

/**
 * Created by @iamBedant on 05/01/18.
 */
fun Float.toPx(context: Context) = (this * context.resources.displayMetrics.scaledDensity + 0.5F)

