package org.sarp.ats.urlsigner.crypto;

import org.sarp.ats.urlsigner.exception.SignatureException;

public interface Signer {

    byte[] sign(byte[] data) throws SignatureException;

}
