package view;

import controleDeArquivos.CreateFile;
import controleDeArquivos.ReadFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Tela extends JFrame {

    //Variaveis da classe
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu mnFile;
    private JMenuItem mntmNovo;
    private JMenuItem mntmAbrirArquivo;
    private JMenuItem mntmSalvar;
    private JButton btnNovo;
    private JButton btnAbrirArquivo;
    private JButton btnCompilador;
    private JPanel panel_1;
    private JPanel panel_3;
    private JPanel panel_2;
    private JScrollPane scrollPane;
    private JScrollBar scroll;
    private JScrollPane scrollPane_2;
    private JScrollPane scrollPane_1;
    private JTextArea textArquivo;
    private JTextArea textMsg;
    private JTextArea textArea_1 ;
    private JTextArea textConsole;
    private File file;
    private String campoTexto = null;
    private JButton btnSalvarComo;
    private JScrollPane scrollPane_3;
    private JTextArea textScroll;
    private JMenuItem mntmSalvarComo;
    private btnNovoListener btnNovoL; //Listener para os botoes de novo
    private btnAbrirListener btnAbrirL; //Listener para os botoes de Abrir
    private boolean controleArquivo = false; //Variavel que controla o fluxo se pode ou não compilar
    private int contEnter = 1; //Conta a quantidade de enter
    private JTabbedPane footer; //log, console, estrutura
    private JPanel jPanelConsole;
    private JPanel jPanelArvoreEstatica;
    private JPanel jPanelError;
    private JButton btnConsole;
    private JButton btnArvore;
    private JButton btnError; 
    private JLabel status;
    private JButton btnGrafico;

    public Tela() throws HeadlessException {

        this.lookFeel();
        btnNovoL = new btnNovoListener();
        btnAbrirL = new btnAbrirListener();

        setBackground(Color.LIGHT_GRAY);
		setTitle("Compilador Askella");
		setBounds(100, 100, 1000, 880);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);

		mnFile = new JMenu("Arquivo");
		menuBar.add(mnFile);

		mntmNovo = new JMenuItem("Novo");
		mntmNovo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmNovo.addActionListener(btnNovoL);
		mnFile.add(mntmNovo);

		mntmAbrirArquivo = new JMenuItem("Abrir Arquivo");
		mntmAbrirArquivo.addActionListener(btnAbrirL);
		mntmAbrirArquivo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmAbrirArquivo);

		mntmSalvar = new JMenuItem("Salvar");

		//Ação do botao para salvar
		mntmSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Chama a função para fazer o processo de salvar
				salvar();
			}
		});
		mntmSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmSalvar.setHorizontalAlignment(SwingConstants.LEFT);
		mnFile.add(mntmSalvar);

		//Ação do botao para salvar como
		mntmSalvarComo = new JMenuItem("Salvar Como...");
		mntmSalvarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Chama a função para fazer o processo de salvar como
				salvarComo();
			}
		});
		mnFile.add(mntmSalvarComo);
		getContentPane().setLayout(null);

        footer = new JTabbedPane();
        footer.setLayout(null);
        jPanelError = new JPanel();
        jPanelError.setLayout(null);
        jPanelArvoreEstatica = new JPanel();
        jPanelArvoreEstatica.setLayout(null);
        jPanelConsole = new JPanel();
        jPanelConsole.setLayout(null);


        //botão novo
        btnNovo = new JButton("Novo");
        btnNovo.setBounds(10, 11, 62, 21);
        getContentPane().add(btnNovo);
        btnNovo.addActionListener(btnNovoL);
        btnNovo.setBackground(SystemColor.activeCaptionBorder);

        //botão abrir
        btnAbrirArquivo = new JButton("Abrir");
        btnAbrirArquivo.setBounds(72, 11, 62, 21);
        getContentPane().add(btnAbrirArquivo);
        btnAbrirArquivo.setBackground(Color.LIGHT_GRAY);

        //botão salvar
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(134, 11, 62, 21);
        getContentPane().add(btnSalvar);
        //Ação do botao para salvar
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                salvar();
            }
        });
        btnSalvar.setBackground(SystemColor.activeCaptionBorder);

        //botão compilar:
        btnCompilador = new JButton("Compilar");
        //btnCompilador.setIcon(new ImageIcon(Tela.class.getResource("/com/sun/javafx/scene/web/skin/Bold_16x16_JFX.png")));
        btnCompilador.setBounds(884, 11, 84, 36);
        getContentPane().add(btnCompilador);
        btnCompilador.setBackground(Color.LIGHT_GRAY);

        //botão salvar como:
        btnSalvarComo = new JButton("Salvar como");
        //Ação do botao para salvar como
        btnSalvarComo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                salvarComo();
            }
        });
        btnSalvarComo.setBounds(196, 11, 100, 21);
        getContentPane().add(btnSalvarComo);


        panel_1 = new JPanel();
        panel_1.setBounds(54, 50, 920, 400);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);

        textArquivo = new JTextArea();
        textArquivo.setFont(new Font("Consolas", Font.PLAIN, 15));
        textArquivo.setToolTipText("<p></p>");


        textArquivo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent arg0) {
                //Caso o usuario clique com o botao ENTER
                if(arg0.getKeyCode() == 10){

                    // Verifica nao esta vazio o textArquivo
                    if(textArquivo.getText().trim().equals("") != true){
                        //Incrementa o contador de linhas
                        contEnter++;
                        //Chama a função que conta as linhas do textArquivo
                        contaLinha(10);
                    }
                    //Caso esteja vazio
                    else{
                        textScroll.setText("");
                        //Incrementa o contador de linhas
                        contEnter++;
                        //Coloca o numero de linhas
                        for(int i =1 ; i < contEnter; i++){
                            textScroll.append(i + "\n");
                        }
                        textScroll.append(contEnter+"");
                    }
                }
                //Caso o usuario clique BACKSPACE
                if(arg0.getKeyCode() == 8){
                    // Verifica nao esta vazio o textArquivo
                    if(textArquivo.getText().trim().equals("") != true){
                        //Decrementa o contador de linhas
                        contEnter--;
                        //Chama a função que conta as linhas do textArquivo
                        contaLinha(8);
                    }
                    //Caso esteja vazio
                    else{
                        textScroll.setText("");
                        //Incrementa o contador de linhas
                        contEnter--;
                        //Coloca o numero de linhas
                        for(int i =1 ; i < contEnter; i++){
                            textScroll.append(i + "\n");
                        }
                        textScroll.append(contEnter+"");

                        //Caso o contador seja < 1
                        if(contEnter < 1){
                            contEnter =1;
                            textScroll.setText("1");
                        }
                    }
                }
                //Caso o usuario clique para BAIXO ou para CIMA
                //A rola o scroll dos dois scrollPane, o do arquivo e o de linha
                if(arg0.getKeyCode() == 38 || arg0.getKeyCode() == 40){
                    Point point = scrollPane_2.getViewport().getViewPosition();
                    scrollPane_3.getViewport().setViewPosition(point);
                }
            }
        });
        scrollPane_2 = new JScrollPane ();
        scrollPane_2.setBounds(0, 0, 920, 400);
        scrollPane_2.setViewportView(textArquivo);
        textArquivo.setBounds(10, 45, 920, 400);
        panel_1.add(scrollPane_2);

        scrollPane_3 = new JScrollPane();
        scrollPane_3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane_3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane_3.setBounds(10, 50, 34, 400);
        getContentPane().add(scrollPane_3);

        textScroll = new JTextArea();
        textScroll.setFont(new Font("Consolas", Font.PLAIN, 15));
        textScroll.setEnabled(false);
        textScroll.setEditable(false);
        textScroll.setText("1");
        scrollPane_3.setViewportView(textScroll);
        btnAbrirArquivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Verifica se o arquivo esta vazio
                if(textArquivo.getText().equals("") != true){
                    int resp = JOptionPane.showConfirmDialog(null, "Salvar altera\u00e7\u00f5es? Caso não salve o arquivo sera perdido!!");

                    //Para salvar as alterações
                    if(resp ==0){
                        //Salvar um novo arquivo se ele n existir
                        if(file == null)
                        {
                            salvarComo();
                        }else //Se o arquivo ja existir salvar nele
                        {
                            salvar();
                        }
                    }
                }
                JFileChooser fc = new JFileChooser();
                int returnVal = fc.showOpenDialog(null);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    file = fc.getSelectedFile().getAbsoluteFile();
                    //Instancia a classe ReadFile que cuida de ler o arquivo
                    ReadFile read = new ReadFile();
                    //Abre o arquivo
                    read.openFile(file);
                    textArquivo.setText("");
                    campoTexto = new String();
                    campoTexto = read.readRecords();
                    textArquivo.append(campoTexto);
                    controleArquivo = true;
                    textScroll.setText("");
                    contEnter = read.getContLinhaArquivo();
                    contEnter++;
                    textScroll.append(read.numLine());
                    read.closeFile();
                }
            }
        });

        scrollPane_2.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent arg0) {
                Point point = scrollPane_2.getViewport().getViewPosition();
                scrollPane_3.getViewport().setViewPosition(point);
            }
        });

        btnConsole = new JButton("Console");
        btnConsole.setBounds(10, 460, 100, 21);
        getContentPane().add(btnConsole);
        btnConsole.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("mostrar console");
                panel_2.setVisible(true);
                panel_3.setVisible(false);
                status.setVisible(false);
            }
        });
        btnConsole.setBackground(SystemColor.activeCaptionBorder);


        btnArvore = new JButton("Arvore Sintatica");
        btnArvore.setBounds(120, 460, 145, 21);
        getContentPane().add(btnArvore);
        btnArvore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("mostrar arvore");
                panel_2.setVisible(false);
                panel_3.setVisible(true);
                status.setVisible(false);
            }
        });
        btnArvore.setBackground(SystemColor.activeCaptionBorder);

        btnGrafico = new JButton("Grafico da Arvore Sintatica");
        btnGrafico.setBounds(200, 460, 180, 21);
        getContentPane().add(btnGrafico);
        btnGrafico.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFileChooser jc = new JFileChooser();
                jc.setFileSelectionMode(JFileChooser.SAVE_DIALOG);
                int i= jc.showSaveDialog(null);

                //Se o retorno for == 1 quer dizer que o usuario apertou em cancelar
                // Se não, ele escreveu o nome do arquivo, ou selecionou o arquivo que queira salvar
                if(i!=1) {
                    // Pega o arquivo selecionado ou novo
                    file = jc.getSelectedFile();
                    CreateFile create = new CreateFile();

                    create.openFile(file);
                    create.addRecords(textMsg.getText());
                    create.closeFile();
                    //Fecha o arquivo

                    try {
                        Process exec = Runtime.getRuntime().exec( "python3 C:\\comp\\treestack.py" );
                    } catch(IOException exp){
                        exp.printStackTrace();
                    }
                    
                    status.setIcon(new ImageIcon("C:\\comp\\tree.png"));

                }

                panel_2.setVisible(false);
                panel_3.setVisible(false);
                status.setVisible(true);

            }
        });


        panel_3 = new JPanel();
        panel_3.setBounds(10, 495, 960, 350);
        getContentPane().add(panel_3);
        panel_3.setLayout(null);
        panel_3.setVisible(false);
        
        status = new JLabel();
        status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        status.setBounds(10, 20, 960, 280);
        status.setIcon(new ImageIcon("C:\\comp\\tree.png"));
        getContentPane().add(status);
        status.setVisible(false);
        panel_3.add(status);

        JLabel lblAnaliseSintatica = new JLabel("Arvore Sintatica");
        lblAnaliseSintatica.setBounds(20, 0, 100, 14);
        panel_3.add(lblAnaliseSintatica);

        panel_2 = new JPanel();
        panel_2.setBounds(10, 495, 960, 350);
        getContentPane().add(panel_2);
        //jPanelConsole.add(panel_2);
        panel_2.setLayout(null);
        panel_2.setVisible(true);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 20, 960, 280);
        panel_2.add(scrollPane);

        JLabel lblMensagem = new JLabel("Console");
        lblMensagem.setBounds(20, 0, 100, 14);
        panel_2.add(lblMensagem);

        textConsole = new JTextArea();
        textConsole.setForeground(SystemColor.textHighlight);
        textConsole.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 16));
        scrollPane.setViewportView(textConsole);
        textConsole.setEditable(false);

    }

    public void lookFeel() {//Altera o tipo de interface que ira exibir
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Nao foi possivel executar o nimbus");
        }
    }

    /*=== Funçao que retorna um o botao do compilador ===*/
    public JButton getCompilar() {
        return btnCompilador;
    }

    public JTextArea getTextArquivo(){
        return textArquivo;
    }

    /*=== Funçao para adicionar msg no console ===*/
    public void setConsole(String msg){
        textConsole.append(msg);
        System.out.println(msg);
    }

    /*=== Funçao para adicionar msg no campo de msg ===*/
    public void setMsg(String msg){
        textMsg.append(msg);
    }

    /*=== Funçao que retorna o arquivo que esta sendo editado ===*/
    public File getFile(){
        return file;
    }

    public void setFile(File file){
        this.file = file;
    }

    public String getCampoTexto(){
        return campoTexto;
    }

    public void setCampoTexto(String campoTexto){
        this.campoTexto = campoTexto;
    }

    public boolean getControleArquivo(){return controleArquivo;}

    public void setControleArquivo(boolean controle){
        this.controleArquivo = controle;
    }

    public void setVazioConsoleMsg(){
        textConsole.setText("");
        //textMsg.setText("");
        
    }

    //Salvar se o arquivo ja existe
    public void salvar(){
        campoTexto = new String();
        controleArquivo = true;

        if(file !=null){
            campoTexto = new String();
            controleArquivo = true;
            CreateFile create = new CreateFile();

            create.openFile(file);
            create.addRecords(textArquivo.getText());
            create.closeFile();

            campoTexto = textArquivo.getText();
        }else{
            salvarComo();
        }
    }

    //Salvar se o arquivo ainda não existir
    public void salvarComo(){
        // Abre o negocio para selecionar
        JFileChooser jc = new JFileChooser();
        jc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i= jc.showSaveDialog(null);

        //Se o retorno for == 1 quer dizer que o usuario apertou em cancelar
        // Se não, ele escreveu o nome do arquivo, ou selecionou o arquivo que queira salvar
        if(i!=1) {
            // Pega o arquivo selecionado ou novo
            file = jc.getSelectedFile();
            campoTexto = new String();
            controleArquivo = true;
            CreateFile create = new CreateFile();

            create.openFile(file);
            create.addRecords(textArquivo.getText());
            create.closeFile();
            //Fecha o arquivo

            campoTexto = textArquivo.getText();
        }
    }

    //Funcao para contar linhas
    public void contaLinha(int key){
        String[] separa = textArquivo.getText().split("\n");
        textScroll.setText("");

        //Esse if serve para caso tenha conteudo, mas o usuario deu muitos enter
        if(contEnter >= separa.length){
            for(int i =1 ; i < contEnter; i++){
                textScroll.append(i + "\n");
            }
            textScroll.append(contEnter+"");
        }else{
            for(int i =1 ; i < separa.length; i++){
                textScroll.append(i + "\n");
            }
            textScroll.append(separa.length+"");
            if(key ==10) textScroll.append((separa.length+1) + "");
            contEnter = separa.length;
        }

    }

    class btnNovoListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            if(textArquivo.getText().equals("") != true){
                //Salvar um novo arquivo se ele n existir
                int resp = JOptionPane.showConfirmDialog(null, "Salvar altera\u00e7\u00f5es? Caso não salve o arquivo sera perdido!!");
                if(resp ==0){
                    if(file == null)
                    {
                        salvarComo();

                    }else //Se o arquivo ja existir salvar nele
                    {
                        salvar();
                    }
                    textArquivo.setText("");
                    textScroll.setText("1");
                    contEnter = 1;
                }else{
                    textArquivo.setText("");
                    textScroll.setText("1");
                    contEnter = 1;
                }

            }else{
                textArquivo.setText("");
                textScroll.setText("1");
                contEnter = 1;
            }
        }
    }

    class btnAbrirListener implements ActionListener{
        public void actionPerformed(ActionEvent arg0) {
            if(textArquivo.getText().equals("") != true){
                //Salvar um novo arquivo se ele n existir
                if(file == null)
                {
                    salvarComo();

                }else //Se o arquivo ja existir salvar nele
                {
                    salvar();
                }
                textArquivo.setText("");
                textScroll.setText("1");
                contEnter = 1;
            }else{
                textArquivo.setText("");
                textScroll.setText("1");
                contEnter = 1;
            }
        }
    }
}
