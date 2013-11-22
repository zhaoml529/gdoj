package com.gdoj.mail.service;

import java.util.List;

import com.gdoj.mail.vo.Mail;

public interface MailService {
	public void save(Mail mail);
	public List<Mail> queryMails(int from,int pageSize,String sql);
	public Mail queryMail(Integer mailId);
	public Integer countMails(String sql);
	public void changeStatus(Integer mailId);
}
