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
	private String[] darr={"�μ� ����", "�ѹ�", "�λ�", "��ȹ", "����", "����", "����"};
	private String[] rarr={"���� ����", "����", "���", "�븮", "����", "����", "����", "�ӿ�"};
	private JButton bt1 = new JButton("���");
	private JButton bt2 = new JButton("���");
	private MyFrame fmr = new MyFrame();
	private JRadioButton female;
	private JRadioButton male;
	private ButtonGroup bg = new ButtonGroup();
	
	public MemberRegister(){
		fmr.setTitle("�������");
		fmr.setSize(500, 400);
		fmr.setLocation(500, 300);
		fmr.setDefaultCloseOperation(fmr.EXIT_ON_CLOSE);
	
		JLabel mCode = new JLabel("���� �ڵ� :");
		mCode.setBounds(27, 16, 90, 30);
		fmr.getContentPane().add(mCode);
		
		JLabel mName = new JLabel("���� �̸� :");
		mName.setBounds(237, 16, 90, 30);
		fmr.getContentPane().add(mName);
		
		JLabel mAge = new JLabel("���� ���� :");
		mAge.setBounds(27, 56, 90, 30);
		fmr.getContentPane().add(mAge);
		
		JLabel mPhone = new JLabel("���� ��ȭ��ȣ :");
		mPhone.setBounds(27, 96, 90, 30);
		fmr.getContentPane().add(mPhone);
		
		JLabel mAddr = new JLabel("���� �ּ� :");
		mAddr.setBounds(27, 136, 90, 30);
		fmr.getContentPane().add(mAddr);
		
		JLabel mYear = new JLabel("���� �Ի�⵵ :");
		mYear.setBounds(27, 176, 90, 30);
		fmr.getContentPane().add(mYear);
		
		JLabel mDepartment = new JLabel("���� �μ� :");
		mDepartment.setBounds(237, 176, 90, 30);
		fmr.getContentPane().add(mDepartment);
		
		JLabel mRack = new JLabel("���� ���� :");
		mRack.setBounds(27, 216, 90, 30);
		fmr.getContentPane().add(mRack);
		
		JLabel mSclass = new JLabel("���� ȣ�� :");
		mSclass.setBounds(237, 216, 90, 30);
		fmr.getContentPane().add(mSclass);
		
		JLabel mAsalry = new JLabel("���� ������ :");
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
		
		JLabel label = new JLabel("('-'���� �Է����ּ���)");
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
			code.setText((Integer.parseInt(list.get(list.size()-1).getCode())+1)+"");//�߿�
		}else{
			code.setText(1001 + "");
		}
		fmr.getContentPane().add(code);
		
		JLabel mSex = new JLabel("���� ���� :");
		mSex.setBounds(237, 56, 90, 30);
		fmr.getContentPane().add(mSex);
		
		male = new JRadioButton("��");
		male.setBounds(306, 60, 45, 23);
		
		female = new JRadioButton("��");
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
				memSex = "����";
			}else if(female.isSelected()){
				memSex = "����";
			}
			String memPhone = phone.getText();
			String memAddr = addr.getText();
			String memYear = year.getText();
			String memDepartment = darr[cb1.getSelectedIndex()];
			String memSclass = sclass.getText();
			String memRank = rarr[cb1.getSelectedIndex()];
			String memAincome = aincome.getText();
			if(memCode.equals("")){
				JOptionPane.showMessageDialog(this, "���� �ڵ��� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memName.equals("")){
				JOptionPane.showMessageDialog(this, "���� �̸��� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memAge.equals("")){
				JOptionPane.showMessageDialog(this, "���� ���̸� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memSex.equals("")){
				JOptionPane.showMessageDialog(this, "���� ������ �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memPhone.equals("")){
				JOptionPane.showMessageDialog(this, "���� ��ȭ��ȣ�� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memAddr.equals("")){
				JOptionPane.showMessageDialog(this, "���� �ּҸ� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memYear.equals("")){
				JOptionPane.showMessageDialog(this, "���� �Ի�⵵�� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memDepartment.equals("")){
				JOptionPane.showMessageDialog(this, "���� �μ��� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memSclass.equals("")){
				JOptionPane.showMessageDialog(this, "���� ȣ���� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memRank.equals("")){
				JOptionPane.showMessageDialog(this, "���� ������ �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else if(memAincome.equals("")){
				JOptionPane.showMessageDialog(this, "���� �������� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}else{
				for(int i=0; i<list.size(); i++){
					if(memCode.equals(list.get(i).getCode())){
						JOptionPane.showMessageDialog(this, "������ �����ڵ尡 �ֽ��ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				if(!integerOrNot(memCode)){
					JOptionPane.showMessageDialog(this, "���� �ڵ�� ���ڸ� �Է��� �� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memAge)){
					JOptionPane.showMessageDialog(this, "���� ���̴� ���ڸ� �Է��� �� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memPhone)){
					JOptionPane.showMessageDialog(this, "��ȭ��ȣ�� ���ڸ� �Է��� �� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memYear)){
					JOptionPane.showMessageDialog(this, "�Ի�⵵�� ���ڸ� �Է��� �� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memAincome)){
					JOptionPane.showMessageDialog(this, "�������� ���ڸ� �Է��� �� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else if(!integerOrNot(memSclass)){
					JOptionPane.showMessageDialog(this, "ȣ���� ���ڸ� �Է��� �� �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else if(!(memPhone.substring(0,2).equals("01") && (memPhone.length() ==10 || memPhone.length() ==11))){
					JOptionPane.showMessageDialog(this, "�߸��� ��ȭ��ȣ�� �Է��Ͽ����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else{
					int check = JOptionPane.showConfirmDialog(this, "�Է��� ������ �½��ϱ�?\n" + 
							"���� �ڵ� : "+memCode + "\n���� �̸� : "+memName + 
							"\n���� ���� : " + memAge + "\n���� ���� : " + memSex + 
							"\n���� ��ȭ��ȣ : " + memPhone + "\n���� �ּ� : " + memAddr + 
							"\n���� �Ի�⵵ : " + memYear + "\n���� �μ� : " + memDepartment +
							"\n���� ȣ�� : " + memSclass + "\n���� ���� : " + memRank + "\n���� ������ : " + memAincome,
							"�޽���", JOptionPane.INFORMATION_MESSAGE );
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
						JOptionPane.showMessageDialog(this, "������ ��ϵǾ����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
						int check2 = JOptionPane.showConfirmDialog(this, "��� �Է��Ͻðڽ��ϱ�?");
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
	
	public boolean integerOrNot(String strData){ // �Է°��� �������� �������� �Ǻ� : 
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

