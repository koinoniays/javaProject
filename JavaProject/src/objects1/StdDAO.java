package objects1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StdDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// ��ü����Ʈ
	public Student[] studentList() {
		sql = "select * from student_info order by std_id desc";
		conn = DBprogram.getConnection();
		Student[] students = new Student[10];
		int i = 0;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Student std = new Student();
				std.setStdId(rs.getString("std_id"));
				std.setStdName(rs.getString("std_name"));
				std.setAge(rs.getInt("std_age"));
				std.setStdPhone(rs.getString("std_phone"));
				std.setStdScore(rs.getInt("std_score"));

				students[i++] = std;
			}

		} catch (SQLException e) {
			System.out.println("��ȸó���߿� ������ �߻��߽��ϴ�.");
		} finally {
			close();
		}

		return students;
	}
	
	public Student select(int StdId) { // �Ѱ���ȸ�� ��ȸ ������ �ʿ� = boardNo
		sql = "select * from student_info where std_id = " + StdId;
		conn = DBprogram.getConnection(); // ���� ó��
		Student std = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				std = new Student(rs.getString("std_id"), rs.getString("std_name"), 
						rs.getInt("std_age"), rs.getString("std_phone"), rs.getInt("std_score"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return std;
	}

	// �Է�
	public void insert(Student student) {
		conn = DBprogram.getConnection();
		sql = "insert into stduent_info values(" + student.getStdId() + ", '" + student.getStdName() + "'" + ", '"
				+ student.getAge() + "'" + ", '" + student.getStdPhone() + "'" + student.getStdScore() + "'" + ")";
		try {
			conn.createStatement(); // ���� ó��
			int r = stmt.executeUpdate(sql); // executeUpdate�� n���� ����
			System.out.println(r + "�� �ԷµǾ����ϴ�.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// ����
	public void update(Student student) {
		conn = DBprogram.getConnection();
		sql = "update student_info set std_score = '" + student.getStdScore() + "' where std_id = " + student.getStdId();
		try {
			conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "�� �����Ǿ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}
}
