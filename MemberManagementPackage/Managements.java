package MemberManagementPackage;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Managements extends MemberManagements  implements ActionListener, ItemListener {
	private MyFrame fm = new MyFrame();
	private JButton add = new JButton("직원 추가");
	private JButton edit = new JButton("직원 수정");
	private JButton delete = new JButton("직원 삭제");
	private JButton cancel = new JButton("취소");
	private JComboBox cb = new JComboBox();
	private JLabel select = new JLabel("직원 선택");
	private JTextArea memInfo = new JTextArea();
	
	public Managements(){
		fm.setTitle("직원관리");
		fm.setSize(331, 280);
		fm.setLocation(550, 350);
		fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
		
		cb.setBounds(12, 39, 183, 21);
		cb.addItem("직원을 선택하세요");
		for(int i=0; i<list.size(); i++){
			cb.addItem(list.get(i).getCode() + ". " + list.get(i).getName());
		}
		fm.getContentPane().add(cb);
		
		edit.setBounds(207, 40, 97, 32);
		fm.getContentPane().add(edit);
		
		delete.setBounds(207, 82, 97, 32);
		fm.getContentPane().add(delete);
		
		cancel.setBounds(207, 166, 97, 32);
		fm.getContentPane().add(cancel);
		
		select.setBounds(12, 14, 57, 15);
		fm.getContentPane().add(select);
		
		memInfo.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(memInfo);
		scrollPane.setSize(183, 150);	
		scrollPane.setLocation(12, 80);
		fm.getContentPane().add(scrollPane);
		
		add.setBounds(207, 124, 97, 32);
		fm.getContentPane().add(add);
		
		add.addActionListener(this);
		edit.addActionListener(this);
		delete.addActionListener(this);
		cancel.addActionListener(this);
		cb.addItemListener(this);

		
		fm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie){
		if(cb.getSelectedIndex()!=0){
			int select = cb.getSelectedIndex()-1;
			memInfo.setText("직원 번호 : "+list.get(select).getCode() + "\n직원 이름 : "+ list.get(select).getName() 
				+ "\n직원 나이 : " + list.get(select).getAge()  + "\n직원 성별 : " + list.get(select).getSex()  + "\n직원 전화번호 : " 
				+ list.get(select).getPhone()   +	"\n직원 주소 : " +list.get(select).getAddr()+	"\n직원 부서 : " +list.get(select).getDepartment()
				+"\n직원 입사년도 : " +list.get(select).getYear()+	"\n직원 호봉 : " +list.get(select).getSclass()+	"\n직원 직급 : " +list.get(select).getRank()
				+	"\n직원 연봉 : " +list.get(select).getAincome());
		}else{
			memInfo.setText(null);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == edit){
			Edit ed = new Edit(cb.getSelectedIndex());// 첫번째 사람인지 두번째 사람인지 선택
			fm.dispose();
		}else if(e.getSource() == delete){
			int select = cb.getSelectedIndex()-1;
			list.remove(select);
			cb.removeItemAt(select+1);
		}else if(e.getSource() == add){
			fm.dispose();
			MemberRegister mr = new MemberRegister();
		}else if(e.getSource() == cancel){
			fm.dispose();
			super.MmStart();
		}
	}
}
