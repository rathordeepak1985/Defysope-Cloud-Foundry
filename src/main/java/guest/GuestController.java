package guest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuestController {
	@Autowired
	private GuestDao guestDao;

	@RequestMapping(value = "/guest")
	public ModelAndView guestbook(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		return new ModelAndView("guest.jsp");
	}

	@RequestMapping(value = "/logincheck")
	public ModelAndView loginCheck(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		Map<String, Object> model = new HashMap<String, Object>();
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("password");
		if (userName.equalsIgnoreCase("deepak")
				&& passWord.equalsIgnoreCase("sofy")) {

		}
		model.put("success", true);
		model.put("success1", true);
		//return new ModelAndView("guest.jsp", model);
		return new ModelAndView("jsonView", model);
	}
}