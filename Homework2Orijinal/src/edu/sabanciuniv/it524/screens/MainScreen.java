package edu.sabanciuniv.it524.screens;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

public class MainScreen extends JFrame {
	
	private JButton fileReadButton;
	private JTextArea fileContentArea;
	private JScrollPane fileContentScrollPane;
	private JTextField fileNameField;
	private JButton fileSaveButton;
	
	public MainScreen()
	{
		this.setTitle("IT524 Homework 2");
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		
		//Buton ekliyoruz
		this.fileReadButton = new  JButton("Read File ...");
		this.fileReadButton.setLocation(280, 20);
		this.fileReadButton.setSize(100, 25);
		this.getContentPane().add(fileReadButton);
		
		//Seçilen dosya isminin görüneceği textfield ekliyoruz
		this.fileNameField = new JTextField();
		this.fileNameField.setLocation(20, 20);
		this.fileNameField.setSize(250, 25);
		this.getContentPane().add(fileNameField);
		
		
		//Dosyanın içeriğinin görüntüleneceği textArea yı önce ScrollPane içerisine ekleyoruz
		//Sonra scrollpane i frame ekliyoruz
		this.fileContentArea = new JTextArea();
		this.fileContentArea.setLocation(20, 60);
		this.fileContentArea.setSize(360, 250);
		
		this.fileContentScrollPane = new JScrollPane();
		this.fileContentScrollPane.getViewport().setView(this.fileContentArea);
		this.fileContentScrollPane.setLocation(20, 60);
		this.fileContentScrollPane.setSize(360, 250);
		this.getContentPane().add(fileContentScrollPane);
		
		
		
		
		//Buton a kliklendiğinde JFileChooser (Dosya seçme ekranı) açıyoruz
		//Bunun için button un mouseClicked eventini override etmemiz gerekiyor
		this.fileReadButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			        jfc.setPreferredSize(new Dimension(400, 400));
			        int returnValue = jfc.showOpenDialog(null);
			        if (returnValue == JFileChooser.APPROVE_OPTION) {
			            File selectedFile = jfc.getSelectedFile();
			            fileNameField.setText(selectedFile.getAbsolutePath());
			            
			            
			            //TODO : Read, parse and get content of the selected file  (students.tsv or students.csv) as string
			            //TODO : Print the content into fileContentArea
			            //Please use CSVParser or TSVParser classes for this		         
			        }
			}
		});
		
		
		//Dosyayı kaydetme butonunu ekliyoruz
		this.fileSaveButton = new  JButton("Save File");
		this.fileSaveButton.setLocation(150, 320);
		this.fileSaveButton.setSize(100, 25);
		this.getContentPane().add(fileSaveButton);
		
		//TODO : Add mouse listener event (you can copy from above) 
		//that takes the content of fileContentArea and writesit into "output.txt" file
		
		
	}
	

}
