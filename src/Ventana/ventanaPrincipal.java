/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrew
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    private String imagenX = "/Imagenes/X.gif";
    private String imagenO = "/Imagenes/O.gif";
    private int turno=0;
    private String usuario1, usuario2;
    private boolean vsIA=false;
    private boolean bandera = false;
    
    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
            if(vsIA){
                initComponents();
                setResizable(false);
                setLocationRelativeTo(null);
            }
            else{
                initComponents();
                setUsuario1("Humano");
                setUsuario2("IA");
                setResizable(false);
                setLocationRelativeTo(null);
            }
            ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/TresEnRaya.png"));
            Image imagenE =imagen.getImage();
            setIconImage(imagenE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btIzquierda = new javax.swing.JButton();
        btArriba = new javax.swing.JButton();
        btArribaDerecha = new javax.swing.JButton();
        btCentro = new javax.swing.JButton();
        btDerecha = new javax.swing.JButton();
        btAbajoDerecha = new javax.swing.JButton();
        btAbajo = new javax.swing.JButton();
        btAbajoIzquierda = new javax.swing.JButton();
        btArribaIzquierda = new javax.swing.JButton();
        decirTurno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btIzquierda.setBorderPainted(false);
        btIzquierda.setContentAreaFilled(false);
        btIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 90));

        btArriba.setBorderPainted(false);
        btArriba.setContentAreaFilled(false);
        btArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArribaActionPerformed(evt);
            }
        });
        jPanel1.add(btArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 150));

        btArribaDerecha.setBorderPainted(false);
        btArribaDerecha.setContentAreaFilled(false);
        btArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArribaDerechaActionPerformed(evt);
            }
        });
        jPanel1.add(btArribaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, 130));

        btCentro.setBorderPainted(false);
        btCentro.setContentAreaFilled(false);
        btCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCentroActionPerformed(evt);
            }
        });
        jPanel1.add(btCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, 130));

        btDerecha.setBorderPainted(false);
        btDerecha.setContentAreaFilled(false);
        btDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDerechaActionPerformed(evt);
            }
        });
        jPanel1.add(btDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 140, 120));

        btAbajoDerecha.setBorderPainted(false);
        btAbajoDerecha.setContentAreaFilled(false);
        btAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbajoDerechaActionPerformed(evt);
            }
        });
        jPanel1.add(btAbajoDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 150, 150));

        btAbajo.setBorderPainted(false);
        btAbajo.setContentAreaFilled(false);
        btAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbajoActionPerformed(evt);
            }
        });
        jPanel1.add(btAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 150, 150));

        btAbajoIzquierda.setBorderPainted(false);
        btAbajoIzquierda.setContentAreaFilled(false);
        btAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbajoIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btAbajoIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 150));

        btArribaIzquierda.setBorderPainted(false);
        btArribaIzquierda.setContentAreaFilled(false);
        btArribaIzquierda.setFocusable(false);
        btArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArribaIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btArribaIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 130));

        decirTurno.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        decirTurno.setForeground(new java.awt.Color(255, 153, 255));
        decirTurno.setText("");
        jPanel1.add(decirTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 425, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tabla.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));

        jMenu1.setBackground(new java.awt.Color(255, 204, 204));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 204, 204));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArribaIzquierdaActionPerformed
        iniciarTurnos(turno, btArribaIzquierda, vsIA);
        turno++;
        btArribaIzquierda.setEnabled(false);
        comprobarGanador();
    }//GEN-LAST:event_btArribaIzquierdaActionPerformed

    private void btArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArribaActionPerformed
        iniciarTurnos(turno, btArriba, vsIA);
        turno++;
        btArriba.setEnabled(false);
        comprobarGanador();
    }//GEN-LAST:event_btArribaActionPerformed

    private void btIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIzquierdaActionPerformed
        iniciarTurnos(turno, btIzquierda, vsIA);
        turno++;
        btIzquierda.setEnabled(false);
        comprobarGanador();
    }//GEN-LAST:event_btIzquierdaActionPerformed

    private void btCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCentroActionPerformed
        iniciarTurnos(turno, btCentro, vsIA);
        turno++;
        btCentro.setEnabled(false);
        comprobarGanador();
    }//GEN-LAST:event_btCentroActionPerformed

    private void btAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbajoIzquierdaActionPerformed
        iniciarTurnos(turno, btAbajoIzquierda, vsIA);
        turno++;
        btAbajoIzquierda.setEnabled(false);
        comprobarGanador();
    }//GEN-LAST:event_btAbajoIzquierdaActionPerformed

    private void btAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbajoActionPerformed
        iniciarTurnos(turno, btAbajo, vsIA);
        turno++;
        btAbajo.setEnabled(false);
        comprobarGanador();
    }//GEN-LAST:event_btAbajoActionPerformed

    private void btAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbajoDerechaActionPerformed
        iniciarTurnos(turno, btAbajoDerecha, vsIA);
        turno++;
        btAbajoDerecha.setEnabled(false);
        comprobarGanador();
    }//GEN-LAST:event_btAbajoDerechaActionPerformed

    private void btDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDerechaActionPerformed
        iniciarTurnos(turno, btDerecha, vsIA);
        turno++;
        btDerecha.setEnabled(false);
        comprobarGanador();
    }//GEN-LAST:event_btDerechaActionPerformed

    private void btArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArribaDerechaActionPerformed
        iniciarTurnos(turno, btArribaDerecha, vsIA);
        turno++;
        btArribaDerecha.setEnabled(false);
        comprobarGanador();
    }//GEN-LAST:event_btArribaDerechaActionPerformed
    
    private void comprobarGanador(){
        //Verificar Ganador "X"
        
        if((btCentro.getText().equals(" "))&&(btArribaIzquierda.getText().equals(" "))&&(btAbajoDerecha.getText().equals(" "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario1+"!!");
            jugarSalir();
        }
        else if((btCentro.getText().equals(" "))&&(btArribaDerecha.getText().equals(" "))&&(btAbajoIzquierda.getText().equals(" "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario1+"!!");
            jugarSalir();
        }
        else if((btArribaIzquierda.getText().equals(" "))&&(btArriba.getText().equals(" "))&&(btArribaDerecha.getText().equals(" "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario1+"!!");
            jugarSalir();
        }
        else if(btIzquierda.getText().equals(" ")&&(btCentro.getText().equals(" "))&&(btDerecha.getText().equals(" "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario1+"!!");
            jugarSalir();
        }
        else if((btAbajoIzquierda.getText().equals(" "))&&(btAbajo.getText().equals(" "))&&btAbajoDerecha.getText().equals(" ")){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario1+"!!");
            jugarSalir();
        }
        else if((btArribaIzquierda.getText().equals(" "))&&(btIzquierda.getText().equals(" "))&&(btAbajoIzquierda.getText().equals(" "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario1+"!!");
            jugarSalir();
        }
        else if((btArriba.getText().equals(" "))&&(btCentro.getText().equals(" "))&&(btAbajo.getText().equals(" "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario1+"!!");
            jugarSalir();
        }
        else if((btArribaDerecha.getText().equals(" "))&&(btDerecha.getText().equals(" "))&&(btAbajoDerecha.getText().equals(" "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario1+"!!");
            jugarSalir();
        }
        
        //Verificar Ganador "O"
        
        else if((btCentro.getText().equals("  "))&&(btArribaIzquierda.getText().equals("  "))&&(btAbajoDerecha.getText().equals("  "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario2+"!!");
            jugarSalir();
        }
        else if((btCentro.getText().equals("  "))&&(btArribaDerecha.getText().equals("  "))&&(btAbajoIzquierda.getText().equals("  "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario2+"!!");
            jugarSalir();
        }
        else if((btArribaIzquierda.getText().equals("  "))&&(btArriba.getText().equals("  "))&&(btArribaDerecha.getText().equals("  "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario2+"!!");
            jugarSalir();
        }
        else if(btIzquierda.getText().equals("  ")&&(btCentro.getText().equals("  "))&&(btDerecha.getText().equals("  "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario2+"!!");
            jugarSalir();
        }
        else if((btAbajoIzquierda.getText().equals("  "))&&(btAbajo.getText().equals("  "))&&btAbajoDerecha.getText().equals("  ")){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario2+"!!");
            jugarSalir();
        }
        else if((btArribaIzquierda.getText().equals("  "))&&(btIzquierda.getText().equals("  "))&&(btAbajoIzquierda.getText().equals("  "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario2+"!!");
            jugarSalir();
        }
        else if((btArriba.getText().equals("  "))&&(btCentro.getText().equals("  "))&&(btAbajo.getText().equals("  "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario2+"!!");
            jugarSalir();
        }
        else if((btArribaDerecha.getText().equals("  "))&&(btDerecha.getText().equals(" "))&&(btAbajoDerecha.getText().equals("  "))){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Ganaste"+" "+usuario2+"!!");
            jugarSalir();
        }
        else if(turno>=9){
            decirTurno.setText("");
            JOptionPane.showMessageDialog(null, "Empate");
            jugarSalir();
        }
    }
    
    private void iniciarTurnos(int turno, JButton boton, boolean IA){
        if(IA==false){
            if(turno%2==0){
                colocarImagen(imagenX,boton);
                boton.setText(" ");
                decirTurno.setText("Sigue: "+usuario2);
            }
            else{
                colocarImagen(imagenO,boton);
                boton.setText("  ");
                decirTurno.setText("Sigue: "+usuario1);
            }
        }
        else{
            colocarImagen(imagenX,boton);
            boton.setText(" ");
            decirTurno.setText("Sigue: "+usuario2);
            System.out.println(turno);
            
            IA();
        }
    }
    
    private void IA(){
        int numeroR;
        
        do{
            if(turno!=4){
                numeroR = (int) (Math.random()*8);
                comprobarIA(numeroR);
            }
            else{
                bandera = true;
            }
            comprobarGanador();
        }while(bandera==false);
        bandera=false;
    }
    
    private void comprobarIA(int random){
        switch(random){
            case 0: if(btArribaIzquierda.getText().equals(" ")){
                        System.out.println("Equivocado, aqui hay una X");
                    }
                    else if(btArribaIzquierda.getText().equals("  ")){
                        System.out.println("Equivocado, aqui hay un O");
                    }
                    else{
                        colocarImagen(imagenO,btArribaIzquierda);
                        btArribaIzquierda.setText("  ");
                        decirTurno.setText("Sigue: "+usuario1);
                        bandera = true;
                        btArribaIzquierda.setEnabled(false);
                    }
                    break;
            case 1: if(btArriba.getText().equals(" ")){
                        System.out.println("Equivocado, aqui hay una X");
                    }
                    else if(btArriba.getText().equals("  ")){
                        System.out.println("Equivocado, aqui hay un O");
                    }
                    else{
                        colocarImagen(imagenO,btArriba);
                        btArriba.setText("  ");
                        decirTurno.setText("Sigue: "+usuario1);
                        bandera = true;
                        btArriba.setEnabled(false);
                    }
                    break;
            case 2: if(btArribaDerecha.getText().equals(" ")){
                        System.out.println("Equivocado, aqui hay una X");
                    }
                    else if(btArribaDerecha.getText().equals("  ")){
                        System.out.println("Equivocado, aqui hay un O");
                    }
                    else{
                        colocarImagen(imagenO,btArribaDerecha);
                        btArribaDerecha.setText("  ");
                        decirTurno.setText("Sigue: "+usuario1);
                        bandera = true;
                        btArribaDerecha.setEnabled(false);
                    }
                    break;
            case 3: if(btIzquierda.getText().equals(" ")){
                        System.out.println("Equivocado, aqui hay una X");
                    }
                    else if(btIzquierda.getText().equals("  ")){
                        System.out.println("Equivocado, aqui hay un O");
                    }
                    else{
                        colocarImagen(imagenO,btIzquierda);
                        btIzquierda.setText("  ");
                        decirTurno.setText("Sigue: "+usuario1);
                        bandera = true;
                        btIzquierda.setEnabled(false);
                    }
                    break;
            case 4: if(btCentro.getText().equals(" ")){
                        System.out.println("Equivocado, aqui hay una X");
                    }
                    else if(btCentro.getText().equals("  ")){
                        System.out.println("Equivocado, aqui hay un O");
                    }
                    else{
                        colocarImagen(imagenO,btCentro);
                        btCentro.setText("  ");
                        decirTurno.setText("Sigue: "+usuario1);
                        bandera = true;
                        btCentro.setEnabled(false);
                    }
                    break;
            case 5: if(btDerecha.getText().equals(" ")){
                        System.out.println("Equivocado, aqui hay una X");
                    }
                    else if(btDerecha.getText().equals("  ")){
                        System.out.println("Equivocado, aqui hay un O");
                    }
                    else{
                        colocarImagen(imagenO,btDerecha);
                        btDerecha.setText("  ");
                        decirTurno.setText("Sigue: "+usuario1);
                        bandera = true;
                        btDerecha.setEnabled(false);
                    }
                    break;    
            case 6: if(btAbajoIzquierda.getText().equals(" ")){
                        System.out.println("Equivocado, aqui hay una X");
                    }
                    else if(btAbajoIzquierda.getText().equals("  ")){
                        System.out.println("Equivocado, aqui hay un O");
                    }
                    else{
                        colocarImagen(imagenO,btAbajoIzquierda);
                        btAbajoIzquierda.setText("  ");
                        decirTurno.setText("Sigue: "+usuario1);
                        bandera = true;
                        btAbajoIzquierda.setEnabled(false);
                    }
                    break;
            case 7: if(btAbajo.getText().equals(" ")){
                        System.out.println("Equivocado, aqui hay una X");
                    }
                    else if(btAbajo.getText().equals("  ")){
                        System.out.println("Equivocado, aqui hay un O");
                    }
                    else{
                        colocarImagen(imagenO,btAbajo);
                        btAbajo.setText("  ");
                        decirTurno.setText("Sigue: "+usuario1);
                        bandera = true;
                        btAbajo.setEnabled(false);
                    }
                    break;
            case 8: if(btAbajoDerecha.getText().equals(" ")){
                        System.out.println("Equivocado, aqui hay una X");
                    }
                    else if(btAbajoDerecha.getText().equals("  ")){
                        System.out.println("Equivocado, aqui hay un O");
                    }
                    else{
                        colocarImagen(imagenO,btAbajoDerecha);
                        btAbajoDerecha.setText("  ");
                        decirTurno.setText("Sigue: "+usuario1);
                        bandera = true;
                        btAbajoDerecha.setEnabled(false);
                    }
                    break;
        }
    }
    
    private void colocarImagen(String imagen, JButton boton){
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen)));
    }
    
    private void jugarSalir(){
        int opc = JOptionPane.showConfirmDialog(null, "¿Deseas seguir jugando?");
        if(opc==0){
            borrarTodo();
            opc = JOptionPane.showConfirmDialog(null, "¿Quien va a iniciar? "+getUsuario1()+"(si) "+getUsuario2()+"(no)");
            if(opc==1){
                turno = 1;
            }
            else if(opc==0){
                turno=0;
            }
            else{
                System.exit(0);
            }
        }
        else if(opc==1){
            System.exit(0);
        }
    }
    
    private void borrarTodo(){
        btArribaIzquierda.setIcon(null);
        btArribaIzquierda.setText("");
        btArribaIzquierda.setEnabled(true);
        btArriba.setIcon(null);
        btArriba.setText("");
        btArriba.setEnabled(true);
        btArribaDerecha.setIcon(null);
        btArribaDerecha.setText("");
        btArribaDerecha.setEnabled(true);
        btIzquierda.setIcon(null);
        btIzquierda.setText("");
        btIzquierda.setEnabled(true);
        btCentro.setIcon(null);
        btCentro.setText("");
        btCentro.setEnabled(true);
        btDerecha.setIcon(null);
        btDerecha.setText("");
        btDerecha.setEnabled(true);
        btAbajoIzquierda.setIcon(null);
        btAbajoIzquierda.setText("");
        btAbajoIzquierda.setEnabled(true);
        btAbajo.setIcon(null);
        btAbajo.setText("");
        btAbajo.setEnabled(true);
        btAbajoDerecha.setIcon(null);
        btAbajoDerecha.setText("");
        btAbajoDerecha.setEnabled(true);
        turno = 0;
        if(vsIA==true){
            vsIA=true;
        }
        else{
            vsIA=false;
        }
        bandera = false;
    }
    
    public String getUsuario1() {
        return usuario1;
    }

    public String getUsuario2() {
        return usuario2;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    public void setVsIA(boolean vsIA) {
        this.vsIA = vsIA;
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbajo;
    private javax.swing.JButton btAbajoDerecha;
    private javax.swing.JButton btAbajoIzquierda;
    private javax.swing.JButton btArriba;
    private javax.swing.JButton btArribaDerecha;
    private javax.swing.JButton btArribaIzquierda;
    private javax.swing.JButton btCentro;
    private javax.swing.JButton btDerecha;
    private javax.swing.JButton btIzquierda;
    private javax.swing.JLabel decirTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
