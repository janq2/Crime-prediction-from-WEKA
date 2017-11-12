/*
 * To change this license header, choose License Headers in Project Properties.
 
 * and open the template in the editor.
 */
package crimedetect;

import java.io.PrintStream;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.functions.SMOreg;
import weka.core.Instances;
import weka.core.Instance;
import weka.classifiers.trees.J48;
import weka.core.converters.ConverterUtils.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Janitha
 */

public class Frame1 extends javax.swing.JFrame  {

    class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".csv");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.csv)";
        }
    } 
    /**
     *  new form Frame1
     */
    private static WebDriver driver=null;
    public Frame1() {
        initComponents();
        /*jButton2.addActionListener(new ActionListener() {
   
   public void actionPerformed(ActionEvent evt) {
    Vsp1 vsp = new Vsp1();   
   }
});*/
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jTextField3 = new javax.swing.JTextField();
        Train = new javax.swing.JButton();
        Input = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("Dialog1");
        fileChooser.setFileFilter(new MyCustomFilter());

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Train.setText("Train and test using SMOreg algorithm");
        Train.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainActionPerformed(evt);
            }
        });

        Input.setText("Open Test dataset");
        Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Training dataset:");

        jLabel3.setText("Test dataset");

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel4.setText("             Crime Prediction");
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Train)
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Input))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(219, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Train)
                            .addComponent(Input))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(82, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
      JFileChooser chooser=new JFileChooser();
      chooser.showOpenDialog(null);
      File f=chooser.getSelectedFile();
      String filename=f.getAbsolutePath();
      jTextField1.setText(filename);
      
      
       
    
 
    }//GEN-LAST:event_OpenActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void TrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainActionPerformed
        try {
            // TODO add your handling code here:
            jLabel1.setText("Dataset trained and tested");
            String filename=jTextField1.getText();
            String filename1=jTextField2.getText();
            
            
        
      
            
            DataSource source=new DataSource(filename);
            Instances trainDataset=source.getDataSet();
            
            trainDataset.setClassIndex(trainDataset.numAttributes()-2);
            
            
            SMOreg smo=new SMOreg();
            smo.buildClassifier(trainDataset);
            System.out.println(smo);
            
            DataSource source1=new DataSource(filename1);
            Instances testDataset=source1.getDataSet();
            
            testDataset.setClassIndex(testDataset.numAttributes()-2);
            
            DataSource source2=new DataSource(filename);
            Instances trainDataset1=source.getDataSet();
            
            trainDataset1.setClassIndex(trainDataset1.numAttributes()-1);
            
            
            SMOreg smo1=new SMOreg();
            smo1.buildClassifier(trainDataset1);
            System.out.println(smo1);
            
            DataSource source3=new DataSource(filename1);
            Instances testDataset1=source3.getDataSet();
            
            testDataset1.setClassIndex(testDataset1.numAttributes()-1);
            System.out.println("========================================");
            
            /*System.out.println("Actual class, SMOreg predicted");*/
            PrintStream myconsole=new PrintStream(new File("/Users/janitha/Desktop/crimePredict/smoreg_values.txt"));
            System.setOut(myconsole);
            PrintStream myconsole1=new PrintStream(new File("/Users/janitha/Desktop/crimePredict/smoreg_accuracy.txt"));
            System.setOut(myconsole1);
            myconsole.println("Predicted Values of crime coordinates(From 5th-7th March 2016):");
            myconsole.println("");
            
            
            double total=testDataset.numInstances(),counter=0;
            double actuallat[]=new double[testDataset.numInstances()];
            double actuallong[]=new double[testDataset.numInstances()];
            double predlat[]=new double[testDataset.numInstances()];
            double predlong[]=new double[testDataset.numInstances()];
            for(int i=0; i<testDataset.numInstances(); i++){
                double actualValue=testDataset.instance(i).classValue();
                double actualValue1=testDataset1.instance(i).classValue();
                actuallat[i]=actualValue;
                actuallong[i]=actualValue1;
                Instance newInst=testDataset.instance(i);
                Instance newInst1=testDataset1.instance(i);
                double predSMO=smo.classifyInstance(newInst);
                double predSMO1=smo1.classifyInstance(newInst1);
                predlat[i]=predSMO;
                predlong[i]=predSMO1;
                if((Math.abs(actualValue-predSMO)<0.08)&&(Math.abs(actualValue1-predSMO1)<0.08)){
                    myconsole1.println("Close to predicted value.");
                    counter++;
                }
                else{
                    myconsole1.println("Not close enough to predicted value.");
                }
                myconsole.println("["+predSMO+","+" "+predSMO1+"],");
            }
            System.setProperty("webdriver.chrome.driver","/Users/janitha/Desktop/xyz/chromedriver");
        driver = new ChromeDriver();
        
        /*driver.get("file:///C:/Users/Shreya/Desktop/actualfinal.html");
            int bb=0;
            while(bb<testDataset.numInstances()){
                driver.findElement(By.id("s1")).sendKeys(Double.toString(actuallat[bb]));
                driver.findElement(By.id("s2")).sendKeys(Double.toString(actuallong[bb]));
                driver.findElement(By.id("sub")).click();
                bb++;
                driver.findElement(By.id("s1")).clear();
                driver.findElement(By.id("s2")).clear();
                
            }*/
            driver.get("file:////Users/janitha/Desktop/xyz/crime/mainmap.html");
            /*String redirected_url = "file:///C:/Users/Shreya/Desktop/predictedfinal.html";
            driver.get(redirected_url);*/
            int bb1=0;
            while(bb1<testDataset.numInstances()){
                driver.findElement(By.id("s1")).sendKeys(Double.toString(actuallat[bb1]));
                driver.findElement(By.id("s3")).sendKeys(Double.toString(predlat[bb1]));
                driver.findElement(By.id("s2")).sendKeys(Double.toString(actuallong[bb1]));
                driver.findElement(By.id("s4")).sendKeys(Double.toString(predlong[bb1]));
                driver.findElement(By.id("sub")).click();
                driver.findElement(By.id("sub1")).click();
                bb1++;
                driver.findElement(By.id("s1")).clear();
                driver.findElement(By.id("s3")).clear();
                driver.findElement(By.id("s2")).clear();
                driver.findElement(By.id("s4")).clear();
                
            }
            
            
            myconsole.println("");
            myconsole.println("Actual Values of crime coordinates(From 5th-7th March 2016):");
            myconsole.println("");
            for(int i=0; i<testDataset.numInstances(); i++){
                double actualValue=testDataset.instance(i).classValue();
                double actualValue1=testDataset1.instance(i).classValue();
               /* Instance newInst=testDataset.instance(i);
                Instance newInst1=testDataset1.instance(i);
                double predSMO=smo.classifyInstance(newInst);
                double predSMO1=smo1.classifyInstance(newInst1);*/
                myconsole.println("["+actualValue+","+" "+actualValue1+"],");
            }
            
            
            System.out.println("");
            double accuracy=(counter/total);
            double accuracy1=accuracy*100;
            myconsole1.println("Accuracy of prediction is: "+accuracy1);
            myconsole1.println("Classified instances with high accuracy: "+counter);
            myconsole1.println("Classified instances with low accuracy: "+(total-counter));
            
         
            
            
            
          } catch (Exception ex) {
            Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_TrainActionPerformed

    private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed
        
                    JFileChooser chooser1=new JFileChooser();
      chooser1.showOpenDialog(null);
      File f=chooser1.getSelectedFile();
      String filename1=f.getAbsolutePath();
      jTextField2.setText(filename1);


// TODO add your handling code here:
       /* jButton2.addActionListener(new ActionListener() {
   
   public void actionPerformed(ActionEvent evt) {
      // handle button ActionEvent & display dialog...    
   }
});*/
        
    }//GEN-LAST:event_InputActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JButton Input;
    private javax.swing.JMenuItem Open;
    private javax.swing.JButton Train;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
