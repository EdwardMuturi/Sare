package com.memento_guy.sare.ui.summary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.*
import com.memento_guy.sare.R
import com.memento_guy.sare.data.BudgetSummary
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
        val budgetList : MutableList<BudgetSummary> = ArrayList()
        val weeklytList : MutableList<BudgetSummary> = ArrayList()
        val monthlyList : MutableList<BudgetSummary> = ArrayList()

//        val dailySummary = BudgetSummary(2000, 2000)
//        budgetList.add(dailySummary)
//
//        setUpChart(budgetList, view.chart_daily, R.color.sare_light_blue_800)

//        val weeklySummary = BudgetSummary(14000, 2000)
//        weeklytList.add(weeklySummary)
//
//        setUpChart(budgetList, view.chart_weekly, R.color.sare_light_blue_400)
//
//        val monthlySummary = BudgetSummary(28000, 2000)
//        monthlyList.add(monthlySummary)
//
//        setUpChart(budgetList, view.chart_monthly, R.color.sare_light_blue_400)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun setUpChart(budgetList: MutableList<BudgetSummary>, chart: PieChart, chartColor : Int) {
        val dailyEntries = ArrayList<PieEntry>()
        for (summary in budgetList){
            dailyEntries.add(PieEntry(100f, ""))
        }

        val dataSet = PieDataSet(dailyEntries, "")
        var lineData =  PieData(dataSet)

        chart.apply {
            legend.textColor = ContextCompat.getColor(context, chartColor)

            description.isEnabled = false
            data = lineData
            invalidate()
        }
    }

}
