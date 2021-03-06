/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package economia;

import java.awt.Color;
import java.util.*;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.data.*;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Zayas
 */
public class CompetenciaPerfecta extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalScreen
     */
    public CompetenciaPerfecta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrincipalScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ValorUnoDx = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ValorDosDx = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ValorUnoCT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ValorDosCT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ValorTresCT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTextArea();
        Grafica = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        PrincipalScreen.setBackground(new java.awt.Color(0, 153, 153));
        PrincipalScreen.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Microeconomía: Competencia Perfecta");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("A continuación, ingrese los valores de las funciones a evaluar:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dx =");

        ValorUnoDx.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        ValorUnoDx.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        ValorUnoDx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorUnoDxMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ValorDosDx.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        ValorDosDx.setToolTipText("");
        ValorDosDx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorDosDxMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("qx");

        jLabel6.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ej. 80 - 2.22 qx");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CT =");

        ValorUnoCT.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        ValorUnoCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorUnoCTMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("+");

        ValorDosCT.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        ValorDosCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorDosCTMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("qx");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("+");

        ValorTresCT.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        ValorTresCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorTresCTMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("q^2x");

        jLabel12.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ej. 60 + 20 qx + 2 q^2x");

        Calcular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Resultados.setColumns(20);
        Resultados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Resultados.setRows(5);
        jScrollPane1.setViewportView(Resultados);

        Grafica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Grafica.setText("Mostrar Gráfica");
        Grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficaActionPerformed(evt);
            }
        });

        Regresar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Regresar.setText("Regresar a Menú");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalScreenLayout = new javax.swing.GroupLayout(PrincipalScreen);
        PrincipalScreen.setLayout(PrincipalScreenLayout);
        PrincipalScreenLayout.setHorizontalGroup(
            PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalScreenLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(0, 104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalScreenLayout.createSequentialGroup()
                .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrincipalScreenLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalScreenLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE))
                            .addGroup(PrincipalScreenLayout.createSequentialGroup()
                                .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PrincipalScreenLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel12))
                                    .addGroup(PrincipalScreenLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel6))
                                    .addGroup(PrincipalScreenLayout.createSequentialGroup()
                                        .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Calcular)
                                            .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Regresar)
                                                .addGroup(PrincipalScreenLayout.createSequentialGroup()
                                                    .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrincipalScreenLayout.createSequentialGroup()
                                                            .addComponent(jLabel3)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(ValorUnoDx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(ValorDosDx))
                                                        .addGroup(PrincipalScreenLayout.createSequentialGroup()
                                                            .addComponent(jLabel7)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(ValorUnoCT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jLabel8)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(ValorDosCT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PrincipalScreenLayout.createSequentialGroup()
                                                            .addComponent(jLabel9)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jLabel10))
                                                        .addComponent(jLabel5)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ValorTresCT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PrincipalScreenLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Grafica)))
                .addGap(39, 39, 39))
        );
        PrincipalScreenLayout.setVerticalGroup(
            PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Regresar)
                    .addGroup(PrincipalScreenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalScreenLayout.createSequentialGroup()
                                .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(jLabel4)
                                    .addComponent(ValorDosDx)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(ValorUnoDx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(41, 41, 41)
                                .addGroup(PrincipalScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(ValorDosCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(ValorTresCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(ValorUnoCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(29, 29, 29)
                                .addComponent(Calcular))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Grafica)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("title");
        jLabel2.getAccessibleContext().setAccessibleName("Instrucciones");
        ValorUnoDx.getAccessibleContext().setAccessibleName("Valor1Demanda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorUnoDxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorUnoDxMouseClicked
        if(!(ValorUnoDx.getText().equals("Ej. 80"))){
            ValorUnoDx.setText("");
          }           
    }//GEN-LAST:event_ValorUnoDxMouseClicked

    private void ValorDosDxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorDosDxMouseClicked
       if(!(ValorDosDx.getText().equals("Ej. 2.22"))){
            ValorDosDx.setText("");
          }
    }//GEN-LAST:event_ValorDosDxMouseClicked

    private void ValorUnoCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorUnoCTMouseClicked
        if(!(ValorUnoCT.getText().equals("Ej. 60"))){
            ValorUnoCT.setText("");
          }
    }//GEN-LAST:event_ValorUnoCTMouseClicked

    private void ValorDosCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorDosCTMouseClicked
        if(!(ValorDosCT.getText().equals("Ej. 20"))){
            ValorDosCT.setText("");
          }
    }//GEN-LAST:event_ValorDosCTMouseClicked

    private void ValorTresCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorTresCTMouseClicked
        if(!(ValorTresCT.getText().equals("Ej. 2"))){
            ValorTresCT.setText("");
          }
    }//GEN-LAST:event_ValorTresCTMouseClicked

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        contTextArea();
    }//GEN-LAST:event_CalcularActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        MenuPrincipal menu=new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void GraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficaActionPerformed
        ArrayList<Double> CMg= this.graficaCMg();
        ArrayList<Double> CP= this.graficaCP();
        ;
        XYSeriesCollection ser = new XYSeriesCollection();
        XYSeries Datoscmg = new XYSeries("CMG");
        XYSeries Datoscp = new XYSeries("CP");
        for (int i =0; i < CMg.size(); i++) {
            Datoscmg.add((i+1),CMg.get(i));
        }
        for (int i = 0; i < CP.size(); i++) {
            Datoscp.add((i+1),CP.get(i));
        }
        ser.addSeries(Datoscmg); 
        ser.addSeries(Datoscp);
        
        ValueMarker pointer = new ValueMarker(this.graficaqx().get(0));
        pointer.setPaint(Color.YELLOW);
        ValueMarker pointer1 = new ValueMarker(this.graficapx().get(0));
        pointer1.setPaint(Color.BLACK);
        
        JFreeChart Grafica = ChartFactory.createXYLineChart("Grafica","Qx", "Px", ser,
        PlotOrientation.VERTICAL, true, true, false);
        Grafica.getXYPlot().addDomainMarker(pointer);
        Grafica.getXYPlot().addRangeMarker(pointer1);
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("Grafica");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_GraficaActionPerformed

    public void contTextArea(){
        //Establecemos valor de IMg por igualdad
        String msjone="Dx = Px = IMg = IP\n";
        msjone+="Por lo tanto, IMg = "+ValorUnoDx.getText()+" - "+ValorDosDx.getText()+" qx \n";
        
        //Derivamos CT para obtener CMg
        float valdos=(Float.parseFloat(ValorTresCT.getText())*2);
        msjone+="CMg = "+ValorDosCT.getText()+" + "+valdos+" qx \n";
        
        //Determinamos valor de qx
        float numqx=Float.parseFloat(ValorUnoDx.getText())-Float.parseFloat(ValorDosCT.getText());
        float denqx=valdos+Float.parseFloat(ValorDosDx.getText());
        float qx=numqx/denqx;
        msjone+="\nqx = "+String.format("%.2f",qx)+"\n";
        
        //PendCMg > PendIMg
        msjone+="\nPendCMg = "+valdos+"\n";
        msjone+="PendIMg = - "+ValorDosDx.getText()+"\n";
        msjone+=valdos+" > - "+ValorDosDx.getText()+"\n";
        
        //Determinamos valor de Px
        float px=Float.parseFloat(ValorUnoDx.getText())-(Float.parseFloat(ValorDosDx.getText())*qx);
        msjone+="\nPx = "+String.format("%.2f",px)+"\n";
        
        //Determinamos Beneficio Máximo
        float it=px*qx;
        float pot=(float) Math.pow(qx,2);
        float ct=(Float.parseFloat(ValorUnoCT.getText())+(Float.parseFloat(ValorDosCT.getText())*qx)+(Float.parseFloat(ValorTresCT.getText())*pot));
        float benmax=it-ct;
        msjone+="\nIT = "+String.format("%.2f",it)+"\n";
        msjone+="CT = "+String.format("%.2f",ct)+"\n";
        msjone+="Beneficio Máximo = "+String.format("%.2f",benmax);
        Resultados.setText(msjone);
    }
    
    public ArrayList<Double> graficaCMg(){
        ArrayList<Double> xcmg=new ArrayList();
        for (int i = 1; i < 20; i+=1) {
            Double valdos=(Double.parseDouble(ValorTresCT.getText())*2);
            Double ycmg=Double.parseDouble(ValorDosCT.getText())+(valdos*i);
            xcmg.add(ycmg);
        }
        
        return xcmg;        
    }
    
    public ArrayList<Double> graficaCP(){
        ArrayList<Double> xcp=new ArrayList();
        for (int i = 1; i < 20; i+=1) {
            Double pot=(Double) Math.pow(i,2);
            Double ct=(Double.parseDouble(ValorUnoCT.getText())+(Double.parseDouble(ValorDosCT.getText())*i)+(Double.parseDouble(ValorTresCT.getText())*pot));        
            Double ycp=ct/i;
            xcp.add(ycp);
           }
        return xcp;   
        
    }
    
    public ArrayList<Double> graficaqx(){
        
        ArrayList<Double> xcp=new ArrayList();
        for (int i = 1; i < 20; i+=1) {
            double valdos=(Double.parseDouble(ValorTresCT.getText())*2);
            double numqx=Double.parseDouble(ValorUnoDx.getText())-Double.parseDouble(ValorDosCT.getText());
            double denqx=valdos+Double.parseDouble(ValorDosDx.getText());
            double qx=numqx/denqx;
            xcp.add(qx);
           }
        return xcp;  
    }
    
    public ArrayList<Double> graficapx(){
        
        ArrayList<Double> xcp=new ArrayList();
        for (int i = 1; i < 20; i+=1) {
            double valdos=(Double.parseDouble(ValorTresCT.getText())*2);
            double numqx=Double.parseDouble(ValorUnoDx.getText())-Double.parseDouble(ValorDosCT.getText());
            double denqx=valdos+Double.parseDouble(ValorDosDx.getText());
            double qx=numqx/denqx;
            double px=Double.parseDouble(ValorUnoDx.getText())-(Double.parseDouble(ValorDosDx.getText())*qx);
            xcp.add(px);
           }
        return xcp;  
    }
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompetenciaPerfecta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompetenciaPerfecta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompetenciaPerfecta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompetenciaPerfecta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompetenciaPerfecta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Grafica;
    private javax.swing.JPanel PrincipalScreen;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextArea Resultados;
    private javax.swing.JTextField ValorDosCT;
    private javax.swing.JTextField ValorDosDx;
    private javax.swing.JTextField ValorTresCT;
    private javax.swing.JTextField ValorUnoCT;
    private javax.swing.JTextField ValorUnoDx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
