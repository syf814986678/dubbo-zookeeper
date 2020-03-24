package com.shiyifan.service;

import javax.mail.MessagingException;

public interface SendMailService {
    public String sendmail(String Title,String text,String sendto,String sendfrom) throws MessagingException;
    public String sendmail(String Title, String text,Boolean multipart,String filename,String filepath,String sendto, String sendfrom)throws MessagingException;
}
