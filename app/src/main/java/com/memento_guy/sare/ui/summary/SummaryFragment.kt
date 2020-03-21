package com.memento_guy.sare.ui.summary

import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.memento_guy.sare.R
import kotlinx.android.synthetic.main.fragment_summary.view.*


/**
 * A simple [Fragment] subclass.
 */
class SummaryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_summary, container, false)

        val chartDrawable = view.chart_weekly.background as GradientDrawable

        chartDrawable.setStroke(15, resources.getColor(R.color.sare_light_blue_400))
        view.chart_weekly.invalidate()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
