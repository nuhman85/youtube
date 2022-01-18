package com.nuhman.youtube.Exception;

public class FileStorageException  extends RuntimeException {
    public FileStorageException(String s) {
        super(s);
    }
    public FileStorageException(String s, Throwable e) {
        super(s, e);
    }
}
