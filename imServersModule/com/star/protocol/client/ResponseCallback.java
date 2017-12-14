package com.star.protocol.client;

import com.star.eagleme.protocol.*;

public interface ResponseCallback {

	 void targetIsOffline(DataProtocol reciveMsg);

	 void targetIsOnline(String clientIp);
}
