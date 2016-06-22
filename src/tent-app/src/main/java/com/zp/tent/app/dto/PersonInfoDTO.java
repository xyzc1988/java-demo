package com.zp.tent.app.dto;

import java.io.Serializable;
import java.util.Date;

public class PersonInfoDTO implements Serializable {

	private static final long serialVersionUID = 4063725584941336123L;

	// 帐号
	private String account;

	// 登录IP地址
	private String ip;

	// 登录时间
	private Date loginDate;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof PersonInfoDTO)) {
			return false;
		}
		return account.equalsIgnoreCase(((PersonInfoDTO) obj).getAccount());
	}
}
