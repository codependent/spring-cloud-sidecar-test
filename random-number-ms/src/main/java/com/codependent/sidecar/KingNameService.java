package com.codependent.sidecar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import rx.Observable;

@Service
public class KingNameService {

	private static String[] names = {
		"George",
		"Edward",
		"Joseph",
		"Charles",
		"Phillip",
	};
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public Observable<String> getRandomName(){
		return Observable.create((s)->{
			logger.info("getRandomImage()");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			long random = Math.round(Math.random()*(names.length-1));
			s.onNext(names[(int)random]);
			s.onCompleted();
		});
		
	}
	
}
