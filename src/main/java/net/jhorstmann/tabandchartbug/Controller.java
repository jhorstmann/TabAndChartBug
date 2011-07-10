package net.jhorstmann.tabandchartbug;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean
@RequestScoped
public class Controller implements Serializable {

    private CartesianChartModel chartModel1;
    private CartesianChartModel chartModel2;

    public Controller() {
        {
            chartModel1 = new CartesianChartModel();

            ChartSeries series = new ChartSeries("Test");
            series.set(1, 1);
            series.set(2, 2);
            series.set(3, 4);
            series.set(4, 2);
            chartModel1.addSeries(series);
        }
        {
            chartModel2 = new CartesianChartModel();

            ChartSeries series = new ChartSeries("Test 2");
            series.set(1, 2);
            series.set(2, 5);
            series.set(3, 1);
            series.set(4, 3);
            chartModel2.addSeries(series);
        }
    }

    public CartesianChartModel getChartModel1() {
        return chartModel1;
    }

    public CartesianChartModel getChartModel2() {
        return chartModel2;
    }
}
