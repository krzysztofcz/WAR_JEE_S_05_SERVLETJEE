package pl.coderslab.action;

import javax.servlet.http.Cookie;

public class CookieHelper {

	static public Cookie getCookie(String cookieName, Cookie[] cookies) {
		for(Cookie c:cookies) {
			if(cookieName.equals(c.getName())) {
				return c;
			}
		}
		return null;
	}
	
}
