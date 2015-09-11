/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.rest.internal.resources;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.atmosphere.cpr.HeaderConfig;

public class ResponseTypeHelper {
	
	public String getResponseType(HttpServletRequest request) {
		List<MediaType> mediaTypes = getAcceptedMediaTypes(request);
		String type = getQueryParam(request, "type");		
		String responseType = MediaTypeHelper.getResponseMediaType(mediaTypes, type);
		return responseType;
	}

	protected List<MediaType> getAcceptedMediaTypes(HttpServletRequest request) {
		// TODO: these are not the headers, there are query params inside
		final String acceptHeader = request.getHeader(HttpHeaders.ACCEPT);
		if (acceptHeader != null) {
			String[] acceptableMediaTypes = acceptHeader.split(",");
			List<MediaType> mediaTypes = new ArrayList<MediaType>(acceptableMediaTypes.length);
			for(String type : acceptableMediaTypes) {
				MediaType mediaType = MediaType.valueOf(type.trim());
				if(mediaType!=null) {
					mediaTypes.add(mediaType);
				}
			}
			return mediaTypes;
		} else {
			return new ArrayList<MediaType>();
		}
	}

	public String getQueryParam(HttpServletRequest request, String paramName) {
		if(request.getQueryString()==null) return null;
		String[] pairs = request.getQueryString().split("&");
		for(String pair : pairs) {
			String[] keyValue = pair.split("=");
			if(keyValue[0].trim().equals(paramName)) {
				return keyValue[1].trim();
			}
		}
		return null;
	}

	protected String getQueryParam(HttpServletRequest request, String paramName, String defaultValue) {
		String value = getQueryParam(request, paramName);
		return value!=null ? value : defaultValue;
	}
	
	/**
	 * Returns a boolean. The method detects if the underlying connection should be resumed after broadcast
	 * 
	 * @param request the HttpServletRequest
	 * @return boolean
	 */
	public static boolean isStreamingTransport(HttpServletRequest request) {
		final String transport = request.getHeader(HeaderConfig.X_ATMOSPHERE_TRANSPORT);
		final String upgrade = request.getHeader(HeaderConfig.WEBSOCKET_UPGRADE);
		if (HeaderConfig.WEBSOCKET_TRANSPORT.equalsIgnoreCase(transport)
				|| HeaderConfig.STREAMING_TRANSPORT.equalsIgnoreCase(transport)
				|| HeaderConfig.WEBSOCKET_TRANSPORT.equalsIgnoreCase(upgrade)) {
			return true;
		} else {
			return false;
		}
	}

}
