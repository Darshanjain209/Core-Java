package in.co.rays.Project_4.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import in.co.rays.Project_4.Utility.ServletUtility;

/**
 * Welcome functionality Controller. Performs operation for Show Welcome page
 * @author  Darshan Jain 
 *
 */

/**
 * @author Darshan jain
 *
 */
@WebServlet(name = "WelcomeCtl", urlPatterns = { "/WelcomeCtl" })
public class WelcomeCtl extends BaseCtl {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The log. */
	private static Logger log = Logger.getLogger(WelcomeCtl.class);
	/**
	 * Contains Display logics.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException      Signals that an I/O exception has occurred.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("WelcomeCtl Method doGet Started");

		ServletUtility.forward(getView(), request, response);

		log.debug("WelcomeCtl Method doGet Ended");
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see in.co.rays.ors.controller.BaseCtl#getView()
	 */
	@Override
	protected String getView() {
		return ORSView.WELCOME_VIEW;
	}

}
