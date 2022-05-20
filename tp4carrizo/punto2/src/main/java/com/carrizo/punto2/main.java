package com.carrizo.punto2;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class main {

    public static void main(String[] args) {

        //crear conjunto de datos
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Windows", new Double(70));
        datos.setValue("iOS", new Double(15));
        datos.setValue("Linux", new Double(10));
        datos.setValue("Otros", new Double(5));

        //instanciar un grÃ¡fico
        JFreeChart grafico = ChartFactory.createPieChart(// graf de tipo circular
                "Sistemas operativos",// tÃ­tulo																		
                datos, // datos
                true, // incluir referencias
                true, false);

        ChartPanel panel = new ChartPanel(grafico);

        //Creamos la ventana para mostrar el grÃ¡fico
        JFrame ventana = new JFrame("Grafica estadÃ­stico de uso");
        ventana.setVisible(true);
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.add(panel);
    }
}
