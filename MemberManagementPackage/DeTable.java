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
		fdt.setTitle("부서별 직원");
		fdt.setSize(950, 448);
		fdt.setLocation(350, 250);
		fdt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		fdt.getContentPane().setLayout(null);
		dtable = null;
		String[] column =  {
				"코드", "이름", "나이", "성별", "전화번호", "주소", "입사년도", "부서", "호봉", "직급", "연봉"
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
			dtable= new JTable(ob,column);//표만들기
			//System.out.println(table);
			dtable.getColumn("코드").setPreferredWidth(50);
			dtable.getColumn("이름").setPreferredWidth(50);
			dtable.getColumn("나이").setPreferredWidth(50);
			dtable.getColumn("성별").setPreferredWidth(50);
			dtable.getColumn("전화번호").setPreferredWidth(100);
			dtable.getColumn("주소").setPreferredWidth(260);
			dtable.getColumn("입사년도").setPreferredWidth(50);
			dtable.getColumn("부서").setPreferredWidth(50);
			dtable.getColumn("호봉").setPreferredWidth(50);
			dtable.getColumn("직급").setPreferredWidth(50);
			dtable.getColumn("연봉").setPreferredWidth(50);
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
