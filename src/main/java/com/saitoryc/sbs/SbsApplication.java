package com.saitoryc.sbs;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.MessageFormat;

@SpringBootApplication
public class SbsApplication {

	public static void main(String[] args) {
		String springProfilesActive = System.getProperty("run.profiles");
		if (!StringUtils.equals(springProfilesActive, "product")
				&& !StringUtils.equals(springProfilesActive, "develop")) {
			throw new UnsupportedOperationException(MessageFormat.format("JVMの起動時引数 -Drun.profilesで develop か product を指定して下さい ( -Dspring.profiles.active={0} )。", springProfilesActive));
		}
		SpringApplication.run(SbsApplication.class, args);
	}
}
