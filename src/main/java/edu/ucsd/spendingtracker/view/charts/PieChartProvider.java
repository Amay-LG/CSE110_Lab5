package edu.ucsd.spendingtracker.view.charts;

import java.util.Map;

import edu.ucsd.spendingtracker.model.Category;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.chart.*;
import javafx.scene.chart.PieChart.Data;

public class PieChartProvider implements IChartProvider {

    @Override
    public Node createChart(Map<Category, Double> data) {
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList();

        data.forEach((cat,sum) -> {
            pieData.add(new Data(cat.name(), sum));
        });

        PieChart chart = new PieChart(pieData);

        chart.getData().forEach((Data d) -> {
            d.getNode().setStyle("-fx-pie-color:"+Category.valueOf(d.getName()).color + ";");
        });

        chart.setLegendVisible(false);
        return chart;

    }

    @Override
    public String getDisplayName() {
        return "Pie Chart";
    }
    
}
