/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maestros;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 *
 * @author prof_tes_a
 */
public class ComMaeCom extends javax.swing.JInternalFrame
{
    private ComMaeCom_01 objMaeCom_01;
    /**
     * Creates new form ComMaeCom
     */
    public ComMaeCom()
    {
        initComponents();
        cargarTiposComputadora();
        objMaeCom_01=new ComMaeCom_01(JOptionPane.getFrameForComponent(this), true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrSisOpe = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtMar = new javax.swing.JTextField();
        butMar = new javax.swing.JButton();
        cboTip = new javax.swing.JComboBox<>();
        optSisOpeWin = new javax.swing.JRadioButton();
        optSisOpeLin = new javax.swing.JRadioButton();
        optSisOpeOs2 = new javax.swing.JRadioButton();
        chkAccPal = new javax.swing.JCheckBox();
        chkAccImp = new javax.swing.JCheckBox();
        chkAccWeb = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObs = new javax.swing.JTextArea();
        butGua = new javax.swing.JButton();
        butAbr = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Computadora");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Sistema operativo:");

        jLabel5.setText("Accesorios:");

        jLabel6.setText("Observaciones:");

        butMar.setText("...");
        butMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMarActionPerformed(evt);
            }
        });

        cboTip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bgrSisOpe.add(optSisOpeWin);
        optSisOpeWin.setSelected(true);
        optSisOpeWin.setText("Windows");

        bgrSisOpe.add(optSisOpeLin);
        optSisOpeLin.setText("Linux");

        bgrSisOpe.add(optSisOpeOs2);
        optSisOpeOs2.setText("OS/2");

        chkAccPal.setText("Palancas");

        chkAccImp.setText("Impresora");

        chkAccWeb.setText("Webcam");

        txaObs.setColumns(20);
        txaObs.setRows(5);
        jScrollPane1.setViewportView(txaObs);

        butGua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        butGua.setText("Guardar");
        butGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuaActionPerformed(evt);
            }
        });

        butAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.gif"))); // NOI18N
        butAbr.setText("Abrir");
        butAbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAbrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkAccPal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkAccImp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkAccWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboTip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(optSisOpeWin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(optSisOpeLin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(optSisOpeOs2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(butGua, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(butAbr, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butMar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtMar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(butMar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboTip)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(optSisOpeWin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optSisOpeOs2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optSisOpeLin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAccPal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAccImp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAccWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butAbr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butGua, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        setBounds(0, 0, 500, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void butMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMarActionPerformed
        //ComMaeCom_01 objMaeCom_01=new ComMaeCom_01(JOptionPane.getFrameForComponent(this), true);
        objMaeCom_01.setVisible(true);
        if (objMaeCom_01.isClickAceptar())
            txtMar.setText(objMaeCom_01.getMarcaSeleccionada());
        System.out.println("Fin del evento...");
    }//GEN-LAST:event_butMarActionPerformed

    private void butGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuaActionPerformed
        guardarComputadora();
    }//GEN-LAST:event_butGuaActionPerformed

    private void butAbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAbrActionPerformed
        abrirComputadora();
    }//GEN-LAST:event_butAbrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrSisOpe;
    private javax.swing.JButton butAbr;
    private javax.swing.JButton butGua;
    private javax.swing.JButton butMar;
    private javax.swing.JComboBox<String> cboTip;
    private javax.swing.JCheckBox chkAccImp;
    private javax.swing.JCheckBox chkAccPal;
    private javax.swing.JCheckBox chkAccWeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton optSisOpeLin;
    private javax.swing.JRadioButton optSisOpeOs2;
    private javax.swing.JRadioButton optSisOpeWin;
    private javax.swing.JTextArea txaObs;
    private javax.swing.JTextField txtMar;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables

    private boolean cargarTiposComputadora()
    {
        boolean blnRes=true;
        try
        {
            String strCon=""; //Contenido del archivo.
            java.io.FileReader objFilRea=new java.io.FileReader("ComTipoComputadora.txt");
            java.io.BufferedReader objBufRea=new java.io.BufferedReader(objFilRea);
            String strLin;
            cboTip.removeAllItems();
            while((strLin=objBufRea.readLine())!=null)
            {
                cboTip.addItem(strLin);
            }
            objBufRea.close();
        }
        catch(java.io.FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(this, "Excepción: " + e.toString(), "Sistema TES", JOptionPane.ERROR_MESSAGE);
            blnRes=false;
        }
        catch(java.io.IOException e)
        {
            JOptionPane.showMessageDialog(this, "Excepción: " + e.toString(), "Sistema TES", JOptionPane.ERROR_MESSAGE);
            blnRes=false;
        }
        return blnRes;
    }

    
    private boolean guardarComputadora()
    {
        boolean blnRes=true;
        try
        {
            String strArc;
            if (this.getTitle().equals("Computadora"))
            {
                JFileChooser objFilCho=new JFileChooser();
                objFilCho.setDialogTitle("Guardar");
                objFilCho.setFileSelectionMode(JFileChooser.FILES_ONLY);
                objFilCho.setCurrentDirectory(new File("C:\\"));
                //Filtrado (Opción 1):
                FileNameExtensionFilter objFilNamExt=new FileNameExtensionFilter("Archivos XML", "xml");
                objFilCho.setFileFilter(objFilNamExt);
                //Filtrado (Opción 2):
    //            objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
    //            objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos java", "java"));
    //            objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos php", "php", "php4", "phtml"));
                if (objFilCho.showSaveDialog(this)==JFileChooser.APPROVE_OPTION)
                {
                    strArc=objFilCho.getSelectedFile().getPath();
                    //Si no tiene la extensión "txt" agregarsela.
                    if (!strArc.toLowerCase().endsWith(".xml"))
                        strArc+=".xml";
                    if (guardarArcXML(strArc))
                        this.setTitle(strArc);
        //            System.out.println("Directorio seleccionado: " + strArc);
        //            System.out.println("Texto: " + ((MenArcBloNot)dskGen.getSelectedFrame()).txaPag.getText());
                }
                else
                {
                    System.out.println("El usuario canceló");
                }
            }
            else
                guardarArcXML(this.getTitle());
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private boolean guardarArcXML(String strNomArc)
    {
        boolean blnRes=true;
        try
        {
            DocumentBuilderFactory obDocBuiFac=DocumentBuilderFactory.newInstance();
            DocumentBuilder objDocBui=obDocBuiFac.newDocumentBuilder();
            DOMImplementation objDomImp=objDocBui.getDOMImplementation();
            Document objDoc=objDomImp.createDocument(null, "xml", null);
            objDoc.setXmlVersion("1.0");
            
            //Crear el nodo raíz.
            Element objNodRai=objDoc.createElement("Computadora");
            //Crear los nodos hijos.
            Element objNodNom=objDoc.createElement("Nombre");
            Element objNodMar=objDoc.createElement("Marca");
            Element objNodTip=objDoc.createElement("Tipo");
            Element objNodSisOpe=objDoc.createElement("SistemaOperativo");
            Element objNodAcc=objDoc.createElement("Accesorios");
            Element objNodObs=objDoc.createElement("Observaciones");
            //Asignar el valor a los nodos hijos.
            Text objTexNom=objDoc.createTextNode(txtNom.getText());
            Text objTexMar=objDoc.createTextNode(txtMar.getText());
            Text objTexTip=objDoc.createTextNode(cboTip.getSelectedItem().toString());
            String strSisOpe="";
            if (optSisOpeWin.isSelected())
            {
                strSisOpe="Windows";
            }
            else if (optSisOpeLin.isSelected())
            {
                strSisOpe="Linux";
            }
            else
            {
                strSisOpe="OS/2";
            }
            Text objTexSisOpe=objDoc.createTextNode(strSisOpe);
            String strAcc="";
            if (chkAccPal.isSelected())
            {
                strAcc="Palanca";
            }
            if (chkAccImp.isSelected())
            {
                strAcc+=(strAcc.equals("")?"Impresora":", Impresora");
            }
            if (chkAccWeb.isSelected())
            {
                strAcc+=(strAcc.equals("")?"Webcam":", Webcam");
            }
            Text objTexAcc=objDoc.createTextNode(strAcc);
            Text objTexObs=objDoc.createTextNode(txaObs.getText());
            
            //Agregar los nodos al documento.
            objDoc.getDocumentElement().appendChild(objNodRai);
            objNodRai.appendChild(objNodNom);
            objNodRai.appendChild(objNodMar);
            objNodRai.appendChild(objNodTip);
            objNodRai.appendChild(objNodSisOpe);
            objNodRai.appendChild(objNodAcc);
            objNodRai.appendChild(objNodObs);
            objNodNom.appendChild(objTexNom);
            objNodMar.appendChild(objTexMar);
            objNodTip.appendChild(objTexTip);
            objNodSisOpe.appendChild(objTexSisOpe);
            objNodAcc.appendChild(objTexAcc);
            objNodObs.appendChild(objTexObs);
            Source objSou=new DOMSource(objDoc);
            Result objRes=new StreamResult(new java.io.File(strNomArc));
            Result objResCon=new StreamResult(System.out);
            Transformer objTra=TransformerFactory.newInstance().newTransformer();
            objTra.transform(objSou, objRes);
            objTra.transform(objSou, objResCon);
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }

    private boolean abrirComputadora()
    {
        boolean blnRes=true;
        try
        {
            String strArc;
            JFileChooser objFilCho=new JFileChooser();
            objFilCho.setDialogTitle("Abrir");
            objFilCho.setFileSelectionMode(JFileChooser.FILES_ONLY);
            objFilCho.setCurrentDirectory(new File("C:\\"));
            //Filtrado (Opción 1):
            FileNameExtensionFilter objFilNamExt=new FileNameExtensionFilter("Archivos XML", "xml");
            objFilCho.setFileFilter(objFilNamExt);
            //Filtrado (Opción 2):
    //        objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
    //        objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos java", "java"));
    //        objFilCho.addChoosableFileFilter(new FileNameExtensionFilter("Archivos php", "php", "php4", "phtml"));
            if (objFilCho.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                strArc=objFilCho.getSelectedFile().getPath();
                //Si no tiene la extensión "txt" agregarsela.
    //            if (!strArc.toLowerCase().endsWith(".txt"))
    //                strArc+=".txt";

//                CarMaeVeh objCarMaeVeh=new CarMaeVeh();
//                dskGen.add(objCarMaeVeh, JLayeredPane.DEFAULT_LAYER);
//                objCarMaeVeh.setVisible(true);

                //abrirArcTex(strArc, ((MenArcBloNot)dskGen.getSelectedFrame()).txaPag);
                abrirArcXML(strArc);
                this.setTitle(strArc);
    //            System.out.println("Directorio seleccionado: " + strArc);
    //            System.out.println("Texto: " + ((ifrProPal)dskGen.getSelectedFrame()).txaPag.getText());
            }
            else
            {
                System.out.println("El usuario canceló");
            }
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private boolean abrirArcXML(String strNomArc)
    {
        boolean blnRes=true;
        try
        {
            DocumentBuilderFactory obDocBuiFac=DocumentBuilderFactory.newInstance();
            DocumentBuilder objDocBui=obDocBuiFac.newDocumentBuilder();
            Document objDoc=objDocBui.parse(new File(strNomArc));
            objDoc.getDocumentElement().normalize();
//            System.out.println("Nodo raíz: " + objDoc.getDocumentElement().getNodeName());
            NodeList objNodLis=objDoc.getElementsByTagName("Computadora");
            for (int i=0; i<objNodLis.getLength(); i++)
            {
                Node objNodPel=objNodLis.item(i);
                if (objNodPel.getNodeType()==Node.ELEMENT_NODE)
                {
                    Element objEle=(Element)objNodPel;
                    txtNom.setText(getTagValue("Nombre", objEle));
                    txtMar.setText(getTagValue("Marca", objEle));
                    cboTip.setSelectedItem(getTagValue("Tipo", objEle));
                    switch (getTagValue("SistemaOperativo", objEle))
                    {
                        case "Windows":
                            optSisOpeWin.setSelected(true);
                            break;
                        case "Linux":
                            optSisOpeLin.setSelected(true);
                            break;
                        case "OS/2":
                            optSisOpeOs2.setSelected(true);
                            break;
                    }
                    chkAccPal.setSelected(false);
                    chkAccImp.setSelected(false);
                    chkAccWeb.setSelected(false);
                    if (getTagValue("Accesorios", objEle).indexOf("Palanca")!=-1)
                    {
                        chkAccPal.setSelected(true);
                    }
                    if (getTagValue("Accesorios", objEle).indexOf("Impresora")!=-1)
                    {
                        chkAccImp.setSelected(true);
                    }
                    if (getTagValue("Accesorios", objEle).indexOf("Webcam")!=-1)
                    {
                        chkAccWeb.setSelected(true);
                    }
                    txaObs.setText(getTagValue("Observaciones", objEle));
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
    private static String getTagValue(String sTag, Element eElement)
    {
        NodeList nlList= eElement.getElementsByTagName(sTag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        if (nValue==null)
            return "";
        else
            return nValue.getNodeValue();
    }


}
