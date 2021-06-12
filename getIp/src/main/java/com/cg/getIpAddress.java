package com.cg;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getIpAddress {

	@GetMapping("/user")
	public ResponseEntity<?> getIp(HttpServletRequest request) {
		if(request != null) {
			Map<String, String> map = new HashMap <String, String>();
			map.compute("ip:", request.getRemoteAddr());
			return ResponseEntity
					.ok(map);
		}else {
			return ResponseEntity
					.status(HttpsStatus.UNAUTHORIZED);
		}
	}
}
