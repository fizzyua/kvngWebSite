package app.service.coder;


import java.io.UnsupportedEncodingException;

public interface CoderService {
    String coderSHA1(String password);

    String encoderUtf8ToRfc5987(String str) throws UnsupportedEncodingException;
}
