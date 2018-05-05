package com.iambedant.text

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import android.widget.TextView
import android.util.TypedValue


/**
 * Created by @iamBedant on 05/01/18.
 */
class OutlineTextView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    /**
     * Constant default values for Outline TextView
     */
    companion object {
        private const val DEFAULT_STROKE_WIDTH = 0F
    }

    private var isDrawing: Boolean = false

    private var strokeColor: Int = currentTextColor
    private var strokeWidth: Float = DEFAULT_STROKE_WIDTH

    init {
        attrs?.let {
            context.obtainStyledAttributes(it, R.styleable.outlineAttrs).apply {
                strokeColor = getColor(R.styleable.outlineAttrs_outlineColor, currentTextColor)
                strokeWidth = getFloat(R.styleable.outlineAttrs_outlineWidth, DEFAULT_STROKE_WIDTH)
                recycle()
            }
        }
        setStrokeWidth(strokeWidth)
    }

    fun setStrokeColor(color: Int) {
        strokeColor = color
    }

    /**
     *  give value in sp
     */
    fun setStrokeWidth(width: Float) {
        strokeWidth = width.toPx(context)
    }

    fun setStrokeWidth(unit: Int, width: Float) {
        strokeWidth = TypedValue.applyDimension(
                unit, width, context.resources.displayMetrics)
    }

    override fun invalidate() {
        if (isDrawing) return
        super.invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        if (strokeWidth > 0) {
            isDrawing = true
            val p = paint
            p.style = Paint.Style.FILL

            super.onDraw(canvas)

            val currentTextColor = currentTextColor
            p.style = Paint.Style.STROKE
            p.strokeWidth = strokeWidth
            setTextColor(strokeColor)
            super.onDraw(canvas)
            setTextColor(currentTextColor)
            isDrawing = false
        } else {
            super.onDraw(canvas)
        }
    }

}

