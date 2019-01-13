package MemberManagementPackage;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;

import java.io.ByteArrayInputStream;

public class MemberManagements extends MyFrame{
	static ArrayList<Members> list = new ArrayList<Members>(); 
	MyFrame fmm = new MyFrame();
	JFileChooser f = new JFileChooser();
	FileNameExtensionFilter ff;
	Image backImg;
	public MemberManagements() {
		JMenuBar menuBar = new JMenuBar();
		fmm.setJMenuBar(menuBar);
		
		JMenu menu1 = new JMenu("File");
		menuBar.add(menu1);
		
		JMenuItem menu1Item = new JMenuItem("Loadfile");
		menu1.add(menu1Item);
		
		JMenuItem menu2Item = new JMenuItem("Savefile");
		menu1.add(menu2Item);
		
		JMenuItem menu3Item = new JMenuItem("Exit");
		menu1.add(menu3Item);
	
		menu3Item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{System.exit(0);}
		}
		);
		
		ff = new FileNameExtensionFilter("텍스트파일(.txt)", "txt");
		menu1Item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  f.setCurrentDirectory(new File("./src/"));
				  f.addChoosableFileFilter(ff);
				  int file = f.showOpenDialog(null); //열기 취소를 생각한다.
				  if (file != f.APPROVE_OPTION) {
				    return;
				 }
				 String filePath = f.getSelectedFile().getPath(); 
				 if(filePath != null){
					fileLoad(filePath); 
				 }
			}
		});
		
		menu2Item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 f.setCurrentDirectory(new File("./src/"));
				 f.setFileSelectionMode(f.FILES_AND_DIRECTORIES);  
				 f.addChoosableFileFilter(ff);
				 int file = f.showSaveDialog(null);
				 if (file == f.APPROVE_OPTION) {
				  String type = ff.getDescription().substring(6, 10);//@11ab2ec[description=텍스트파일(.txt) extensions=[txt]]
				  //모든 파일, 텍스트 파일 고르는 부분
				  String savepathname = f.getSelectedFile().getAbsolutePath()+type;
				  fileSave(savepathname);
				 }else{
					 return;
				 }
			}
		});
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("./src/member.jpg"));
		lblNewLabel.setBounds(22, 10, 431, 213);
		fmm.getContentPane().add(lblNewLabel);
	}
	
	public void MmStart(){
		fmm.setTitle("직원관리 프로그램");
		fmm.setSize(500, 360);
		fmm.setLocation(500, 300);
		fmm.setDefaultCloseOperation(fmm.EXIT_ON_CLOSE);
		fmm.setVisible(true);
		
		JButton bt1 = new JButton("직원등록");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fmm.dispose();
				MemberRegister mr = new MemberRegister();
			}
		});
		bt1.setBounds(22, 232, 133, 49);
		fmm.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("직원관리");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fmm.dispose();
				Managements mg = new Managements();
			}
		});
		bt2.setBounds(174, 232, 133, 49);
		fmm.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("직원검색");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fmm.dispose();
				MemberSearch ms = new MemberSearch();
			}
		});
		bt3.setBounds(324, 232, 133, 49);
		fmm.getContentPane().add(bt3);
		
	}
	
	public void fileLoad(String path){
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		int mb = 1024*1024;
        
        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();

		try{
				list.clear(); //파일로드 위해 기존의 멤버리스트정보 지우기
				fi = new FileInputStream(path);
				isr = new InputStreamReader(fi);
				bfr = new BufferedReader(isr);
				
				String str = null;
				while((str = bfr.readLine())!=null){
					Members m = new Members();
					st = new StringTokenizer(str,",");
					m.setCode(st.nextToken());
					m.setName(st.nextToken());
					m.setAge(st.nextToken());
					m.setSex(st.nextToken());
					m.setPhone(st.nextToken());
					m.setAddr(st.nextToken());
					m.setYear(st.nextToken());
					m.setDepartment(st.nextToken());
					m.setSclass(st.nextToken());
					m.setRank(st.nextToken());
					m.setAincome(st.nextToken());
					if(1024 < (runtime.totalMemory() - runtime.freeMemory()) / mb)
						break;
					list.add(m);
				}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fi.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave(String path){
		 FileOutputStream fo = null;
		 try{
		   fo = new FileOutputStream(path);
		   for(int i=0; i<list.size(); i++){
		   	   fo.write(list.get(i).getCode().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getName().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getAge().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getSex().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getPhone().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getAddr().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getYear().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getDepartment().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getSclass().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getRank().getBytes());
			   fo.write((",").getBytes());
			   fo.write(list.get(i).getAincome().getBytes());
			   fo.write(("\r\n").getBytes());
		   }       
	    }catch (Exception e) {
	    	e.printStackTrace();
	   }finally{
			try{
				fo.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
