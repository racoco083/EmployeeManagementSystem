package MemberManagementPackage;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

public class MemberSearch extends MemberManagements implements ActionListener {
	private MyFrame fms = new MyFrame();
	private JButton sCode = new JButton("����");
	private JButton sName = new JButton("���� �̸�");
	private JButton sPhone = new JButton("��ȭ ��ȣ");
	private JButton dAll = new JButton("�μ���");
	private JButton sAll = new JButton("��ü ����");
	private JButton sCancel = new JButton("���");
	private JTextArea textArea = new JTextArea();
	public MemberSearch(){
		fms.setTitle("�����˻�");
		fms.setSize(477, 333);
		fms.setLocation(550, 350);
		fms.setDefaultCloseOperation(fms.EXIT_ON_CLOSE);
	
		JLabel lblNewLabel = new JLabel("�˻�");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel.setBounds(354, 3, 43, 32);
		fms.getContentPane().add(lblNewLabel);
		
		sCode.setBounds(354, 40, 95, 32);
		fms.getContentPane().add(sCode);
		
		sName.setBounds(354, 82, 95, 32);
		fms.getContentPane().add(sName);
		
		sPhone.setBounds(354, 124, 95, 32);
		fms.getContentPane().add(sPhone);
		
		dAll.setBounds(354, 166, 95, 32);
		fms.getContentPane().add(dAll);
		
		sAll.setBounds(354, 206, 95, 32);
		fms.getContentPane().add(sAll);
		
		sCancel.setBounds(354, 246, 95, 32);
		fms.getContentPane().add(sCancel);
		
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setSize(327, 270);	
		scrollPane.setLocation(12, 10);
		fms.getContentPane().add(scrollPane);
		
		JList list_1 = new JList();
		list_1.setBounds(242, 48, 1, 1);
		fms.getContentPane().add(list_1);
		
		fms.setVisible(true);
		
		sCode.addActionListener(this);
		System.out.println(this);
		sName.addActionListener(this);
		sPhone.addActionListener(this);
		dAll.addActionListener(this);
		sAll.addActionListener(this);
		sCancel.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		int dataCnt=1;
		String[] nameCollection = null;
		String nameCode =null;
		if(e.getSource() == sCode){
			String code = JOptionPane.showInputDialog("�˻��� �ڵ��� �Է��ϼ���");
			if(code == null){
				return;
			}
			if(list.size() != 0){
				for(int i=0; i<list.size(); i++){
					if(code.equals(list.get(i).getCode())){
						textArea.setText("���� ��ȣ : " + list.get(i).getCode()
								+ "\n\n���� �̸� : " + list.get(i).getName()
								+ "\n\n���� ���� : " + list.get(i).getAge()
								+ "\n\n���� ���� : " + list.get(i).getSex()
								+ "\n\n���� ��ȭ��ȣ : " + list.get(i).getPhone()
								+ "\n\n���� �ּ� : " + list.get(i).getAddr()
								+ "\n\n���� �Ի�⵵ : " + list.get(i).getYear()
								+ "\n\n���� �μ� : " + list.get(i).getDepartment()
								+ "\n\n���� ȣ�� : " + list.get(i).getSclass()
								+ "\n\n���� ���� : " + list.get(i).getRank()
								+ "\n\n���� ���� : " + list.get(i).getAincome());
						break;
					}
					dataCnt++; //��ġ�ϴ� ������ ������ �˱� ���ؼ�
				}
				if(dataCnt == list.size()+1){
					JOptionPane.showMessageDialog(this, "��ġ�ϴ� ������ �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}	
			}else{
				JOptionPane.showMessageDialog(this, "��ϵ� ������ �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource() == sName){
			int cnt = 0;
			String name = JOptionPane.showInputDialog("�˻��� �̸��� �Է��ϼ���");
			if(name == null){
				return;
			}
			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						cnt++;
					}
				}
				if (cnt > 1) {
					nameCollection = new String[cnt];
					int namecnt = 0;
					for (int i = 0; i < list.size(); i++) {
						if (name.equals(list.get(i).getName())) {
							nameCollection[namecnt] = list.get(i).getCode()
									+ ". " + list.get(i).getName() + " "
									+ list.get(i).getPhone();
							namecnt++;
						}
					}
					nameCode = (String) JOptionPane.showInputDialog(this,
							"���� �̸��� �����մϴ�.\n", "�޽���",
							JOptionPane.INFORMATION_MESSAGE, null,
							nameCollection, nameCollection[0]);
					if (nameCode == null) {
						return;
					}
					nameCode = nameCode.substring(0, 4);
					for (int i = 0; i < list.size(); i++) {
						if ((nameCode.equals(list.get(i).getCode()))) {
							textArea.setText("���� �ڵ� : " + list.get(i).getCode()
									+ "\n\n���� �̸� : " + list.get(i).getName()
									+ "\n\n���� ���� : " + list.get(i).getAge()
									+ "\n\n���� ���� : " + list.get(i).getSex()
									+ "\n\n���� ��ȭ��ȣ : " + list.get(i).getPhone()
									+ "\n\n���� �ּ� : " + list.get(i).getAddr()
									+ "\n\n���� �Ի�⵵ : " + list.get(i).getYear()
									+ "\n\n���� �μ� : " + list.get(i).getDepartment()
									+ "\n\n���� ȣ�� : " + list.get(i).getSclass()
									+ "\n\n���� ���� : " + list.get(i).getRank()
									+ "\n\n���� ���� : " + list.get(i).getAincome());
						}
					}
				} else {
					for (int i = 0; i < list.size(); i++) {
						if (name.equals(list.get(i).getName())) {
							textArea.setText("���� ��ȣ : " + list.get(i).getCode()
									+ "\n\n���� �̸� : " + list.get(i).getName()
									+ "\n\n���� ���� : " + list.get(i).getAge()
									+ "\n\n���� ���� : " + list.get(i).getSex()
									+ "\n\n���� ��ȭ��ȣ : " + list.get(i).getPhone()
									+ "\n\n���� �ּ� : " + list.get(i).getAddr()
									+ "\n\n���� �Ի�⵵ : " + list.get(i).getYear()
									+ "\n\n���� �μ� : " + list.get(i).getDepartment()
									+ "\n\n���� ȣ�� : " + list.get(i).getSclass()
									+ "\n\n���� ���� : " + list.get(i).getRank()
									+ "\n\n���� ���� : " + list.get(i).getAincome());
							break;
						}
						dataCnt++;
					}
					if(dataCnt == list.size()+1){
						JOptionPane.showMessageDialog(this, "��ġ�ϴ� ������ �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}else{
				JOptionPane.showMessageDialog(this, "��ϵ� ������ �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource() == sPhone){
			String phone = JOptionPane.showInputDialog("�˻��� ��ȭ��ȣ�� �Է��ϼ���");
			if(phone == null){
				return;
			}
			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					if (phone.equals(list.get(i).getPhone())) {
						textArea.setText("���� ��ȣ : " + list.get(i).getCode()
								+ "\n\n���� �̸� : " + list.get(i).getName()
								+ "\n\n���� ���� : " + list.get(i).getAge()
								+ "\n\n���� ���� : " + list.get(i).getSex()
								+ "\n\n���� ��ȭ��ȣ : " + list.get(i).getPhone()
								+ "\n\n���� �ּ� : " + list.get(i).getAddr()
								+ "\n\n���� �Ի�⵵ : " + list.get(i).getYear()
								+ "\n\n���� �μ� : " + list.get(i).getDepartment()
								+ "\n\n���� ȣ�� : " + list.get(i).getSclass()
								+ "\n\n���� ���� : " + list.get(i).getRank()
								+ "\n\n���� ���� : " + list.get(i).getAincome());
						break;
					}
					dataCnt++;
				}
				if(dataCnt == list.size()+1){
					JOptionPane.showMessageDialog(this, "��ġ�ϴ� ������ �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}
			} else{
				JOptionPane.showMessageDialog(this, "��ϵ� ������ �����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource() == dAll){
			fms.dispose();
			DeSearch dall = new DeSearch();	
		}else if(e.getSource() == sAll){
			AllSearch sall = new AllSearch();
		}else if(e.getSource() == sCancel){
			fms.dispose();
			super.MmStart();
		}
	}
}
