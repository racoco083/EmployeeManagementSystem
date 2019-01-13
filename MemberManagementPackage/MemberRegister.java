package MemberManagementPackage;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class MemberRegister extends MemberManagements implements ActionListener {
	private JTextField name;
	private JTextField age;
	private JTextField phone;
	private JTextField addr;
	private JTextField code;
	private JTextField year;
	private JTextField aincome;
	private JTextField sclass;
	private JComboBox cb1 = new JComboBox();
	private JComboBox cb2 = new JComboBox();
	private String[] darr={"부서 선택", "총무", "인사", "기획", "연구", "생산", "영업"};
	private String[] rarr={"직급 선택", "인턴", "사원", "대리", "과장", "차장", "부장", "임원"};
	private JButton bt1 = new JButton("등록");
	private JButton bt2 = new JButton("취소");
	private MyFrame fmr = new MyFrame();
	private JRadioButton female;
	private JRadioButton male;
	private ButtonGroup bg = new ButtonGroup();
	
	public MemberRegister(){
		fmr.setTitle("직원등록");
		fmr.setSize(500, 400);
		fmr.setLocation(500, 300);
		fmr.setDefaultCloseOperation(fmr.EXIT_ON_CLOSE);
	
		JLabel mCode = new JLabel("직원 코드 :");
		mCode.setBounds(27, 16, 90, 30);
		fmr.getContentPane().add(mCode);
		
		JLabel mName = new JLabel("직원 이름 :");
		mName.setBounds(237, 16, 90, 30);
		fmr.getContentPane().add(mName);
		
		JLabel mAge = new JLabel("직원 나이 :");
		mAge.setBounds(27, 56, 90, 30);
		fmr.getContentPane().add(mAge);
		
		JLabel mPhone = new JLabel("직원 전화번호 :");
		mPhone.setBounds(27, 96, 90, 30);
		fmr.getContentPane().add(mPhone);
		
		JLabel mAddr = new JLabel("직원 주소 :");
		mAddr.setBounds(27, 136, 90, 30);
		fmr.getContentPane().add(mAddr);
		
		JLabel mYear = new JLabel("직원 입사년도 :");
		mYear.setBounds(27, 176, 90, 30);
		fmr.getContentPane().add(mYear);
		
		JLabel mDepartment = new JLabel("직원 부서 :");
		mDepartment.setBounds(237, 176, 90, 30);
		fmr.getContentPane().add(mDepartment);
		
		JLabel mRack = new JLabel("직원 직급 :");
		mRack.setBounds(27, 216, 90, 30);
		fmr.getContentPane().add(mRack);
		
		JLabel mSclass = new JLabel("직원 호봉 :");
		mSclass.setBounds(237, 216, 90, 30);
		fmr.getContentPane().add(mSclass);
		
		JLabel mAsalry = new JLabel("직원 연봉액 :");
		mAsalry.setBounds(27, 256, 90, 30);
		fmr.getContentPane().add(mAsalry);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(310, 21, 62, 21);
		fmr.getContentPane().add(name);
	
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(97, 61, 62, 21);
		fmr.getContentPane().add(age);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(129, 101, 144, 21);
		fmr.getContentPane().add(phone);
		
		JLabel label = new JLabel("('-'없이 입력해주세요)");
		label.setBounds(280, 104, 138, 15);
		fmr.getContentPane().add(label);
		
		addr = new JTextField();
		addr.setColumns(10);
		addr.setBounds(97, 140, 357, 21);
		fmr.getContentPane().add(addr);
		
		year = new JTextField();
		year.setColumns(10);
		year.setBounds(121, 180, 62, 21);
		fmr.getContentPane().add(year);
		
		cb1.setBounds(310, 180, 92, 21);
		for(int i=0; i<darr.length; i++)
		{
			cb1.addItem(darr[i]);
		}
		fmr.getContentPane().add(cb1);
	
		cb2.setBounds(97, 220, 92, 21);
		for(int i=0; i<rarr.length; i++)
		{
			cb2.addItem(rarr[i]);
		}
		fmr.getContentPane().add(cb2);
		
		sclass = new JTextField();
		sclass.setColumns(10);
		sclass.setBounds(310, 220, 62, 21);
		fmr.getContentPane().add(sclass);
		
		aincome = new JTextField();
		aincome.setColumns(10);
		aincome.setBounds(107, 260, 62, 21);
		fmr.getContentPane().add(aincome);
		
		bt1.setBounds(97, 300, 97, 40);
		fmr.getContentPane().add(bt1);
		
		bt2.setBounds(280, 300, 97, 40);
		fmr.getContentPane().add(bt2);
		
		code = new JTextField();
		code.setColumns(10);
		code.setBounds(97, 21, 62, 21);
		if(list.size() != 0){
			code.setText((Integer.parseInt(list.get(list.size()-1).getCode())+1)+"");//중요
		}else{
			code.setText(1001 + "");
		}
		fmr.getContentPane().add(code);
		
		JLabel mSex = new JLabel("직원 성별 :");
		mSex.setBounds(237, 56, 90, 30);
		fmr.getContentPane().add(mSex);
		
		male = new JRadioButton("남");
		male.setBounds(306, 60, 45, 23);
		
		female = new JRadioButton("여");
		female.setBounds(350, 60, 45, 23);
		
		bg.add(male);
		bg.add(female);
		
		fmr.getContentPane().add(male);
		fmr.getContentPane().add(female);
		
		fmr.setVisible(true);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String memSex = "";
		if(e.getSource() == bt1){
			String memCode = code.getText();
			String memName = name.getText();
			String memAge = age.getText();
			if(male.isSelected()){
				memSex = "남자";
			}else if(female.isSelected()){
				memSex = "여자";
			}
			String memPhone = phone.getText();
			String memAddr = addr.getText();
			String memYear = year.getText();
			String memDepartment = darr[cb1.getSelectedIndex()];
			String memSclass = sclass.getText();
			String memRank = rarr[cb1.getSelectedIndex()];
			String memAincome = aincome.getText();
			if(memCode.equals("")){
				JOptionPane.showMessageDialog(this, "직원 코드을 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memName.equals("")){
				JOptionPane.showMessageDialog(this, "직원 이름을 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memAge.equals("")){
				JOptionPane.showMessageDialog(this, "직원 나이를 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memSex.equals("")){
				JOptionPane.showMessageDialog(this, "직원 성별를 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memPhone.equals("")){
				JOptionPane.showMessageDialog(this, "직원 전화번호를 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memAddr.equals("")){
				JOptionPane.showMessageDialog(this, "직원 주소를 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memYear.equals("")){
				JOptionPane.showMessageDialog(this, "직원 입사년도를 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memDepartment.equals("")){
				JOptionPane.showMessageDialog(this, "직원 부서를 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memSclass.equals("")){
				JOptionPane.showMessageDialog(this, "직원 호봉을 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memRank.equals("")){
				JOptionPane.showMessageDialog(this, "직원 직급을 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else if(memAincome.equals("")){
				JOptionPane.showMessageDialog(this, "직원 연봉액을 입력해 주세요", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}else{
				for(int i=0; i<list.size(); i++){
					if(memCode.equals(list.get(i).getCode())){
						JOptionPane.showMessageDialog(this, "동일한 직원코드가 있습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				if(!integerOrNot(memCode)){
					JOptionPane.showMessageDialog(this, "직원 코드는 문자를 입력할 수 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memAge)){
					JOptionPane.showMessageDialog(this, "직원 나이는 문자를 입력할 수 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memPhone)){
					JOptionPane.showMessageDialog(this, "전화번호는 문자를 입력할 수 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memYear)){
					JOptionPane.showMessageDialog(this, "입사년도는 문자를 입력할 수 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memAincome)){
					JOptionPane.showMessageDialog(this, "연봉액은 문자를 입력할 수 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memSclass)){
					JOptionPane.showMessageDialog(this, "호봉은 문자를 입력할 수 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else if(!(memPhone.substring(0,2).equals("01") && (memPhone.length() ==10 || memPhone.length() ==11))){
					JOptionPane.showMessageDialog(this, "잘못된 전화번호를 입력하였습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else{
					int check = JOptionPane.showConfirmDialog(this, "입력한 내용이 맞습니까?\n" + 
							"직원 코드 : "+memCode + "\n직원 이름 : "+memName + 
							"\n직원 나이 : " + memAge + "\n직원 성별 : " + memSex + 
							"\n직원 전화번호 : " + memPhone + "\n직원 주소 : " + memAddr + 
							"\n직원 입사년도 : " + memYear + "\n직원 부서 : " + memDepartment +
							"\n직원 호봉 : " + memSclass + "\n직원 직급 : " + memRank + "\n직원 연봉액 : " + memAincome,
							"메시지", JOptionPane.INFORMATION_MESSAGE );
					if(check == 0){
						Members m = new Members();
						m.setCode(memCode);
						m.setName(memName);
						m.setAge(memAge);
						m.setSex(memSex);
						m.setPhone(memPhone);
						m.setAddr(memAddr);
						m.setYear(memYear);
						m.setDepartment(memDepartment);
						m.setSclass(memSclass);
						m.setRank(memRank);
						m.setAincome(memAincome);
						
						list.add(m);
						JOptionPane.showMessageDialog(this, "직원이 등록되었습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
						int check2 = JOptionPane.showConfirmDialog(this, "계속 입력하시겠습니까?");
						if(check2 == 0){
							code.setText(Integer.parseInt(list.get(list.size()-1).getCode()) +1 + "");
							name.setText(null);
							age.setText(null);
							bg.clearSelection();
							phone.setText(null);
							addr.setText(null);
							year.setText(null);
							cb1.setSelectedIndex(0);
							cb2.setSelectedIndex(0);
							sclass.setText(null);
							aincome.setText(null);
						}else if(check2 == 1){
							fmr.setVisible(false);
							super.MmStart();
						}
					}
				}
			}
		}else if(e.getSource() == bt2){
			fmr.dispose();
			super.MmStart();
		}
	}
	
	public boolean integerOrNot(String strData){ // 입력값이 숫자인지 문자인지 판별 : 
		char[] charData = strData.toCharArray();
		boolean check=true;
			for(int i=0; i<charData.length; i++){		
				if(!Character.isDigit(charData[i])){
						check = !check;
						break;
				}
			}
		return check;
	}
}

