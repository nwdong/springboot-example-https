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
	@RequestMapping(value = "/{inikey}", method= RequestMethod.POST, consumes="text/plain")
	public String handleFile(@PathVariable("inikey") String iniKey, @RequestBody String payload, @RequestHeader(value="TARGET_FILE_NAME") String fileName) {
		return iniKey + ":" + fileName + ":" + payload;
	}
}
