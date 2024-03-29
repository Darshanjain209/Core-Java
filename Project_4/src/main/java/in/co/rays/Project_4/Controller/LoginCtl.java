package in.co.rays.Project_4.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import in.co.rays.Project_4.Bean.BaseBean;
import in.co.rays.Project_4.Bean.RoleBean;
import in.co.rays.Project_4.Bean.UserBean;
import in.co.rays.Project_4.Exception.ApplicationException;
import in.co.rays.Project_4.Model.RoleModel;
import in.co.rays.Project_4.Model.UserModel;
import in.co.rays.Project_4.Utility.DataUtility;
import in.co.rays.Project_4.Utility.DataValidator;
import in.co.rays.Project_4.Utility.PropertyReader;
import in.co.rays.Project_4.Utility.ServletUtility;

/**
 * Servlet implementation class LoginCtl
 * @author  Darshan Jain
 *
 */
@WebServlet(name = "LoginCtl", urlPatterns = { "/LoginCtl" })
public class LoginCtl extends BaseCtl {
	private static final long serialVersionUID = 1L;
	public static final String OP_REGISTER = "Register";
	public static final String OP_SIGN_IN = "SignIn";
	public static final String OP_SIGN_UP = "SignUp";
	public static final String OP_LOG_OUT = "logout";

	private static Logger log = Logger.getLogger(LoginCtl.class);

	@Override
	protected boolean validate(HttpServletRequest request) {
		// System.out.println("loginctl validate");
		log.debug("LoginCtl Method validate Started");
        System.out.println("loginctl method started");
		boolean pass = true;

		String op = request.getParameter("operation");
		System.out.println(op);
		
		if (OP_SIGN_UP.equals(op) || OP_LOG_OUT.equals(op)) {
			System.out.println(op);
			return pass;
		}

		String login = request.getParameter("login");
		System.out.println(login);
		

		if (DataValidator.isNull(login)) {
			// System.out.println("loginctl id null");
			request.setAttribute("login", PropertyReader.getValue("error.require", "Login ID "));
			pass = false;
		} else if (!DataValidator.isEmail(login)) {
			// System.out.println("loginctl id not email");
			request.setAttribute("login", PropertyReader.getValue("error.email", "Login "));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("password"))) {
			// System.out.println("loginctl password");
			request.setAttribute("password", PropertyReader.getValue("error.require", "Password "));
			pass = false;
		}

		log.debug("LoginCtl Method validate Ended");

		return pass;
	}

	@Override
	protected BaseBean populateBean(HttpServletRequest request) {

		log.debug("LoginCtl Method populatebean Started");
		// System.out.println("BaseBean Populatebean");

		UserBean bean = new UserBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));// get kiya loginctl
		bean.setLogin(DataUtility.getString(request.getParameter("login")));
		bean.setPassword(DataUtility.getString(request.getParameter("password")));

		log.debug("LoginCtl Method populatebean Ended");

		return bean;
	}
	/**
	 * Display Login form
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("Lctl Do post");
		HttpSession session = request.getSession(false);
		String op = DataUtility.getString(request.getParameter("operation"));
		System.out.println(op);

		if (OP_LOG_OUT.equals(op) && !OP_SIGN_IN.equals(op)) {
			// System.out.println("Do log out chal rha h");

			session.invalidate();
			ServletUtility.setSuccessMessage("User Logout Succesfully", request);
			ServletUtility.forward(getView(), request, response);
			return;
		}
		// System.out.println("Do get chalega");
		ServletUtility.forward(getView(), request, response);

	}
	/**
	 * Submitting or login action performing
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		System.out.println("login ctl do post started");
		HttpSession session = request.getSession(true);
		log.debug(" Method doPost Started");

		String op = DataUtility.getString(request.getParameter("operation"));
		System.out.println(op);

		UserModel model = new UserModel();
		RoleModel role = new RoleModel();

		long id = DataUtility.getLong(request.getParameter("id"));

		if (OP_SIGN_IN.equalsIgnoreCase(op)){
			//System.out.println(" Lctl Do post 1354353");
			UserBean bean = (UserBean) populateBean(request);

			try {

				bean = model.authenticate(bean.getLogin(),bean.getPassword());
				String str = request.getParameter("URI");

				if (bean != null) {
					session.setAttribute("user", bean);
					// System.out.println("name " +bean.getFirstName());

					long rollId = bean.getRoleId();

					RoleBean rolebean = role.findByPK(rollId);

					if (rolebean != null){
						session.setAttribute("role", rolebean.getName());
					}
					if ("null".equalsIgnoreCase(str)){
						ServletUtility.redirect(ORSView.WELCOME_CTL, request, response);
						return;
					} else {
						ServletUtility.redirect(str, request, response);
						return;
					}

				} else {
					System.out.println("loginctl else");
					bean = (UserBean) populateBean(request);
					ServletUtility.setBean(bean, request);
					ServletUtility.setErrorMessage("Invalid LoginId And Password",request);
				}

			} catch (ApplicationException e) {
				log.error(e);
				System.out.println("loginctl catch");
				ServletUtility.handleException(e, request, response);
				return;
			}

		} else if (OP_SIGN_UP.equalsIgnoreCase(op)) {
			System.out.println("Lctl Do post kya karega re tu");

			ServletUtility.redirect(ORSView.USER_REGISTRATION_CTL, request, response);
			return;
		}

		ServletUtility.forward(getView(),request,response);

		log.debug("loginCtl Method doPost Ended");
	}

	@Override
	protected String getView() {
		return ORSView.LOGIN_VIEW;
	}
}
