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

	// 전체리스트
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
			System.out.println("조회처리중에 에러가 발생했습니다.");
		} finally {
			close();
		}

		return students;
	}
	
	public Student select(int StdId) { // 한건조회는 조회 조건이 필요 = boardNo
		sql = "select * from student_info where std_id = " + StdId;
		conn = DBprogram.getConnection(); // 예외 처리
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

	// 입력
	public void insert(Student student) {
		conn = DBprogram.getConnection();
		sql = "insert into stduent_info values(" + student.getStdId() + ", '" + student.getStdName() + "'" + ", '"
				+ student.getAge() + "'" + ", '" + student.getStdPhone() + "'" + student.getStdScore() + "'" + ")";
		try {
			conn.createStatement(); // 예외 처리
			int r = stmt.executeUpdate(sql); // executeUpdate는 n건을 리턴
			System.out.println(r + "건 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 수정
	public void update(Student student) {
		conn = DBprogram.getConnection();
		sql = "update student_info set std_score = '" + student.getStdScore() + "' where std_id = " + student.getStdId();
		try {
			conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}
}
