package com.bdqn.pojo;


public class Airindex {

  private long id;
  private long did;
  private String time;
  private String pm10;
  private String pm2_5;
  private String station;
  private java.sql.Timestamp mtime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDid() {
    return did;
  }

  public void setDid(long did) {
    this.did = did;
  }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPm10() {
    return pm10;
  }

  public void setPm10(String pm10) {
    this.pm10 = pm10;
  }


  public String getPm2_5() {
    return pm2_5;
  }

  public void setPm2_5(String pm2_5) {
    this.pm2_5 = pm2_5;
  }


  public String getStation() {
    return station;
  }

  public void setStation(String station) {
    this.station = station;
  }


  public java.sql.Timestamp getMtime() {
    return mtime;
  }

  public void setMtime(java.sql.Timestamp mtime) {
    this.mtime = mtime;
  }

}
