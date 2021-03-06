package in.chainsys.dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.chainsys.dao.MemberDAORaja;
import in.chainsys.exception.DbException;
import in.chainsys.model.MemberTable;
import in.chainsys.util.ConnectionUtil;

public class MemberImpDAO implements MemberDAORaja {
	private static final String INSERT_MEMBER_QUERY = "INSERT INTO MEMBER_TABLE (MEMBER_ID,MEMBER_NAME,MEMBER_MOBILE_NUMBER,MEMBER_JOINING_DATE , MEMBER_STATUS) values(?,?,?,?,?)";
	private static final String DISPLAY_ALL_MEMBER_QUERY = "SELECT * FROM MEMBER_TABLE";
	private static final String DELETE_MEMBER_QUERY = "DELETE FROM MEMBER_TABLE where MEMBER_ID = ?";

	/**
	 * This Method is to Add member.
	 * 
	 * @param member
	 * @throws ClassNotFoundException
	 * @throws DbException
	 */
	public static void addMember(MemberTable memberDetails) throws DbException {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			System.out.println(memberDetails);
			connection = ConnectionUtil.getConnection();
			String sql = INSERT_MEMBER_QUERY;
			pst = connection.prepareStatement(sql);
			pst.setInt(1, memberDetails.getMemberIdNumber());

			pst.setString(2, memberDetails.getMemberName());
			pst.setLong(3, memberDetails.getMobileNumber());

			pst.setDate(4, Date.valueOf(memberDetails.getMemberJoiningDate()));
			pst.setString(5, memberDetails.getStatus());
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new DbException("Can't insert user.");
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}

	public static List<MemberTable> getAllMembers() {
		List<MemberTable> memberList = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = DISPLAY_ALL_MEMBER_QUERY;
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int memberId = rs.getInt("MEMBER_ID");
				String memberName = rs.getString("MEMBER_NAME");
				long mobileNumber = rs.getLong("MEMBER_MOBILE_NUMBER");
				Date date = rs.getDate("MEMBER_JOINING_DATE");
				String status = rs.getString("MEMBER_STATUS");
				MemberTable memberTable = new MemberTable(memberId, memberName, mobileNumber, date, status);
				memberList.add(memberTable);

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
		return memberList;
	}

	public static void deleteMember(int MemberId) throws DbException {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = DELETE_MEMBER_QUERY;
			pst = connection.prepareStatement(sql);
			pst.setInt(1, MemberId);
			pst.executeUpdate();
		}

		catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
	}
}
