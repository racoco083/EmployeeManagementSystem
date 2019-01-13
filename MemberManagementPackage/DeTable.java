package MemberManagementPackage;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class DeTable extends MemberManagements{
	MyFrame fdt = new MyFrame();
	JTable dtable;
	public DeTable(){
		fdt.setTitle("�μ��� ����");
		fdt.setSize(950, 448);
		fdt.setLocation(350, 250);
		fdt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		fdt.getContentPane().setLayout(null);
		dtable = null;
		String[] column =  {
				"�ڵ�", "�̸�", "����", "����", "��ȭ��ȣ", "�ּ�", "�Ի�⵵", "�μ�", "ȣ��", "����", "����"
			};
			Object[][] ob = new Object[DeSearch.lga.size()][11];
			for(int i=0; i<DeSearch.lga.size(); i++){
					ob[i][0] = list.get(DeSearch.lga.get(i)).getCode();
					ob[i][1] = list.get(DeSearch.lga.get(i)).getName();
					ob[i][2] = list.get(DeSearch.lga.get(i)).getAge();
					ob[i][3] = list.get(DeSearch.lga.get(i)).getSex();
					ob[i][4] = list.get(DeSearch.lga.get(i)).getPhone();
					ob[i][5] = list.get(DeSearch.lga.get(i)).getAddr();
					ob[i][6] = list.get(DeSearch.lga.get(i)).getYear();
					ob[i][7] = list.get(DeSearch.lga.get(i)).getDepartment();
					ob[i][8] = list.get(DeSearch.lga.get(i)).getSclass();
					ob[i][9] = list.get(DeSearch.lga.get(i)).getRank();
					ob[i][10] = list.get(DeSearch.lga.get(i)).getAincome();
			}
			dtable= new JTable(ob,column);//ǥ�����
			//System.out.println(table);
			dtable.getColumn("�ڵ�").setPreferredWidth(50);
			dtable.getColumn("�̸�").setPreferredWidth(50);
			dtable.getColumn("����").setPreferredWidth(50);
			dtable.getColumn("����").setPreferredWidth(50);
			dtable.getColumn("��ȭ��ȣ").setPreferredWidth(100);
			dtable.getColumn("�ּ�").setPreferredWidth(260);
			dtable.getColumn("�Ի�⵵").setPreferredWidth(50);
			dtable.getColumn("�μ�").setPreferredWidth(50);
			dtable.getColumn("ȣ��").setPreferredWidth(50);
			dtable.getColumn("����").setPreferredWidth(50);
			dtable.getColumn("����").setPreferredWidth(50);
			DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
			dtcr.setHorizontalAlignment(SwingConstants.CENTER);
			TableColumnModel tcm = dtable.getColumnModel();
			for(int i=0; i<tcm.getColumnCount(); i++){
				tcm.getColumn(i).setCellRenderer(dtcr);
			}
			
			dtable.setSize(910,387);
			
			JScrollPane scrollPane = new JScrollPane(dtable);
			scrollPane.setSize(910, 387);	
			scrollPane.setLocation(12, 10);
			scrollPane.setPreferredSize(new Dimension(369, 203));
			fdt.getContentPane().add(scrollPane);
			fdt.setVisible(true);
	}
}
