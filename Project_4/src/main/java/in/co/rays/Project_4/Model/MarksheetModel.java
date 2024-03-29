package in.co.rays.Project_4.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import in.co.rays.Project_4.Bean.MarksheetBean;
import in.co.rays.Project_4.Bean.StudentBean;
import in.co.rays.Project_4.Exception.ApplicationException;
import in.co.rays.Project_4.Exception.DatabaseException;
import in.co.rays.Project_4.Exception.DuplicateRecordException;
import in.co.rays.Project_4.Utility.JDBCDataSource;


/**
 * JDBC Implementation of Marksheet Model.
 * @author  Darshan Jain
 *
 */
public class MarksheetModel {

	    
		private static Logger log = Logger.getLogger(MarksheetModel.class);
		/**
	     * Find next PK of Marksheet
	     *
	     * @throws DatabaseException
	     */
		public Integer nextPK() throws DatabaseException {
			log.debug("Model NextPK Started");
			Connection conn = null;
			int pk = 0;

			try {
				conn = JDBCDataSource.getConnection();

				PreparedStatement pstmt = conn.prepareStatement("SELECT MAX(ID)FROM ST_MARKSHEET");
				ResultSet rs = pstmt.executeQuery();

				while (rs.next()) {
					pk = rs.getInt(1);
				}
				rs.close();
			} catch (Exception e) {
				log.error("Database Exception....", e);
				throw new DatabaseException("Exception : in getting nextPK");
			} finally {
				JDBCDataSource.closeConnection(conn);
			}

			log.debug("Model NextPK Ended");
			return pk + 1;

		}
		 /**
	     * Adds a Marksheet
	     *
	     * @param bean
	     * @throws DatabaseException
	     *
	     */
		public long add(MarksheetBean bean) throws ApplicationException, DuplicateRecordException {
			log.debug("Model Add Started");
			Connection conn = null;

			StudentModel sModel = new StudentModel();
			StudentBean studentBean = sModel.findByPK(bean.getStudentId());
			bean.setName(studentBean.getFirstname() + " " + studentBean.getLastName());

			MarksheetBean duplicateMarksheet = findByRollNo(bean.getRollNo());

			int pk = 0;

			if (duplicateMarksheet != null) {
				throw new DuplicateRecordException("Roll number Already Exists");
			}

			try {
				conn = JDBCDataSource.getConnection();
				pk = nextPK();
				conn.setAutoCommit(false);
				PreparedStatement pstmt = conn
						.prepareStatement("INSERT INTO ST_MARKSHEET VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				pstmt.setInt(1, pk);
				pstmt.setString(2, bean.getRollNo());
				pstmt.setLong(3, bean.getStudentId());
				pstmt.setString(4, bean.getName());
				pstmt.setInt(5, bean.getPhysics());
				pstmt.setInt(6, bean.getChemistry());
				pstmt.setInt(7, bean.getMaths());
				pstmt.setString(8, bean.getCreatedBy());
				pstmt.setString(9, bean.getModifiedBy());
				pstmt.setTimestamp(10, bean.getCreatedDateTime());
				pstmt.setTimestamp(11, bean.getModifiedDateTime());

				pstmt.executeUpdate();
				conn.commit();
				pstmt.close();
			} catch (Exception e) {
				log.error("Database Exception...", e);

				try {
					conn.rollback();
				} catch (SQLException e1) {
					throw new ApplicationException("Exception : add rollback exception " + e1.getMessage());
				}
				throw new ApplicationException("Exception : in add marksheet");
			} finally {
				JDBCDataSource.closeConnection(conn);
			}
			log.debug("Model Add Marksheet Ended");
			return pk;

		}
	    /**
	     * Finds Marksheet by Roll No
	     *
	     * @param rollNo
	     *            : get parameter
	     * @return bean
	     * @throws DuplicateRecordException
	     */
		public MarksheetBean findByRollNo(String rollno) throws ApplicationException {
			log.debug("Model Find By Rollno Started");
			StringBuffer sql = new StringBuffer("SELECT * FROM ST_MARKSHEET WHERE ROLL_NO=?");

			MarksheetBean bean = null;
			Connection conn = null;

			try {
				conn = JDBCDataSource.getConnection();

				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				pstmt.setString(1, rollno);

				ResultSet rs = pstmt.executeQuery();

				while (rs.next()) {
					bean = new MarksheetBean();

					bean.setId(rs.getLong(1));
					bean.setRollNo(rs.getString(2));
					bean.setStudentId(rs.getLong(3));
					bean.setName(rs.getString(4));
					bean.setPhysics(rs.getInt(5));
					bean.setChemistry(rs.getInt(6));
					bean.setMaths(rs.getInt(7));
					bean.setCreatedBy(rs.getString(8));
					bean.setModifiedBy(rs.getString(9));
					bean.setCreatedDateTime(rs.getTimestamp(10));
					bean.setModifiedDateTime(rs.getTimestamp(11));
				}
				rs.close();
			} catch (Exception e) {
				log.error("Database Exception...", e);
				throw new ApplicationException("Exception : in getting find by Roll no");
			} finally {
				JDBCDataSource.closeConnection(conn);
			}
			log.debug("Model Find By Roll No Ended");
			return bean;
		}
		/**
	     * Deletes a Marksheet
	     *
	     * @param bean
	     * @throws DatabaseException
	     */
		public void delete(MarksheetBean bean) throws ApplicationException {
			log.debug("Model Delete Started");
			Connection conn = null;

			try {
				conn = JDBCDataSource.getConnection();
				conn.setAutoCommit(false);
				PreparedStatement pstmt = conn.prepareStatement("DELETE FROM ST_MARKSHEET WHERE ID=?");
				pstmt.setLong(1, bean.getId());
				pstmt.executeUpdate();
				conn.commit();
				pstmt.close();
			} catch (Exception e) {
				log.error("Database Exception...", e);

				try {
					conn.rollback();
				} catch (SQLException e1) {
					throw new ApplicationException("Exception : delete rollback " + e1.getMessage());
				}
				throw new ApplicationException("Exception : in deleting");
			} finally {
				JDBCDataSource.closeConnection(conn);
			}

			log.debug("Model Delete Ended");
		}
		   /**
	     * Finds Marksheet by PK
	     *
	     * @param pk
	     *            : get parameter
	     * @return bean
	     * @throws DatabaseException
	     */
		public MarksheetBean findByPK(long pk) throws ApplicationException {
			log.debug("Model Find By PK Started");

			StringBuffer sql = new StringBuffer("SELECT * FROM ST_MARKSHEET WHERE ID=?");
			MarksheetBean bean = null;
			Connection conn = null;

			try {
				conn = JDBCDataSource.getConnection();

				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				pstmt.setLong(1, pk);

				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					bean = new MarksheetBean();

					bean.setId(rs.getInt(1));
					bean.setRollNo(rs.getString(2));
					bean.setStudentId(rs.getLong(3));
					bean.setName(rs.getString(4));
					bean.setPhysics(rs.getInt(5));
					bean.setChemistry(rs.getInt(6));
					bean.setMaths(rs.getInt(7));
					bean.setCreatedBy(rs.getString(8));
					bean.setModifiedBy(rs.getString(9));
					bean.setCreatedDateTime(rs.getTimestamp(10));
					bean.setModifiedDateTime(rs.getTimestamp(11));

				}
				rs.close();
			} catch (Exception e) {
				log.error("Database Exception...", e);
				throw new ApplicationException("Exception : in getting marksheet by PK");
			} finally {
				JDBCDataSource.closeConnection(conn);
			}
			log.debug("Model Find by Pk Ended");
			return bean;
		}
		  /**
	     * Updates a Marksheet
	     *
	     * @param bean
	     * @throws DatabaseException
	     */
		public void update(MarksheetBean bean) throws ApplicationException, DuplicateRecordException {
			log.debug("Model Update Started");

			Connection conn = null;

			MarksheetBean beanExists = findByRollNo(bean.getRollNo());

			if (beanExists != null && beanExists.getId() != bean.getId()) {
				throw new DuplicateRecordException("Roll No Already Exists");
			}

			StudentModel sModel = new StudentModel();
			StudentBean studentBean = sModel.findByPK(bean.getStudentId());
			bean.setName(studentBean.getFirstname() + " " + studentBean.getLastName());

			try {
				conn = JDBCDataSource.getConnection();
				conn.setAutoCommit(false);
				PreparedStatement pstmt = conn.prepareStatement(
						"UPDATE ST_MARKSHEET SET ROLL_NO=?, STUDENT_ID=?, NAME=?, PHYSICS=?, CHEMISTRY=?, MATHS=?, CREATED_BY=?, MODIFIED_BY=?, CREATED_DATETIME=?, MODIFIED_DATETIME=? WHERE ID=?");
				pstmt.setString(1, bean.getRollNo());
				pstmt.setLong(2, bean.getStudentId());
				pstmt.setString(3, bean.getName());
				pstmt.setInt(4, bean.getPhysics());
				pstmt.setInt(5, bean.getChemistry());
				pstmt.setInt(6, bean.getMaths());
				pstmt.setString(7, bean.getCreatedBy());
				pstmt.setString(8, bean.getModifiedBy());
				pstmt.setTimestamp(9, bean.getCreatedDateTime());
				pstmt.setTimestamp(10, bean.getModifiedDateTime());
				pstmt.setLong(11, bean.getId());

				pstmt.executeUpdate();

				conn.commit();
				pstmt.close();
			} catch (Exception e) {
				log.error("Database Exception...", e);
				throw new ApplicationException("Exception : in updating marksheet");

			} finally {
				JDBCDataSource.closeConnection(conn);
			}
			log.debug("Model Update Ended");
		}
		   /**
	     * Searches Marksheet
	     *
	     * @param bean
	     *            : Search Parameters
	     * @throws DatabaseException
	     */
		public List search(MarksheetBean bean) throws ApplicationException {
			return search(bean, 0, 0);
		}
		  /**
	     * Searches Marksheet with pagination
	     *
	     * @return list : List of Marksheets
	     * @param bean
	     *            : Search Parameters
	     * @param pageNo
	     *            : Current Page No.
	     * @param pageSize
	     *            : Size of Page
	     *
	     * @throws DatabaseException
	     */
		public List search(MarksheetBean bean, int pageNo, int pageSize) throws ApplicationException {
			log.debug("Model Search Started");

			StringBuffer sql = new StringBuffer("SELECT * FROM ST_MARKSHEET WHERE TRUE ");

			if (bean != null) {
				if (bean.getId() > 0) {
					sql.append("AND ID=" + bean.getId());
				}
				if (bean.getRollNo() != null && bean.getRollNo().length() > 0) {
					sql.append("AND ROLL_NO LIKE '" + bean.getRollNo() + "%'");
				}
				if (bean.getName() != null && bean.getName().length() > 0) {
					sql.append("AND NAME LIKE '" + bean.getName() + "%'");
				}
				if (bean.getPhysics() != null && bean.getPhysics() > 0) {
					sql.append("AND PHYSICS=" + bean.getPhysics());
				}
				if (bean.getChemistry() != null && bean.getChemistry() > 0) {
					sql.append("AND CHEMISTRY=" + bean.getChemistry());
				}
				if (bean.getMaths() != null && bean.getMaths() > 0) {
					sql.append("AND MATHS=" + bean.getMaths());
				}
				if (bean.getTotal() != 0 && bean.getTotal() > 0) {
					sql.append("AND (physics + chemistry + maths) =" + bean.getTotal());
				}
			}
			if (pageSize > 0) {
				pageNo = (pageNo - 1) * pageSize;

				sql.append(" LIMIT " + pageNo + "," + pageSize);
			}

			ArrayList list = new ArrayList();
			Connection conn = null;

			try {
				conn = JDBCDataSource.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				ResultSet rs = pstmt.executeQuery();

				while (rs.next()) {
					bean = new MarksheetBean();

					bean.setId(rs.getLong(1));
					bean.setRollNo(rs.getString(2));
					bean.setStudentId(rs.getLong(3));
					bean.setName(rs.getString(4));
					bean.setPhysics(rs.getInt(5));
					bean.setChemistry(rs.getInt(6));
					bean.setMaths(rs.getInt(7));
					bean.setCreatedBy(rs.getString(8));
					bean.setModifiedBy(rs.getString(9));
					bean.setCreatedDateTime(rs.getTimestamp(10));
					bean.setModifiedDateTime(rs.getTimestamp(11));

					list.add(bean);
				}
				rs.close();
			} catch (Exception e) {
				log.error("Database Exception...", e);
				throw new ApplicationException("Exception : in search");
			} finally {
				JDBCDataSource.closeConnection(conn);
			}
			log.debug("Model Search Ended");
			return list;
		}
		 /**
	     * Gets List of Marksheet
	     *
	     * @return list : List of Marksheets
	     * @throws DatabaseException
	     */
		public List list() throws ApplicationException {
			return list(0, 0);
		}
		 /**
	     * get List of Marksheet with pagination
	     *
	     * @return list : List of Marksheets
	     * @param pageNo
	     *            : Current Page No.
	     * @param pageSize
	     *            : Size of Page
	     * @throws DatabaseException
	     */
		public List list(int pageNo, int pageSize) throws ApplicationException {
			log.debug("Model List Started");
			ArrayList list = new ArrayList();

			StringBuffer sql = new StringBuffer("SELECT * FROM ST_MARKSHEET");
			if (pageSize > 0) {
				pageNo = (pageNo - 1) * pageSize;

				sql.append(" LIMIT " + pageNo + "," + pageSize);
			}

			Connection conn = null;

			try {
				conn = JDBCDataSource.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				ResultSet rs = pstmt.executeQuery();

				while (rs.next()) {
					MarksheetBean bean = new MarksheetBean();

					bean.setId(rs.getLong(1));
					bean.setRollNo(rs.getString(2));
					bean.setStudentId(rs.getLong(3));
					bean.setName(rs.getString(4));
					bean.setPhysics(rs.getInt(5));
					bean.setChemistry(rs.getInt(6));
					bean.setMaths(rs.getInt(7));
					bean.setCreatedBy(rs.getString(8));
					bean.setModifiedBy(rs.getString(9));
					bean.setCreatedDateTime(rs.getTimestamp(10));
					bean.setModifiedDateTime(rs.getTimestamp(11));

					list.add(bean);
				}
				rs.close();
			} catch (Exception e) {
				log.error("Database Exception.....", e);
				throw new ApplicationException("Exception : in getting list");
			} finally {
				JDBCDataSource.closeConnection(conn);
			}
			log.debug("Model List Ended");
			return list;

		}
		/**
	     * get Merit List of Marksheet with pagination
	     *
	     * @return list : List of Marksheets
	     * @param pageNo
	     *            : Current Page No.
	     * @param pageSize
	     *            : Size of Page
	     * @throws DatabaseException
	     */
		public List getMeritList(int pageNo, int pageSize) throws ApplicationException {
			log.debug("Model get merit list started");

			ArrayList list = new ArrayList();
			StringBuffer sql = new StringBuffer(
					"SELECT ID, ROLL_NO, NAME, PHYSICS, CHEMISTRY, MATHS, (PHYSICS+CHEMISTRY+MATHS)AS TOTAL FROM ST_MARKSHEET ORDER BY TOTAL DESC");

			if (pageSize > 0) {
				pageNo = (pageNo - 1) * pageSize;

				sql.append(" LIMIT " + pageNo + "," + pageSize);
			}

			Connection conn = null;

			try {
				conn = JDBCDataSource.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());

				ResultSet rs = pstmt.executeQuery();

				while (rs.next()) {
					MarksheetBean bean = new MarksheetBean();

					bean.setId(rs.getLong(1));
					bean.setRollNo(rs.getString(2));
					bean.setName(rs.getString(3));
					bean.setPhysics(rs.getInt(4));
					bean.setChemistry(rs.getInt(5));
					bean.setMaths(rs.getInt(6));

					list.add(bean);
				}
				rs.close();
			} catch (Exception e) {
				log.error("Database Exception...", e);
				throw new ApplicationException("Exception : in getting merit list");
			} finally {
				JDBCDataSource.closeConnection(conn);
			}
			log.debug("Model get merit list ended");
			return list;
		}
	}

