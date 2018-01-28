package org.sarp.ats.urlsigner.crypto;

import org.sarp.ats.urlsigner.enums.SignatureAlgorithm;
import org.sarp.ats.urlsigner.exception.SignatureException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class MacSigner implements Signer {

    private final SignatureAlgorithm signatureAlgorithm;
    private final String secretKey;

    public MacSigner (SignatureAlgorithm signatureAlgorithm, String secretKey) {
        this.signatureAlgorithm = signatureAlgorithm;
        this.secretKey = secretKey;
    }

    public byte[] sign(byte[] data) throws SignatureException {
        Mac mac = getMacInstance();
        return mac.doFinal(data);
    }

    private Mac getMacInstance() {

        Mac mac;
        try {
            mac = Mac.getInstance(signatureAlgorithm.getJcaName());
            Key key = new SecretKeySpec(secretKey.getBytes(), signatureAlgorithm.getJcaName());
            mac.init(key);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new SignatureException(e.getMessage());
        }

        return mac;
    }

}
