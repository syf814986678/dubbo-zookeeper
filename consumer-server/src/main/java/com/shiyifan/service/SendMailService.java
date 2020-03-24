package com.shiyifan.service;

public interface SendMailService {
    public String sendmail(String Title, String text, String sendto, String sendfrom);
    public String sendmail(String Title, String text, Boolean multipart, String filename, String filepath, String sendto, String sendfrom);
}
