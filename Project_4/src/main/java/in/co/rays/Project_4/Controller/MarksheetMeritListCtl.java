package in.co.rays.Project_4.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import in.co.rays.Project_4.Bean.BaseBean;
import in.co.rays.Project_4.Bean.MarksheetBean;
import in.co.rays.Project_4.Exception.ApplicationException;
import in.co.rays.Project_4.Model.MarksheetModel;
import in.co.rays.Project_4.Utility.DataUtility;
import in.co.rays.Project_4.Utility.PropertyReader;
import in.co.rays.Project_4.Utility.ServletUtility;

/**
 *Marksheet Merit List functionality Controller. Performance operation of
* Marksheet Merit List
 * 
 * @author  Darshan Jain
 *
 */
@WebServlet(name = "MarksheetMeritListCtl", urlPatterns = { "/ctl/MarksheetMeritListCtl" })
public class MarksheetMeritListCtl extends BaseCtl {
	private static Logger log = Logger.getLogger(MarksheetMeritListCtl.class);
	/* (non-Javadoc)
     * @see in.co.rays.ors.controller.BaseCtl#populateBean(javax.servlet.http.HttpServletRequest)
     */
	@Override
	protected BaseBean populateBean(HttpServletRequest request) {
		MarksheetBean bean = new MarksheetBean();

		return bean;
	}
	/**
     * Contains Display logics.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		log.debug("MarksheetMeritListCtl doGet Start");

		int pageNo = 1;

		int pageSize = DataUtility.getInt(PropertyReader.getValue("page.size"));

		MarksheetBean bean = (MarksheetBean) populateBean(request);

		String op = DataUtility.getString(request.getParameter("operation"));

		MarksheetModel model = new MarksheetModel();
		List list = null;
		try {
			list = model.getMeritList(pageNo, pageSize);
			ServletUtility.setList(list, request);
			if (list == null || list.size() == 0) {
				ServletUtility.setErrorMessage("No record found ", request);
			}
			ServletUtility.setList(list, request);
			ServletUtility.setPageNo(pageNo, request);
			ServletUtility.setPageSize(pageSize, request);
			ServletUtility.forward(ORSView.MARKSHEET_MERIT_LIST_VIEW, request, response);
		} catch (ApplicationException e) {
			log.error(e);
			ServletUtility.handleException(e, request, response);
			return;
		}
		log.debug("MarksheetMeritListCtl doGet End");
	}
	/**
     * Contains Submit logics.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("MarksheetMeritListCtl doGet Start");
		List list = null;
		int pageNo = DataUtility.getInt(request.getParameter("pageNo"));
		int pageSize = DataUtility.getInt(request.getParameter("pageSize"));
		pageNo = (pageNo == 0) ? 1 : pageNo;
		pageSize = (pageSize == 0) ? DataUtility.getInt(PropertyReader.getValue("page.size")) : pageSize;
		MarksheetBean bean = (MarksheetBean) populateBean(request);
		String op = DataUtility.getString(request.getParameter("operation"));
		MarksheetModel model = new MarksheetModel();
		try {
			if (OP_BACK.equalsIgnoreCase(op)) {
				ServletUtility.redirect(ORSView.WELCOME_CTL, request, response);
				return;
			}
			list = model.getMeritList(pageNo, pageSize);
			ServletUtility.setList(list, request);
			if (list == null || list.size() == 0) {
				ServletUtility.setErrorMessage("No record found ", request);
			}
			ServletUtility.setList(list, request);
			ServletUtility.setPageNo(pageNo, request);
			ServletUtility.setPageSize(pageSize, request);
			ServletUtility.forward(ORSView.MARKSHEET_MERIT_LIST_VIEW, request, response);
		} catch (ApplicationException e) {
			log.error(e);
			ServletUtility.handleException(e, request, response);
			return;
		}
		log.debug("MarksheetMeritListCtl doPost End");
	}
	/* (non-Javadoc)
     * @see in.co.rays.ors.controller.BaseCtl#getView()
     */
	@Override
	protected String getView() {
		return ORSView.MARKSHEET_MERIT_LIST_VIEW;
	}
}
