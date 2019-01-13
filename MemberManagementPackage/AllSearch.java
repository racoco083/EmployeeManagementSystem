package MemberManagementPackage;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class AllSearch extends MemberManagements {
	private MyFrame fas = new MyFrame();
	private JTable table;
	public AllSearch() {
		fas.setTitle("전체 직원");
		fas.setSize(950, 448);
		fas.setLocation(350, 250);
		fas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		fas.getContentPane().setLayout(null);
		table = null;
		String[] column =  {
			"코드", "이름", "나이", "성별", "전화번호", "주소", "입사년도", "부서", "호봉", "직급", "연봉"
		};
		String[][] ob = new String[list.size()][11];
		for(int i=0; i<list.size(); i++){
				ob[i][0] = list.get(i).getCode();
				ob[i][1] = list.get(i).getName();
				ob[i][2] = list.get(i).getAge();
				ob[i][3] = list.get(i).getSex();
				ob[i][4] = list.get(i).getPhone();
				ob[i][5] = list.get(i).getAddr();
				ob[i][6] = list.get(i).getYear();
				ob[i][7] = list.get(i).getDepartment();
				ob[i][8] = list.get(i).getSclass();
				ob[i][9] = list.get(i).getRank();
				ob[i][10] = list.get(i).getAincome();
		}
		table= new JTable(ob, column);//표만들기
		//System.out.println(table);
		table.getColumn("코드").setPreferredWidth(50);
		table.getColumn("이름").setPreferredWidth(50);
		table.getColumn("나이").setPreferredWidth(50);
		table.getColumn("성별").setPreferredWidth(50);
		table.getColumn("전화번호").setPreferredWidth(100);
		table.getColumn("주소").setPreferredWidth(260);
		table.getColumn("입사년도").setPreferredWidth(50);
		table.getColumn("부서").setPreferredWidth(50);
		table.getColumn("호봉").setPreferredWidth(50);
		table.getColumn("직급").setPreferredWidth(50);
		table.getColumn("연봉").setPreferredWidth(50);
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		for(int i=0; i<tcm.getColumnCount(); i++){
			tcm.getColumn(i).setCellRenderer(dtcr);
		}
		
		table.setSize(910,387);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(910, 387);	
		scrollPane.setLocation(12, 10);
		scrollPane.setPreferredSize(new Dimension(369, 203));
		fas.getContentPane().add(scrollPane);
		
		fas.setVisible(true);
	}
}
