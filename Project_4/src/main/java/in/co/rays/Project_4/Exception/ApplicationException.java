package in.co.rays.Project_4.Exception;


/**
 *ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 * @author  Darshan Jain
 *
 */
public class ApplicationException extends Exception {

	public ApplicationException(String msg) {
		super(msg);
	}
}
