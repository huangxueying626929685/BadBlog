package com.xing.entity;

import java.util.Date;

public class History {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.hid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private Integer hid;


    private String ip;

    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.uid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.description
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.gmt_record
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private Date gmtRecord;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.hid
     *
     * @return the value of history.hid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.hid
     *
     * @param hid the value for history.hid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.uid
     *
     * @return the value of history.uid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.uid
     *
     * @param uid the value for history.uid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.description
     *
     * @return the value of history.description
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.description
     *
     * @param description the value for history.description
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.gmt_record
     *
     * @return the value of history.gmt_record
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public Date getGmtRecord() {
        return gmtRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.gmt_record
     *
     * @param gmtRecord the value for history.gmt_record
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setGmtRecord(Date gmtRecord) {
        this.gmtRecord = gmtRecord;
    }
}