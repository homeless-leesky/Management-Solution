package modeler;

public class InsertManager extends DataBaseModeler {    //ȸ�������Ҷ� ������ ������ DB�� �Ѱ��ִ� Ŭ����
	public void insert(ManagerEntitiy manager) {
		connect();
		try {
			String sql="insert into nike_account_tbl values(?, ?, ?, ?)";
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, manager.getId());
			pstmt.setString(2, manager.getPassword());
			pstmt.setString(3, manager.getName());
			pstmt.setString(4, manager.getAddress());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
}
