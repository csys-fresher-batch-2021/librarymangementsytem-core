package in.chainsys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import in.chainsys.model.Member;
import in.chainsys.util.ConnectionUtil;

public class MemberDAO {

	private static final String ADDD_MEMBER = "INSERT INTO memberTable(member_id,memberName,memberNumber,memberJoiningDate,memberStatus)values(?,?,?,?,?)";
	private static final String DISPLAY_MEMBER = "SELECT * FROM memberTable";

	/**
	 * This Method is to Add Member.
	 * 
	 * @param Member
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void addMember(Member member) {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = ADDD_MEMBER;
			pst = connection.prepareStatement(sql);
			pst.setInt(1, member.getMmemberId());
			pst.setString(2, member.getMemberName());
			pst.setLong(3, member.getMemberNumber());
			pst.setObject(4, member.getMemberJoiningDate());
			pst.setString(5, member.getMemberStatus());
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}

	/**
	 * This Method is used to display member.
	 * 
	 * @param Member
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Member> displayallMember()throws ClassNotFoundException, SQLException {
		List<Member> memberList = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = DISPLAY_MEMBER;
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("member_id");
				String name = rs.getString("memberName");
				long number = rs.getLong("memberNumber");
				Date sqlDate = rs.getDate("memberJoiningDate");
				LocalDate date = sqlDate.toLocalDate();
				String status = rs.getString("memberStatus");
				Member member = new Member(id, name, number, date, status);
				memberList.add(member);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
		return memberList;
	}
	/**
	 * This Method calculates the number of rows in the table
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int tableSize() {
		int count =0;
		Connection connection = null;
		PreparedStatement pst =null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select count(*) from memberTable";
			pst = connection.prepareStatement(sql);
			rs=pst.executeQuery();
			rs.next();
			count= rs.getInt(1);
			}catch (ClassNotFoundException|SQLException e) {
				e.getMessage();
			}finally {
				ConnectionUtil.close(rs, pst, connection);
		}
		return count;
	}
}
