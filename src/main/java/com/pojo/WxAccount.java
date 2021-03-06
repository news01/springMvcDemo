package com.pojo;

public class WxAccount {
    /**
     * 主键ID
     */
    private Long waId;

    /**
     * 云能用户ID
     */
    private Long ccUserId;

    /**
     * 云能用户名称
     */
    private String ccUserName;

    /**
     * 云能用户密码
     */
    private String ccUserPwd;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 微信小程序ID
     */
    private String xcxOpenId;

    /**
     * 公众号
     */
    private String mpOpenId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 值为1时是男性，值为2时是女性，值为0时是未知
     */
    private Integer sex;

    /**
     * 用户个人资料填写的省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * 用户头像
     */
    private String headimgurl;

    /**
     * 用户特权信息
     */
    private String privilege;

    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。详见：获取用户个人信息（UnionID机制） 
     */
    private String unionid;

    /**
     * 语言
     */
    private String language;

    /**
     * 预留字段1
     */
    private String attribute1;

    /**
     * 预留字段2
     */
    private String attribute2;

    /**
     * 预留字段3
     */
    private String attribute3;

    /**
     * 预留字段4
     */
    private String attribute4;

    /**
     * 预留字段5
     */
    private String attribute5;

    /**
     * 预留字段6
     */
    private String attribute6;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.wa_id
     *
     * @return the value of wx_account.wa_id
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public Long getWaId() {
        return waId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.wa_id
     *
     * @param waId the value for wx_account.wa_id
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setWaId(Long waId) {
        this.waId = waId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.cc_user_id
     *
     * @return the value of wx_account.cc_user_id
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public Long getCcUserId() {
        return ccUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.cc_user_id
     *
     * @param ccUserId the value for wx_account.cc_user_id
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setCcUserId(Long ccUserId) {
        this.ccUserId = ccUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.cc_user_name
     *
     * @return the value of wx_account.cc_user_name
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getCcUserName() {
        return ccUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.cc_user_name
     *
     * @param ccUserName the value for wx_account.cc_user_name
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setCcUserName(String ccUserName) {
        this.ccUserName = ccUserName == null ? null : ccUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.cc_user_pwd
     *
     * @return the value of wx_account.cc_user_pwd
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getCcUserPwd() {
        return ccUserPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.cc_user_pwd
     *
     * @param ccUserPwd the value for wx_account.cc_user_pwd
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setCcUserPwd(String ccUserPwd) {
        this.ccUserPwd = ccUserPwd == null ? null : ccUserPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.mobile
     *
     * @return the value of wx_account.mobile
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.mobile
     *
     * @param mobile the value for wx_account.mobile
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.email
     *
     * @return the value of wx_account.email
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.email
     *
     * @param email the value for wx_account.email
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.xcx_open_id
     *
     * @return the value of wx_account.xcx_open_id
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getXcxOpenId() {
        return xcxOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.xcx_open_id
     *
     * @param xcxOpenId the value for wx_account.xcx_open_id
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setXcxOpenId(String xcxOpenId) {
        this.xcxOpenId = xcxOpenId == null ? null : xcxOpenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.mp_open_id
     *
     * @return the value of wx_account.mp_open_id
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getMpOpenId() {
        return mpOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.mp_open_id
     *
     * @param mpOpenId the value for wx_account.mp_open_id
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setMpOpenId(String mpOpenId) {
        this.mpOpenId = mpOpenId == null ? null : mpOpenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.real_name
     *
     * @return the value of wx_account.real_name
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.real_name
     *
     * @param realName the value for wx_account.real_name
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.nickname
     *
     * @return the value of wx_account.nickname
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.nickname
     *
     * @param nickname the value for wx_account.nickname
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.sex
     *
     * @return the value of wx_account.sex
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.sex
     *
     * @param sex the value for wx_account.sex
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.province
     *
     * @return the value of wx_account.province
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.province
     *
     * @param province the value for wx_account.province
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.city
     *
     * @return the value of wx_account.city
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.city
     *
     * @param city the value for wx_account.city
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.country
     *
     * @return the value of wx_account.country
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.country
     *
     * @param country the value for wx_account.country
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.headimgurl
     *
     * @return the value of wx_account.headimgurl
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.headimgurl
     *
     * @param headimgurl the value for wx_account.headimgurl
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.privilege
     *
     * @return the value of wx_account.privilege
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.privilege
     *
     * @param privilege the value for wx_account.privilege
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege == null ? null : privilege.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.unionid
     *
     * @return the value of wx_account.unionid
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.unionid
     *
     * @param unionid the value for wx_account.unionid
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.language
     *
     * @return the value of wx_account.language
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.language
     *
     * @param language the value for wx_account.language
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.attribute1
     *
     * @return the value of wx_account.attribute1
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.attribute1
     *
     * @param attribute1 the value for wx_account.attribute1
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.attribute2
     *
     * @return the value of wx_account.attribute2
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.attribute2
     *
     * @param attribute2 the value for wx_account.attribute2
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.attribute3
     *
     * @return the value of wx_account.attribute3
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.attribute3
     *
     * @param attribute3 the value for wx_account.attribute3
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.attribute4
     *
     * @return the value of wx_account.attribute4
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.attribute4
     *
     * @param attribute4 the value for wx_account.attribute4
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.attribute5
     *
     * @return the value of wx_account.attribute5
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.attribute5
     *
     * @param attribute5 the value for wx_account.attribute5
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_account.attribute6
     *
     * @return the value of wx_account.attribute6
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public String getAttribute6() {
        return attribute6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_account.attribute6
     *
     * @param attribute6 the value for wx_account.attribute6
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6 == null ? null : attribute6.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_account
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WxAccount other = (WxAccount) that;
        return (this.getWaId() == null ? other.getWaId() == null : this.getWaId().equals(other.getWaId()))
            && (this.getCcUserId() == null ? other.getCcUserId() == null : this.getCcUserId().equals(other.getCcUserId()))
            && (this.getCcUserName() == null ? other.getCcUserName() == null : this.getCcUserName().equals(other.getCcUserName()))
            && (this.getCcUserPwd() == null ? other.getCcUserPwd() == null : this.getCcUserPwd().equals(other.getCcUserPwd()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getXcxOpenId() == null ? other.getXcxOpenId() == null : this.getXcxOpenId().equals(other.getXcxOpenId()))
            && (this.getMpOpenId() == null ? other.getMpOpenId() == null : this.getMpOpenId().equals(other.getMpOpenId()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getHeadimgurl() == null ? other.getHeadimgurl() == null : this.getHeadimgurl().equals(other.getHeadimgurl()))
            && (this.getPrivilege() == null ? other.getPrivilege() == null : this.getPrivilege().equals(other.getPrivilege()))
            && (this.getUnionid() == null ? other.getUnionid() == null : this.getUnionid().equals(other.getUnionid()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getAttribute1() == null ? other.getAttribute1() == null : this.getAttribute1().equals(other.getAttribute1()))
            && (this.getAttribute2() == null ? other.getAttribute2() == null : this.getAttribute2().equals(other.getAttribute2()))
            && (this.getAttribute3() == null ? other.getAttribute3() == null : this.getAttribute3().equals(other.getAttribute3()))
            && (this.getAttribute4() == null ? other.getAttribute4() == null : this.getAttribute4().equals(other.getAttribute4()))
            && (this.getAttribute5() == null ? other.getAttribute5() == null : this.getAttribute5().equals(other.getAttribute5()))
            && (this.getAttribute6() == null ? other.getAttribute6() == null : this.getAttribute6().equals(other.getAttribute6()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_account
     *
     * @mbggenerated Tue Sep 19 17:45:27 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWaId() == null) ? 0 : getWaId().hashCode());
        result = prime * result + ((getCcUserId() == null) ? 0 : getCcUserId().hashCode());
        result = prime * result + ((getCcUserName() == null) ? 0 : getCcUserName().hashCode());
        result = prime * result + ((getCcUserPwd() == null) ? 0 : getCcUserPwd().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getXcxOpenId() == null) ? 0 : getXcxOpenId().hashCode());
        result = prime * result + ((getMpOpenId() == null) ? 0 : getMpOpenId().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getHeadimgurl() == null) ? 0 : getHeadimgurl().hashCode());
        result = prime * result + ((getPrivilege() == null) ? 0 : getPrivilege().hashCode());
        result = prime * result + ((getUnionid() == null) ? 0 : getUnionid().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getAttribute1() == null) ? 0 : getAttribute1().hashCode());
        result = prime * result + ((getAttribute2() == null) ? 0 : getAttribute2().hashCode());
        result = prime * result + ((getAttribute3() == null) ? 0 : getAttribute3().hashCode());
        result = prime * result + ((getAttribute4() == null) ? 0 : getAttribute4().hashCode());
        result = prime * result + ((getAttribute5() == null) ? 0 : getAttribute5().hashCode());
        result = prime * result + ((getAttribute6() == null) ? 0 : getAttribute6().hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "WxAccount [waId=" + waId + ", ccUserId=" + ccUserId + ", ccUserName=" + ccUserName + ", ccUserPwd="
				+ ccUserPwd + ", mobile=" + mobile + ", email=" + email + ", xcxOpenId=" + xcxOpenId + ", mpOpenId="
				+ mpOpenId + ", realName=" + realName + ", nickname=" + nickname + ", sex=" + sex + ", province="
				+ province + ", city=" + city + ", country=" + country + ", headimgurl=" + headimgurl + ", privilege="
				+ privilege + ", unionid=" + unionid + ", language=" + language + ", attribute1=" + attribute1
				+ ", attribute2=" + attribute2 + ", attribute3=" + attribute3 + ", attribute4=" + attribute4
				+ ", attribute5=" + attribute5 + ", attribute6=" + attribute6 + "]";
	}
	
	
	
    
}