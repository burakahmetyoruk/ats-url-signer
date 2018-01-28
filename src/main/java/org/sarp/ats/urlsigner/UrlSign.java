package org.sarp.ats.urlsigner;

public final class UrlSign {

    private UrlSign () {}

    public static AtsSignedUrlBuilder builder() {
        return new AtsSignedUrlBuilder();
    }
}
