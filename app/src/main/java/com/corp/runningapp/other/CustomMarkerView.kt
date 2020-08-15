package com.corp.runningapp.other

import android.content.Context
import com.corp.runningapp.db.Run
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight

class CustomMarkerView (
    val runs: List<Run>,
    c: Context,
    layoutId: Int
) : MarkerView(c, layoutId){

    override fun refreshContent(e: Entry?, highlight: Highlight?) {
        super.refreshContent(e, highlight)
        if(e == null) {
            return
        }
        val curRunId = e.x.toInt()
    }
}