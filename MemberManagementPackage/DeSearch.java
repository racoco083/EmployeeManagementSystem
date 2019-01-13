package MemberManagementPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.util.*;
public class DeSearch extends MemberManagements implements ActionListener{
	private MyFrame fds = new MyFrame();
	private JButton ga = new JButton("�ѹ�");
	private JButton hr = new JButton("�λ�");
	private JButton plan = new JButton("��ȹ");
	private JButton study = new JButton("����");
	private JButton pro = new JButton("����");
	private JButton sale = new JButton("����");
	private JButton cancel = new JButton("���");
	static ArrayList<Integer> lga = new ArrayList<Integer>();
	public DeSearch(){
		fds.setTitle("�μ���  ����");
		fds.setSize(260, 340);
		fds.setLocation(350, 250);
		fds.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		fds.getContentPane().setLayout(null);
		ga.setBounds(20, 10, 200, 32);
		fds.getContentPane().add(ga);
		hr.setBounds(20, 50, 200, 32);
		fds.getContentPane().add(hr);
		plan.setBounds(20, 90, 200, 32);
		fds.getContentPane().add(plan);
		study.setBounds(20, 130, 200, 32);
		fds.getContentPane().add(study);
		pro.setBounds(20, 170, 200, 32);
		fds.getContentPane().add(pro);
		sale.setBounds(20, 210, 200, 32);
		fds.getContentPane().add(sale);
		cancel.setBounds(20, 250, 200, 32);
		fds.getContentPane().add(cancel);
		ga.addActionListener(this);
		hr.addActionListener(this);
		plan.addActionListener(this);
		study.addActionListener(this);
		pro.addActionListener(this);
		sale.addActionListener(this);
		cancel.addActionListener(this);
		fds.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ga){
			String sga = "�ѹ�"; 
			if(list.size() != 0){
				for(int i=0; i<list.size(); i++){
					if(sga.equals(list.get(i).getDepartment())){
						lga.add(i);
					}
				}
			}
			DeTable dt = new DeTable();
		}
		else if(e.getSource() == hr){
			String sga = "�λ�"; 
			if(list.size() != 0){
				for(int i=0; i<list.size(); i++){
					if(sga.equals(list.get(i).getDepartment())){
						lga.add(i);
					}
				}
			}
			DeTable dt = new DeTable();
		}
		else if(e.getSource() == plan){
			String sga = "��ȹ"; 
			if(list.size() != 0){
				for(int i=0; i<list.size(); i++){
					if(sga.equals(list.get(i).getDepartment())){
						lga.add(i);
					}
				}
			}
			DeTable dt = new DeTable();
		}
		else if(e.getSource() == study){
			String sga = "����"; 
			if(list.size() != 0){
				for(int i=0; i<list.size(); i++){
					if(sga.equals(list.get(i).getDepartment())){
						lga.add(i);
					}
				}
			}
			DeTable dt = new DeTable();
		}
		else if(e.getSource() == pro){
			String sga = "����"; 
			if(list.size() != 0){
				for(int i=0; i<list.size(); i++){
					if(sga.equals(list.get(i).getDepartment())){
						lga.add(i);
					}
				}
			}
			DeTable dt = new DeTable();	
		}
		else if(e.getSource() == sale){
			String sga = "����"; 
			if(list.size() != 0){
				for(int i=0; i<list.size(); i++){
					if(sga.equals(list.get(i).getDepartment())){
						lga.add(i);
					}
				}
			}
			DeTable dt = new DeTable();
		}
		else if(e.getSource() == cancel){
			fds.dispose();
			super.MmStart();
		}
		lga.clear();
	}
}
