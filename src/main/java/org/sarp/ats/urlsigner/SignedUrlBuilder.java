package org.sarp.ats.urlsigner;

import org.sarp.ats.urlsigner.enums.SignatureAlgorithm;
import org.sarp.ats.urlsigner.enums.SigningPart;

import java.util.concurrent.TimeUnit;

public interface SignedUrlBuilder {

    SignedUrlBuilder setContentUrl(String contentUrl);

    SignedUrlBuilder setTimeToLive(int timeToLive, TimeUnit timeUnit);

    SignedUrlBuilder setClientIp(String clientIp);

    SignedUrlBuilder setParts(SigningPart signingPart);

    SignedUrlBuilder signWith(SignatureAlgorithm signatureAlgorithm, String secretKey, int keyIndex);

    String compact();

}

