package MemberManagementPackage;

import java.awt.Frame;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Edit extends MemberManagements implements ActionListener{
	private MyFrame fe = new MyFrame();
	private JButton eName = new JButton("���� �̸�");
	private JButton eAge = new JButton("���� ����");
	private JButton eSex = new JButton("���� ����");
	private JButton ePhone = new JButton("��ȭ��ȣ");
	private JButton eAddr = new JButton("���� �ּ�");
	private JButton eYear = new JButton("�Ի�⵵");
	private JButton eDepartment = new JButton("���� �μ�");
	private JButton eSclass = new JButton("���� ȣ��");
	private JButton eRank = new JButton("���� ����");
	private JButton eAincome = new JButton("���� ����");
	private JButton eConfirm = new JButton("Ȯ��");
	private JButton eCancel = new JButton("���");
	
	private JTextField tCode;
	private JTextField tName;
	private JTextField tAge;
	private JTextField tSex;
	private JTextField tPhone;
	private JTextField tAddr;
	private JTextField tYear;
	private JTextField tDepartment;
	private JTextField tSclass;
	private JTextField tRank;
	private JTextField tAincome;
	
	int index;
	String code=null, name=null, age=null, selectSex=null, phone=null, addr =null, year=null, department=null, sclass=null, rank=null, aincome=null;  
	public Edit(int index) {
		fe.getContentPane().setEnabled(false);
		fe.setTitle("����");
		fe.setSize(409, 470);
		fe.setLocation(550, 350);
		fe.setDefaultCloseOperation(fe.EXIT_ON_CLOSE);
		
		this.index = index - 1;//ù��° ����̸� �ε��� 0��°�� �����Ƿ� -1�� ���ش�.
		
		JLabel lblNewLabel = new JLabel("����");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 10, 47, 23);
		fe.getContentPane().add(lblNewLabel);
		//eCode.setBounds(275, 33, 105, 25);
		//fe.getContentPane().add(eCode);
		
		eName.setBounds(275, 63, 105, 25);
		fe.getContentPane().add(eName);
		
		eAge.setBounds(275, 93, 105, 25);
		fe.getContentPane().add(eAge);
		
		eSex.setBounds(275, 123, 105, 25);
		fe.getContentPane().add(eSex);
		
		ePhone.setBounds(275, 153, 105, 25);
		fe.getContentPane().add(ePhone);
		
		eAddr.setBounds(275, 183, 105, 25);
		fe.getContentPane().add(eAddr);
		
		eYear.setBounds(275, 213, 105, 25);
		fe.getContentPane().add(eYear);
		
		eDepartment.setBounds(275, 243, 105, 25);
		fe.getContentPane().add(eDepartment);
		
		eSclass.setBounds(275, 273, 105, 25);
		fe.getContentPane().add(eSclass);
		
		eRank.setBounds(275, 303, 105, 25);
		fe.getContentPane().add(eRank);
		
		eAincome.setBounds(275, 333, 105, 25);
		fe.getContentPane().add(eAincome);
		
		eConfirm.setBounds(61, 383, 105, 25);
		fe.getContentPane().add(eConfirm);
		
		eCancel.setBounds(218, 383, 105, 25);
		fe.getContentPane().add(eCancel);
		
		JLabel code = new JLabel("���� : ");
		code.setBounds(12, 43, 57, 15);
		fe.getContentPane().add(code);
		
		JLabel name = new JLabel("�̸� : ");
		name.setBounds(12, 73, 57, 15);
		fe.getContentPane().add(name);
		
		JLabel age = new JLabel("���� : ");
		age.setBounds(12, 103, 57, 15);
		fe.getContentPane().add(age);
		
		JLabel sex = new JLabel("���� : ");
		sex.setBounds(12, 133, 57, 15);
		fe.getContentPane().add(sex);
		
		JLabel phone = new JLabel("��ȭ��ȣ : ");
		phone.setBounds(12, 163, 83, 15);
		fe.getContentPane().add(phone);
		
		JLabel addr = new JLabel("�ּ� : ");
		addr.setBounds(12, 193, 57, 15);
		fe.getContentPane().add(addr);
		
		JLabel year = new JLabel("�Ի�⵵: ");
		year.setBounds(12, 223, 83, 15);
		fe.getContentPane().add(year);
		
		JLabel department = new JLabel("�μ� : ");
		department.setBounds(12, 253, 57, 15);
		fe.getContentPane().add(department);
		
		JLabel sclass = new JLabel("ȣ�� : ");
		sclass.setBounds(12, 283, 57, 15);
		fe.getContentPane().add(sclass);
		
		JLabel rank = new JLabel("���� : ");
		rank.setBounds(12, 313, 57, 15);
		fe.getContentPane().add(rank);
		
		JLabel aincome = new JLabel("���� : ");
		aincome.setBounds(12, 343, 57, 15);
		fe.getContentPane().add(aincome);
		
		tCode = new JTextField();
		tCode.setEditable(false);
		tCode.setColumns(10);
		tCode.setBounds(50, 40, 208, 21);
		fe.getContentPane().add(tCode);
		
		tName = new JTextField();
		tName.setEditable(false);
		tName.setColumns(10);
		tName.setBounds(50, 70, 208, 21);
		fe.getContentPane().add(tName);
		
		tAge = new JTextField();
		tAge.setEditable(false);
		tAge.setColumns(10);
		tAge.setBounds(50, 100, 208, 21);
		fe.getContentPane().add(tAge);
		
		tSex = new JTextField();
		tSex.setEditable(false);
		tSex.setColumns(10);
		tSex.setBounds(50, 130, 208, 21);
		fe.getContentPane().add(tSex);
		
		tPhone = new JTextField();
		tPhone.setEditable(false);
		tPhone.setColumns(10);
		tPhone.setBounds(73, 160, 185, 21);
		fe.getContentPane().add(tPhone);
		
		tAddr = new JTextField();
		tAddr.setEditable(false);
		tAddr.setColumns(10);
		tAddr.setBounds(50, 190, 208, 21);
		fe.getContentPane().add(tAddr);
		
		tYear = new JTextField();
		tYear.setEditable(false);
		tYear.setColumns(10);
		tYear.setBounds(73, 220, 185, 21);
		fe.getContentPane().add(tYear);
		
		tDepartment = new JTextField();
		tDepartment.setEditable(false);
		tDepartment.setColumns(10);
		tDepartment.setBounds(50, 250, 208, 21);
		fe.getContentPane().add(tDepartment);
		
		tSclass = new JTextField();
		tSclass.setEditable(false);
		tSclass.setColumns(10);
		tSclass.setBounds(50, 280, 208, 21);
		fe.getContentPane().add(tSclass);
		
		tRank = new JTextField();
		tRank.setEditable(false);
		tRank.setColumns(10);
		tRank.setBounds(50, 310, 208, 21);
		fe.getContentPane().add(tRank);
		
		tAincome = new JTextField();
		tAincome.setEditable(false);
		tAincome.setColumns(10);
		tAincome.setBounds(50, 340, 208, 21);
		fe.getContentPane().add(tAincome);
		
		tCode.setText(list.get(this.index).getCode());
		tName.setText(list.get(this.index).getName());
		tAge.setText(list.get(this.index).getAge());
		tSex.setText(list.get(this.index).getSex());
		tPhone.setText(list.get(this.index).getPhone());
		tAddr.setText(list.get(this.index).getAddr());
		tYear.setText(list.get(this.index).getYear());
		tDepartment.setText(list.get(this.index).getDepartment());
		tSclass.setText(list.get(this.index).getSclass());
		tRank.setText(list.get(this.index).getRank());
		tAincome.setText(list.get(this.index).getAincome());
	
		fe.setVisible(true);
		eName.addActionListener(this);
		eAge.addActionListener(this);
		eSex.addActionListener(this);
		ePhone.addActionListener(this);
		eAddr.addActionListener(this);
		eYear.addActionListener(this);
		eDepartment.addActionListener(this);
		eSclass.addActionListener(this);
		eRank.addActionListener(this);
		eAincome.addActionListener(this);
		eConfirm.addActionListener(this);
		eCancel.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		int check;
		if(e.getSource() == eName){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"ȸ�� �̸� : " + tName.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				name = JOptionPane.showInputDialog("������ �̸��� �Է��ϼ���", list.get(this.index).getName());
				tName.setText(name);
				if(name == null){
					tName.setText(list.get(this.index).getName());
				}
			}
		}else if(e.getSource() == eAge){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"ȸ�� ���� : " + tAge.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				age = JOptionPane.showInputDialog("������ ���̸� �Է��ϼ���", list.get(this.index).getAge());
				tAge.setText(age);
				if(age == null){
					tAge.setText(list.get(this.index).getAge());
				}
			}
		}else if(e.getSource() == eSex){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"ȸ�� ���� : " + tSex.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				String[] str = {"����", "����"};
				selectSex = (String)JOptionPane.showInputDialog(this, "������ ������ �Է��ϼ���\n" , "�޽���",
						JOptionPane.INFORMATION_MESSAGE,	null, str, str[0]);
				tSex.setText(selectSex);
				if(selectSex == null){
					tSex.setText(list.get(this.index).getSex());
				}
			}
		}else if(e.getSource() == ePhone){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"��ȭ��ȣ : " + tPhone.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				phone = JOptionPane.showInputDialog("������ ��ȭ��ȣ�� �Է��ϼ���", list.get(this.index).getPhone());
				tPhone.setText(phone);
				if(phone == null){
					tPhone.setText(list.get(this.index).getPhone());
				}
			}
		}else if(e.getSource() == eAddr){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"ȸ�� �ּ� : " + tAddr.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				addr = JOptionPane.showInputDialog("������ �ּҸ� �Է��ϼ���", list.get(this.index).getAddr());
				tAddr.setText(addr);
				if(addr == null){
					tAddr.setText(list.get(this.index).getAddr());
				}
			}
		}else if(e.getSource() == eYear){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"�Ի�⵵ : " + tYear.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				year = JOptionPane.showInputDialog("������ �Ի�⵵�� �Է��ϼ���", list.get(this.index).getYear());
				tYear.setText(year);
				if(year == null){
					tYear.setText(list.get(this.index).getYear());
				}
			}
		}else if(e.getSource() == eDepartment){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"�μ� : " + tDepartment.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				department = JOptionPane.showInputDialog("������ �μ��� �Է��ϼ���", list.get(this.index).getDepartment());
				tDepartment.setText(department);
				if(department == null){
					tDepartment.setText(list.get(this.index).getDepartment());
				}
			}
		}else if(e.getSource() == eSclass){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"ȣ�� : " + tSclass.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				sclass = JOptionPane.showInputDialog("������ ȣ���� �Է��ϼ���", list.get(this.index).getSclass());
				tSclass.setText(sclass);
				if(sclass == null){
					tSclass.setText(list.get(this.index).getSclass());
				}
			}
		}else if(e.getSource() == eRank){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"���� : " + tRank.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				rank = JOptionPane.showInputDialog("������ �̸��� �Է��ϼ���", list.get(this.index).getRank());
				tRank.setText(rank);
				if(rank == null){
					tRank.setText(list.get(this.index).getRank());
				}
			}
		}else if(e.getSource() == eAincome){
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + 
					"���� : " + tAincome.getText() ,"�޽���", JOptionPane.INFORMATION_MESSAGE );
			if(check ==0){
				aincome = JOptionPane.showInputDialog("������ ������ �Է��ϼ���", list.get(this.index).getAincome());
				tAincome.setText(aincome);
				if(aincome == null){
					tAincome.setText(list.get(this.index).getAincome());
				}
			}
		}
		
		if(e.getSource() == eConfirm){
			if( code != null){
				list.get(this.index).setCode(this.code);
			}
			if( name != null){
				list.get(this.index).setName(this.name);
			}
			if(age != null){
				list.get(this.index).setAge(this.age);
			}
			if(selectSex != null){
				list.get(this.index).setSex(this.selectSex);
			}
			if(phone != null){
				list.get(this.index).setPhone(this.phone);
			}
			if(addr != null){
				list.get(this.index).setAddr(this.addr);
			}
			if(year != null){
				list.get(this.index).setAddr(this.year);
			}
			if(department != null){
				list.get(this.index).setAddr(this.department);
			}
			if(sclass != null){
				list.get(this.index).setAddr(this.sclass);
			}
			if(rank != null){
				list.get(this.index).setAddr(this.rank);
			}
			if(aincome != null){
				list.get(this.index).setAddr(this.aincome);
			}
			fe.dispose();
			Managements m = new Managements();
		}else if(e.getSource() == eCancel){
			fe.dispose();
			Managements m = new Managements();
		}
	}
}
