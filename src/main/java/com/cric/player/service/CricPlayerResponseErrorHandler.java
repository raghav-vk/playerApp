package com.cric.player.service;

import java.io.IOException;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public class CricPlayerResponseErrorHandler  implements ResponseErrorHandler {

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
	}

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		// Ignore OBI http header response. It returns 500 with valid response body
		return false;
	}

}
