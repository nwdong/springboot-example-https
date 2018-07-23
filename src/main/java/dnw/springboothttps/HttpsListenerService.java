package dnw.springboothttps;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsListenerService {

	/**
	 * 
	 * @param iniKey, the distributor key in INI file
	 * @param payload, file content to distribute
	 * @param fileName, the target file name
	 * @return
	 */
	@RequestMapping(value = "/{urlpath}", method= RequestMethod.POST, consumes="text/plain")
	public String handleFile(@PathVariable("urlpath") String urlpath, @RequestBody String reqBody, @RequestHeader(value="REQUEST_HEADER_TEST") String header) {
		return urlpath + ":" + header + ":" + reqBody;
	}
}
